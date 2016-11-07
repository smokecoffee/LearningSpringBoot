package koga.automobile.service;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.JdbcTemplate;

import koga.automobile.model.CanDetailData;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Autowired
    public DataSource dataSource;

    // tag::readerwriterprocessor[]
    @Bean
    public FlatFileItemReader<CanDetailData> reader() {
    	
    	System.out.println("read file item");
        FlatFileItemReader<CanDetailData> reader = new FlatFileItemReader<CanDetailData>();
        reader.setResource(new ClassPathResource("csv/sample-data4.csv"));
        reader.setLinesToSkip(1);
        System.out.println("XXXXXx");
        reader.setLineMapper(new DefaultLineMapper<CanDetailData>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[] {"testId", "frameNo", "mapLatitude","mapLongitude", "testYyddmm", "testHhmmss", "drivingTime" });
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<CanDetailData>() {{
                setTargetType(CanDetailData.class);
            }});
        }});
        return reader;
    }

    @Bean
    public CanDetailDataItemProcessor processor() { 
        return new CanDetailDataItemProcessor();
    }
    
    @Bean
    public JdbcBatchItemWriter<CanDetailData> writer() {
    	System.out.println("write to db");
        JdbcBatchItemWriter<CanDetailData> writer = new JdbcBatchItemWriter<CanDetailData>();
        writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<CanDetailData>());
        //writer.setSql("INSERT INTO CAN_DETAIL_DATA (testId, frameNo, mapLatitude) VALUES (:testId, :frameNo, :mapLatitude)");
        writer.setSql("INSERT INTO CAN_DETAIL_DATA (testId, frameNo, mapLatitude, mapLongitude, testYyddmm, testHhmmss, drivingTime) VALUES (:testId, :frameNo, :mapLatitude, :mapLongitude, :testYyddmm, :testHhmmss, :drivingTime)");
        writer.setDataSource(dataSource);
        return writer;
    }
    // end::readerwriterprocessor[]

    // tag::jobstep[]
    @Bean
    public Job importUserJob(JobCompletionNotificationListener listener) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1())
                .end()
                .build();
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<CanDetailData, CanDetailData> chunk(10)
                .reader(reader())
                .processor(processor())
                //.writer(null)
                .writer(writer())
                .build();
    }
    // end::jobstep[]
}
