

//avgload我也不知道是啥

create database monitor;

create table registerlog(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name varchar(20),
	os varchar(20),
	cpucount INT,
	ontime DATETIME,
	offtime DATETIME
);

insert into registerlog(name,os,cpucount,ontime,offtime) values('zhangsan','MacOS',8,"2000-01-01 00:00:00","2000-01-02 00:00:00");

create table online(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ip varchar(20),
	name varchar(20),
	os varchar(20),
	cpucount INT,
	status varchar(20),
	ontime DATETIME
);

insert into online(name,ip,os,cpucount,status,ontime) values('lisi','192.168.1.2','MacOS',8,"good","2000-01-02 00:00:00");