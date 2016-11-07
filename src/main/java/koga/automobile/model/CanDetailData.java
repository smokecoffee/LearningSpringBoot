package koga.automobile.model;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CanDetailData {
	// testId,frameNo,mapLatitude,mapLongitude,testYyddmm,testHhmmss,drivingTime
	private String testId;
	private Integer frameNo;
	private Double mapLatitude;
	private Double mapLongitude;
	private String testYyddmm;
	private String testHhmmss;
	private String drivingTime;

	public CanDetailData() {

	}

	public CanDetailData(String testId, Integer frameNo, Double mapLatitude, Double mapLongitude, String testYyddmm,
			String testHhmmss, String drivingTime) {
		this.testId = testId;
		this.frameNo = frameNo;
		this.mapLatitude = mapLatitude;
		this.mapLongitude = mapLongitude;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy", Locale.JAPANESE);
		LocalDate localDate = LocalDate.parse(testYyddmm, formatter);
		this.testYyddmm = Date.valueOf(localDate).toString();

		
		//this.testYyddmm = testYyddmm;
		this.testHhmmss = testHhmmss;
		this.drivingTime = drivingTime;

	}

	public CanDetailData(String testId, String frameNo, String mapLatitude, String mapLongitude, String testYyddmm,
			String testHhmmss, String drivingTime) throws ParseException {
		System.out.println("test: ===" + drivingTime);
		this.testId = testId;
		this.frameNo = Integer.parseInt(frameNo);
		this.mapLatitude = Double.parseDouble(mapLatitude);
		this.mapLongitude = Double.parseDouble(mapLongitude);

		/*
		this.testYyddmm = Date.valueOf(testYyddmm);
		this.testHhmmss = Time.valueOf(testHhmmss);
		this.drivingTime = Time.valueOf(drivingTime);*/

		// this.testHhmmss = new SimpleDateFormat("HH:mm:ss",
		// Locale.ENGLISH).parse(testHhmmss);
		// this.drivingTime = new SimpleDateFormat("HH:mm:ss",
		// Locale.ENGLISH).parse(drivingTime);
		this.testYyddmm = testYyddmm;
		this.testHhmmss = testHhmmss;
		this.drivingTime = drivingTime;
	}

	public String getTestId() {
		return testId;
	}

	public void setTestId(String testId) {
		this.testId = testId;
	}

	public Integer getFrameNo() {
		return frameNo;
	}

	public void setFrameNo(Integer frameNo) {
		this.frameNo = frameNo;
	}

	public Double getMapLatitude() {
		return mapLatitude;
	}

	public void setMapLatitude(Double mapLatitude) {
		this.mapLatitude = mapLatitude;
	}

	public Double getMapLongitude() {
		return mapLongitude;
	}

	public void setMapLongitude(Double mapLongitude) {
		this.mapLongitude = mapLongitude;
	}

	public String getTestYyddmm() {
		return testYyddmm;
	}

	public void setTestYyddmm(String testYyddmm) {
		this.testYyddmm = testYyddmm;
	}

	public String getTestHhmmss() {
		return testHhmmss;
	}

	public void setTestHhmmss(String testHhmmss) {
		this.testHhmmss = testHhmmss;
	}

	public String getDrivingTime() {
		return drivingTime;
	}

	public void setDrivingTime(String drivingTime) {
		this.drivingTime = drivingTime;
	}

	@Override
	public String toString() {
		// testId,frameNo,mapLatitude,mapLongitude,testYyddmm,testHhmmss,drivingTime
		return "testId: " + testId + ", frameNo: " + frameNo + ", mapLatitude: " + mapLatitude + ", mapLongitude: "
				+ mapLongitude + ", testYyddmm: " + testYyddmm + ", testHhmmss: " + testHhmmss + ", drivingTime: "
				+ drivingTime;
	}

}
