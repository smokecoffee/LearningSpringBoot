-- user=root, password=root
Create database playground;
Create table `movie`(
    `id` int(3) NOT NULL AUTO_INCREMENT, 
    `title` VARCHAR(100) NOT NULL, 
    `year` int (4), 
    primary key (`id`)
);
CREATE TABLE IF NOT EXISTS people  (
    person_id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);

-- CREATE TABLE IF NOT EXISTS CAN_DETAIL_DATA  (
--     testId BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
--     frameNo VARCHAR(20),
--     mapLatitude VARCHAR(20)
-- );

-- CREATE TABLE IF NOT EXISTS CAN_DETAIL_DATA  (
--     testId VARCHAR(20) NOT NULL PRIMARY KEY,
--     frameNo VARCHAR(20),
--     mapLatitude VARCHAR(20)
-- );

--testId,frameNo,mapLatitude,mapLongitude,testYyddmm,testHhmmss,drivingTime
CREATE TABLE IF NOT EXISTS CAN_DETAIL_DATA  (
    id BIGINT(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    testId VARCHAR(20) NOT NULL,
    frameNo VARCHAR(20),
    mapLatitude VARCHAR(20),
    mapLongitude VARCHAR(20),
    testYyddmm VARCHAR(20),
    testHhmmss VARCHAR(20),
    drivingTime VARCHAR(20)
);
