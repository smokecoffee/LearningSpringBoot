package koga.automobile.service;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import koga.automobile.model.CanDetailData;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

	private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
			log.info("!!! JOB FINISHED! Time to verify the results");

			List<CanDetailData> results = jdbcTemplate.query("SELECT testId,frameNo,mapLatitude,mapLongitude,testYyddmm,testHhmmss,drivingTime FROM CAN_DETAIL_DATA ", new RowMapper<CanDetailData>() {
				@Override
				public CanDetailData mapRow(ResultSet rs, int row) throws SQLException {
					System.out.println("test: ===" + rs.getString(7));
					try {
						String testId = rs.getString(1);
						System.out.println(testId);
						String frameNo = rs.getString(2);
						String mapLatitude =rs.getString(3);
						String mapLongitude = rs.getString(4);
						String testYyddmm = rs.getString(5);
						String testHhmmss = rs.getString(6);
						String drivingTime = rs.getString(7);
						return new CanDetailData(testId,frameNo,mapLatitude,mapLongitude,testYyddmm,testHhmmss,drivingTime);
					} catch (ParseException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return null;
				}
			});

			for (CanDetailData data : results) {
				log.info("Found <" + data + "> in the database.");
			}

		}
	}
}
