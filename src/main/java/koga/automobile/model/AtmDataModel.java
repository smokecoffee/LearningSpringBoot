/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koga.automobile.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author truonggn
 */
//@Entity
//@Table(name = "can_detail_data")
public class AtmDataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long _id;
    private String testId;
    private int frameNo;
    private int frameNoImage;
    private double rollAngularSpeed;
    private double pitchAngularSpeed;
    private double yoAngularSpeed;
    private double accelerationX;
    private double accelerationY;
    private double accelerationZ;
    private double accelerationXLowpass;
    private double accelerationYLowpass;
    private double accelerationZLowpass;
    private double rollAngle;
    private double pitchAngle;
    private double yoAngle;
    private double gpsLatitude;
    private double gpsLongitude;
    private double gpsSpeed;
    private double gpsDirection;
    private int gpsAltitude;
    private int gpsSatelite;
    private int gpsError;
    private double mapLatitude;
    private double mapLongitude;
    private String mapLatitudeDeg;
    private String mapLongitudeDeg;
    private double mapRefDist;
    private int mapREFID;
    private int speedPerHour;
    private double speedPerHourLowpass;
    private double driveMeter;
    private double driveMeterLowpass;
    private String testYyddmm;
    private String testHhmmss;
    private double brakeVal;
    private int brakeOnOff;
    private double acceleratorVal;
    private int acceleratorOnOff;
    private int shift;
    private int overdriveOff;
    private int winkerRight;
    private int winkerLeft;
    private int hazardOnOff;
    private int brakelamp;
    private int wiper;
    private int headlamp;
    private int steeringAngleTurn;
    private int brake;
    private int accelerator;
    private double steeringAngle;
    private double aheadDistance;
    private double aheadRelativitySpeed;
    private double aheadSpeed;
    private double successionDistance;
    private double successionRelativitySpeed;
    private double successionSpeed;
    private String driving1Speed;
    private String driving1Steering;
    private String driving11Speed;
    private String driving11Steering;
    private String driving2Speed;
    private String driving2Steering;
    private String driving3SpeedPre;
    private String driving3Speed;
    private String driving3SteeringPre;
    private String driving3Steering;
    private String driving3Curve;
    private String driving3Crossing;
    private String driving3SteeringMapPre;
    private String driving3SteeringMap;

    public long getId() {
        return _id;
    }

    public void setId(long _id) {
        this._id = _id;
    }

    public String getTestId() {
        return testId;
    }

    public void setTestId(String testId) {
        this.testId = testId;
    }

    public int getFrameNo() {
        return frameNo;
    }

    public void setFrameNo(int frameNo) {
        this.frameNo = frameNo;
    }

    public int getFrameNoImage() {
        return frameNoImage;
    }

    public void setFrameNoImage(int frameNoImage) {
        this.frameNoImage = frameNoImage;
    }

    public double getRollAngularSpeed() {
        return rollAngularSpeed;
    }

    public void setRollAngularSpeed(double rollAngularSpeed) {
        this.rollAngularSpeed = rollAngularSpeed;
    }

    public double getPitchAngularSpeed() {
        return pitchAngularSpeed;
    }

    public void setPitchAngularSpeed(double pitchAngularSpeed) {
        this.pitchAngularSpeed = pitchAngularSpeed;
    }

    public double getYoAngularSpeed() {
        return yoAngularSpeed;
    }

    public void setYoAngularSpeed(double yoAngularSpeed) {
        this.yoAngularSpeed = yoAngularSpeed;
    }

    public double getAccelerationX() {
        return accelerationX;
    }

    public void setAccelerationX(double accelerationX) {
        this.accelerationX = accelerationX;
    }

    public double getAccelerationY() {
        return accelerationY;
    }

    public void setAccelerationY(double accelerationY) {
        this.accelerationY = accelerationY;
    }

    public double getAccelerationZ() {
        return accelerationZ;
    }

    public void setAccelerationZ(double accelerationZ) {
        this.accelerationZ = accelerationZ;
    }

    public double getAccelerationXLowpass() {
        return accelerationXLowpass;
    }

    public void setAccelerationXLowpass(double accelerationXLowpass) {
        this.accelerationXLowpass = accelerationXLowpass;
    }

    public double getAccelerationYLowpass() {
        return accelerationYLowpass;
    }

    public void setAccelerationYLowpass(double accelerationYLowpass) {
        this.accelerationYLowpass = accelerationYLowpass;
    }

    public double getAccelerationZLowpass() {
        return accelerationZLowpass;
    }

    public void setAccelerationZLowpass(double accelerationZLowpass) {
        this.accelerationZLowpass = accelerationZLowpass;
    }

    public double getRollAngle() {
        return rollAngle;
    }

    public void setRollAngle(double rollAngle) {
        this.rollAngle = rollAngle;
    }

    public double getPitchAngle() {
        return pitchAngle;
    }

    public void setPitchAngle(double pitchAngle) {
        this.pitchAngle = pitchAngle;
    }

    public double getYoAngle() {
        return yoAngle;
    }

    public void setYoAngle(double yoAngle) {
        this.yoAngle = yoAngle;
    }

    public double getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(double gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public double getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(double gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public double getGpsSpeed() {
        return gpsSpeed;
    }

    public void setGpsSpeed(double gpsSpeed) {
        this.gpsSpeed = gpsSpeed;
    }

    public double getGpsDirection() {
        return gpsDirection;
    }

    public void setGpsDirection(double gpsDirection) {
        this.gpsDirection = gpsDirection;
    }

    public int getGpsAltitude() {
        return gpsAltitude;
    }

    public void setGpsAltitude(int gpsAltitude) {
        this.gpsAltitude = gpsAltitude;
    }

    public int getGpsSatelite() {
        return gpsSatelite;
    }

    public void setGpsSatelite(int gpsSatelite) {
        this.gpsSatelite = gpsSatelite;
    }

    public int getGpsError() {
        return gpsError;
    }

    public void setGpsError(int gpsError) {
        this.gpsError = gpsError;
    }

    public double getMapLatitude() {
        return mapLatitude;
    }

    public void setMapLatitude(double mapLatitude) {
        this.mapLatitude = mapLatitude;
    }

    public double getMapLongitude() {
        return mapLongitude;
    }

    public void setMapLongitude(double mapLongitude) {
        this.mapLongitude = mapLongitude;
    }

    public String getMapLatitudeDeg() {
        return mapLatitudeDeg;
    }

    public void setMapLatitudeDeg(String mapLatitudeDeg) {
        this.mapLatitudeDeg = mapLatitudeDeg;
    }

    public String getMapLongitudeDeg() {
        return mapLongitudeDeg;
    }

    public void setMapLongitudeDeg(String mapLongitudeDeg) {
        this.mapLongitudeDeg = mapLongitudeDeg;
    }

    public double getMapRefDist() {
        return mapRefDist;
    }

    public void setMapRefDist(double mapRefDist) {
        this.mapRefDist = mapRefDist;
    }

    public int getMapREFID() {
        return mapREFID;
    }

    public void setMapREFID(int mapREFID) {
        this.mapREFID = mapREFID;
    }

    public int getSpeedPerHour() {
        return speedPerHour;
    }

    public void setSpeedPerHour(int speedPerHour) {
        this.speedPerHour = speedPerHour;
    }

    public double getSpeedPerHourLowpass() {
        return speedPerHourLowpass;
    }

    public void setSpeedPerHourLowpass(double speedPerHourLowpass) {
        this.speedPerHourLowpass = speedPerHourLowpass;
    }

    public double getDriveMeter() {
        return driveMeter;
    }

    public void setDriveMeter(double driveMeter) {
        this.driveMeter = driveMeter;
    }

    public double getDriveMeterLowpass() {
        return driveMeterLowpass;
    }

    public void setDriveMeterLowpass(double driveMeterLowpass) {
        this.driveMeterLowpass = driveMeterLowpass;
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

    public double getBrakeVal() {
        return brakeVal;
    }

    public void setBrakeVal(double brakeVal) {
        this.brakeVal = brakeVal;
    }

    public int getBrakeOnOff() {
        return brakeOnOff;
    }

    public void setBrakeOnOff(int brakeOnOff) {
        this.brakeOnOff = brakeOnOff;
    }

    public double getAcceleratorVal() {
        return acceleratorVal;
    }

    public void setAcceleratorVal(double acceleratorVal) {
        this.acceleratorVal = acceleratorVal;
    }

    public int getAcceleratorOnOff() {
        return acceleratorOnOff;
    }

    public void setAcceleratorOnOff(int acceleratorOnOff) {
        this.acceleratorOnOff = acceleratorOnOff;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public int getOverdriveOff() {
        return overdriveOff;
    }

    public void setOverdriveOff(int overdriveOff) {
        this.overdriveOff = overdriveOff;
    }

    public int getWinkerRight() {
        return winkerRight;
    }

    public void setWinkerRight(int winkerRight) {
        this.winkerRight = winkerRight;
    }

    public int getWinkerLeft() {
        return winkerLeft;
    }

    public void setWinkerLeft(int winkerLeft) {
        this.winkerLeft = winkerLeft;
    }

    public int getHazardOnOff() {
        return hazardOnOff;
    }

    public void setHazardOnOff(int hazardOnOff) {
        this.hazardOnOff = hazardOnOff;
    }

    public int getBrakelamp() {
        return brakelamp;
    }

    public void setBrakelamp(int brakelamp) {
        this.brakelamp = brakelamp;
    }

    public int getWiper() {
        return wiper;
    }

    public void setWiper(int wiper) {
        this.wiper = wiper;
    }

    public int getHeadlamp() {
        return headlamp;
    }

    public void setHeadlamp(int headlamp) {
        this.headlamp = headlamp;
    }

    public int getSteeringAngleTurn() {
        return steeringAngleTurn;
    }

    public void setSteeringAngleTurn(int steeringAngleTurn) {
        this.steeringAngleTurn = steeringAngleTurn;
    }

    public int getBrake() {
        return brake;
    }

    public void setBrake(int brake) {
        this.brake = brake;
    }

    public int getAccelerator() {
        return accelerator;
    }

    public void setAccelerator(int accelerator) {
        this.accelerator = accelerator;
    }

    public double getSteeringAngle() {
        return steeringAngle;
    }

    public void setSteeringAngle(double steeringAngle) {
        this.steeringAngle = steeringAngle;
    }

    public double getAheadDistance() {
        return aheadDistance;
    }

    public void setAheadDistance(double aheadDistance) {
        this.aheadDistance = aheadDistance;
    }

    public double getAheadRelativitySpeed() {
        return aheadRelativitySpeed;
    }

    public void setAheadRelativitySpeed(double aheadRelativitySpeed) {
        this.aheadRelativitySpeed = aheadRelativitySpeed;
    }

    public double getAheadSpeed() {
        return aheadSpeed;
    }

    public void setAheadSpeed(double aheadSpeed) {
        this.aheadSpeed = aheadSpeed;
    }

    public double getSuccessionDistance() {
        return successionDistance;
    }

    public void setSuccessionDistance(double successionDistance) {
        this.successionDistance = successionDistance;
    }

    public double getSuccessionRelativitySpeed() {
        return successionRelativitySpeed;
    }

    public void setSuccessionRelativitySpeed(double successionRelativitySpeed) {
        this.successionRelativitySpeed = successionRelativitySpeed;
    }

    public double getSuccessionSpeed() {
        return successionSpeed;
    }

    public void setSuccessionSpeed(double successionSpeed) {
        this.successionSpeed = successionSpeed;
    }

    public String getDriving1Speed() {
        return driving1Speed;
    }

    public void setDriving1Speed(String driving1Speed) {
        this.driving1Speed = driving1Speed;
    }

    public String getDriving1Steering() {
        return driving1Steering;
    }

    public void setDriving1Steering(String driving1Steering) {
        this.driving1Steering = driving1Steering;
    }

    public String getDriving11Speed() {
        return driving11Speed;
    }

    public void setDriving11Speed(String driving11Speed) {
        this.driving11Speed = driving11Speed;
    }

    public String getDriving11Steering() {
        return driving11Steering;
    }

    public void setDriving11Steering(String driving11Steering) {
        this.driving11Steering = driving11Steering;
    }

    public String getDriving2Speed() {
        return driving2Speed;
    }

    public void setDriving2Speed(String driving2Speed) {
        this.driving2Speed = driving2Speed;
    }

    public String getDriving2Steering() {
        return driving2Steering;
    }

    public void setDriving2Steering(String driving2Steering) {
        this.driving2Steering = driving2Steering;
    }

    public String getDriving3SpeedPre() {
        return driving3SpeedPre;
    }

    public void setDriving3SpeedPre(String driving3SpeedPre) {
        this.driving3SpeedPre = driving3SpeedPre;
    }

    public String getDriving3Speed() {
        return driving3Speed;
    }

    public void setDriving3Speed(String driving3Speed) {
        this.driving3Speed = driving3Speed;
    }

    public String getDriving3SteeringPre() {
        return driving3SteeringPre;
    }

    public void setDriving3SteeringPre(String driving3SteeringPre) {
        this.driving3SteeringPre = driving3SteeringPre;
    }

    public String getDriving3Steering() {
        return driving3Steering;
    }

    public void setDriving3Steering(String driving3Steering) {
        this.driving3Steering = driving3Steering;
    }

    public String getDriving3Curve() {
        return driving3Curve;
    }

    public void setDriving3Curve(String driving3Curve) {
        this.driving3Curve = driving3Curve;
    }

    public String getDriving3Crossing() {
        return driving3Crossing;
    }

    public void setDriving3Crossing(String driving3Crossing) {
        this.driving3Crossing = driving3Crossing;
    }

    public String getDriving3SteeringMapPre() {
        return driving3SteeringMapPre;
    }

    public void setDriving3SteeringMapPre(String driving3SteeringMapPre) {
        this.driving3SteeringMapPre = driving3SteeringMapPre;
    }

    public String getDriving3SteeringMap() {
        return driving3SteeringMap;
    }

    public void setDriving3SteeringMap(String driving3SteeringMap) {
        this.driving3SteeringMap = driving3SteeringMap;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

}
