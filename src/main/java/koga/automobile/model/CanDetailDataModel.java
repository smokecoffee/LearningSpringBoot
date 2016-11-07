package koga.automobile.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "CAN_DETAIL_DATA")
public class CanDetailDataModel {
	// testId,frameNo,mapLatitude,mapLongitude,testYyddmm,testHhmmss,drivingTime
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String testId;
	private Integer frameNo;
	private Double mapLatitude;
	private Double mapLongitude;
	
	private Date testYyddmm;
	
	
	
	@DateTimeFormat(pattern = "HH:mm:ss")
	private Time testHhmmss;
	
	@DateTimeFormat(pattern = "HH:mm:ss")
	private Time drivingTime;

	public CanDetailDataModel() {

	}

	public CanDetailDataModel(String testId, Integer frameNo, Double mapLatitude, Double mapLongitude, Date testYyddmm,
			Time testHhmmss, Time drivingTime) {
		this.testId = testId;
		this.frameNo = frameNo;
		this.mapLatitude = mapLatitude;
		this.mapLongitude = mapLongitude;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public Date getTestYyddmm() {
		return testYyddmm;
	}

	public void setTestYyddmm(Date testYyddmm) {
		this.testYyddmm = testYyddmm;
	}

	public Time getTestHhmmss() {
		return testHhmmss;
	}

	public void setTestHhmmss(Time testHhmmss) {
		this.testHhmmss = testHhmmss;
	}

	public Time getDrivingTime() {
		return drivingTime;
	}

	public void setDrivingTime(Time drivingTime) {
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
