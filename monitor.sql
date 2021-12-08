


create database monitor;

//所有的设备信息
create table equipment(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name varchar(20),
	os varchar(20),
	maxcount INT,
	status tinyint(1)
);

insert into equipment(name,os,maxcount,status) values('设备1','MacOS',10,1);
insert into equipment(name,os,maxcount,status) values('设备2','MacOS',20,1);
insert into equipment(name,os,maxcount,status) values('设备3','MacOS',22,1);
insert into equipment(name,os,maxcount,status) values('设备4','MacOS',50,1);

//当前的设备状态信息
create table equipment_info(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ip varchar(20),
	name varchar(20),
	os varchar(20),
	maxcount INT,
	nowcount INT,
	ontime DATETIME
);

insert into equipment_info(name,ip,os,maxcount,nowcount,ontime) values('设备1','192.168.1.1','MacOS',10,6,"2000-01-02 00:00:00");

insert into equipment_info(name,ip,os,maxcount,nowcount,ontime) values('设备2','192.168.1.2','MacOS',20,15,"2000-01-02 00:00:00");

insert into equipment_info(name,ip,os,maxcount,nowcount,ontime) values('设备3','192.168.1.3','MacOS',22,13,"2000-01-02 00:00:00");

insert into equipment_info(name,ip,os,maxcount,nowcount,ontime) values('设备4','192.168.1.4','MacOS',50,44,"2000-01-02 00:00:00");

//记录表，用于画折线图
create table equipment_log(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	equipmentname varchar(20),
	time DATETIME,
	count INT
);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 3:00:00",3);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 4:00:00",4);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 5:00:00",5);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 6:00:00",7);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 7:00:00",10);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 8:00:00",7);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 9:00:00",6);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 10:00:00",9);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 11:00:00",5);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 12:00:00",2);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 13:00:00",4);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 14:00:00",9);
insert into equipment_log(equipmentname,time,count) values("设备1","2021-12-03 15:00:00",2);

insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 3:00:00",4);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 4:00:00",6);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 5:00:00",3);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 6:00:00",10);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 7:00:00",11);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 8:00:00",12);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 9:00:00",14);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 10:00:00",15);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 11:00:00",18);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 12:00:00",19);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 13:00:00",12);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 14:00:00",3);
insert into equipment_log(equipmentname,time,count) values("设备2","2021-12-03 15:00:00",5);

insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 3:00:00",12);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 4:00:00",14);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 5:00:00",15);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 6:00:00",10);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 7:00:00",11);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 8:00:00",12);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 9:00:00",13);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 10:00:00",5);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 11:00:00",6);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 12:00:00",8);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 13:00:00",7);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 14:00:00",2);
insert into equipment_log(equipmentname,time,count) values("设备3","2021-12-03 15:00:00",0);

insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 3:00:00",5);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 4:00:00",4);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 5:00:00",6);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 6:00:00",7);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 7:00:00",9);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 8:00:00",3);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 9:00:00",6);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 10:00:00",8);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 11:00:00",12);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 12:00:00",13);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 13:00:00",5);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 14:00:00",7);
insert into equipment_log(equipmentname,time,count) values("设备4","2021-12-03 15:00:00",4);


//客户端的数据库信息
create table client(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ip varchar(20),
	name varchar(20),
	equipmentname varchar(20),
	ontime DATETIME,
	offtime DATETIME
);