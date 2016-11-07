package koga.automobile.service;

import java.sql.Date;
import java.sql.Time;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import koga.automobile.model.CanDetailData;

public class CanDetailDataItemProcessor implements ItemProcessor<CanDetailData, CanDetailData> {

	private static final Logger log = LoggerFactory.getLogger(CanDetailDataItemProcessor.class);

	@Override
	public CanDetailData process(final CanDetailData canDetailData) throws Exception {
		// get information got from csv and modify whatever we want then save to another object to prepare save db
		final String testId = canDetailData.getTestId().toUpperCase(); 
		final Integer frameNo = canDetailData.getFrameNo();
		final Double mapLatitude = canDetailData.getMapLatitude();
		final Double mapLongitude = canDetailData.getMapLongitude(); 
		final String testYyddmm = canDetailData.getTestYyddmm(); 
		
		final String testHhmmss = canDetailData.getTestHhmmss(); 
		final String drivingTime = canDetailData.getDrivingTime(); 
		log.info("Pre Converting (" + canDetailData + ")");
		final CanDetailData transformedData = new CanDetailData(testId, frameNo, mapLatitude,mapLongitude,testYyddmm,testHhmmss,drivingTime);

		log.info("Converting (" + canDetailData + ") into (" + transformedData + ")");

		return transformedData;
	}

}
