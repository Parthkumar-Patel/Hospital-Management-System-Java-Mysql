use HMS;

drop table if exists Registration;
create table Registration (
  Username varchar(10) primary key not null,
  Password varchar(20) not null,
  NameOfUser varchar(20) not null,
  ContactNo varchar(10) not null,
  Email varchar(20) 
);
insert into Registration values("Admin","12345678","Admin","1234567890","admin@gmail.com");
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS Users;
create table Users (
  Username varchar(20) primary key not null,
  Password varchar(20) not null,
  CONSTRAINT Users_1 FOREIGN KEY (Username)  REFERENCES registration(Username)
);
insert into Users values("Admin","12345678");
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists super_login_detail;
create table super_login_detail
(
UserName varchar(20)  not null,
Date_login varchar(10) not null,
Login_time varchar(25) not null,
Logout_time varchar(25) 
);
/*--------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists Doctor;
create table Doctor
(
DoctorID int(5)primary key not null,
Doctorname varchar(15) not null,
FatherName varchar(15) not null,
Address varchar(50) not null,
ContactNo varchar(10) not null,
Email varchar(25) ,
Qualifications varchar(15) not null,
Specialization varchar(25) not null,
Gender varchar(2) not null,
BloodGroup varchar(3) not null, 
DateOfJoining varchar(10) not null
);
insert into Doctor values(0,"Doctor name","fa","cjyhgbjj","12344","null","mbbs","heart","M","O+","12/12/2012");
/*--------------------------------------------------------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS Room;
create table Room (
  RoomNo int(5) primary key not null,
  RoomType varchar(20) not null,
  RoomCharges int(11) not null,
  RoomStatus varchar(20) not null
);
insert into Room values(0,"Demo Room",500,"Vacant");
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
DROP TABLE IF EXISTS Ward;
create table Ward (
  WardName varchar(20) primary key not null,
  WardType varchar(20) not null,
  NoOfBeds int(11) not null,
  Charges int(11) not null
);
insert into ward values("Ward name","Demo Ward",1,500);
/*-------------------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists Services;
create table Services
(
ServiceName varchar(15) not null,
ServiceDate varchar(10) not null,
PatientID int(15) not null,
PatientName varchar(15) not null,
ServiceCharges int(10) not null
);
insert into Services values("servie name","12/12/2012",0,"demo name",500);
/*--------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists PatientRegistration;
create table PatientRegistration
(
PatientID int(5)unique not null,
Patientname varchar(15) not null,
FatherName varchar(15) not null,
Address varchar(50) not null,
ContactNo varchar(10) not null,
Email varchar(25) ,
Age int(3) not null,
Gen varchar(2) not null,
BG varchar(3) not null,
Remarks varchar(50)
);
insert into PatientRegistration values(0,"demo name","fa","cjyhgbjj","12344","null",32,"M","O+","null");
/*--------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists Nurse_Wardboy;
create table Nurse_Wardboy
(
ID int(5) unique not null,
N_W_Name varchar(15) not null,
Category varchar(10) not null,
Address varchar(50) not null,
ContactNo varchar(10) not null,
Email varchar(25),
Qualifications varchar(25) not null,
BloodGroup varchar(3) not null,
DateOfJoining varchar(10) not null
);
insert into Nurse_Wardboy values(0,"Ward name","Demo","fvf6yt","65554","null","10 fail","A+","12/12/2012");
/*--------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists AdmitPatient_Room;
create table AdmitPatient_Room
(
PatientID int(5)primary key not null,
Patientname varchar(15) not null,
Gender varchar(2) not null,
BloodGroup varchar(3) not null,
Disease varchar(15) not null,
AdmitDate varchar(10) not null,
RoomNo int(5) not null,
DoctorID int(5) not null,
Doctorname varchar(15) not null,
AP_Remarks varchar(50),
CONSTRAINT admitpatient_room_1 FOREIGN KEY (PatientID)   REFERENCES patientregistration(PatientID) ,
CONSTRAINT admitpatient_room_2 FOREIGN KEY (RoomNo)   REFERENCES room(RoomNo) ,
CONSTRAINT admitpatient_room_3 FOREIGN KEY (DoctorID)   REFERENCES doctor(DoctorID)  
);
insert into AdmitPatient_Room values(0,"demo name","M","O+","disease name","12/12/2012",0,0,"Doctor name","demo emergency");
/*--------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists AdmitPatient_Ward;
create table AdmitPatient_Ward
(
PatientID int(5)primary key not null,
Patientname varchar(15) not null,
Gender varchar(2) not null,
BloodGroup varchar(3) not null,
Disease varchar(15) not null,
AdmitDate varchar(10) not null,
Wardname varchar(15) not null,
DoctorID int(5) not null,
Doctorname varchar(15) not null,
AP_Remarks varchar(50),
CONSTRAINT admitpatient_ward_1 FOREIGN KEY (Wardname)   REFERENCES ward(wardname),
CONSTRAINT admitpatient_ward_2 FOREIGN KEY (PatientID)  REFERENCES patientregistration(PatientID),
CONSTRAINT admitpatient_ward_3 FOREIGN KEY (DoctorID)   REFERENCES doctor(DoctorID)
);
insert into AdmitPatient_Ward values(0,"demo name","M","O+","disease name","12/12/2012","Ward name",0,"Doctor name","demo emergency");
/*--------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists DischargePatient_Room;
create table DischargePatient_Room
(
PatientID int(5)primary key not null,
Patientname varchar(15) not null,
Gender varchar(2) not null,
BloodGroup varchar(3) not null,
Disease varchar(15) not null,
AdmitDate varchar(10) not null,
RoomNo int(5) not null,
DoctorID int(5) not null,
Doctorname varchar(15) not null,
DischargeDate varchar(10) not null,
DP_Remarks varchar(50),
CONSTRAINT DischargePatient_Room_1 FOREIGN KEY (PatientID) REFERENCES AdmitPatient_Room(PatientID)  
);
insert into DischargePatient_Room values(0,"demo name","M","O+","disease name","12/12/2012",0,0,"Doctor name","12/12/2012","demo emergency");
/*--------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists DischargePatient_Ward;
create table DischargePatient_Ward
(
PatientID int(5)primary key not null,
Patientname varchar(15) not null,
Gender varchar(2) not null,
BloodGroup varchar(3) not null,
Disease varchar(15) not null,
AdmitDate varchar(10) not null,
Wardname varchar(15) not null,
DoctorID int(5) not null,
Doctorname varchar(15) not null,
DischargeDate varchar(10) not null,
DP_Remarks varchar(50),
CONSTRAINT DischargePatient_Ward_1 FOREIGN KEY (PatientID) REFERENCES AdmitPatient_Ward(PatientID)  
);
insert into DischargePatient_Ward values(0,"demo name","M","O+","disease name","12/12/2012","Ward name",0,"Doctor name","12/12/2012","demo emergency");
/*--------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists Bill_Room;
create table Bill_Room
(
BillNo int(5) Primary Key not null,
PatientID int(5)Unique not null,
Patientname varchar(15) not null,
Gender varchar(2) not null,
BloodGroup varchar(3) not null,
Disease varchar(15) not null,
AdmitDate varchar(10) not null,
RoomNo int(5) not null,
DoctorID int(5) not null,
Doctorname varchar(15) not null,
DischargeDate varchar(10) not null,
RoomCharges int(10) not null,
NoOfDays int(10) not null,
TotalRoomCharges int(10) not null,
ServiceCharges int(10) not null,
BillingDate varchar(10) not null,
PaymentMode varchar(15) not null,
PaymentModeDetails varchar(25) not null,
TotalCharges int(10) not null,
ChargesPaid int(10) not null,
DueCharges int(10) not null,
CONSTRAINT bill_room_1 FOREIGN KEY (PatientID)  REFERENCES dischargepatient_room(PatientID)
);
insert into Bill_Room values(0,0,"demo name","M","O+","disease name","12/12/2012",0,0,"Doctor name","12/12/2012",500,1,500,500,"12/12/2012","by Cash","by Cash",1000,1000,0);
/*--------------------------------------------------------------------------------------------------------------------------------*/
drop table if exists Bill_Ward;
create table Bill_Ward
(
BillNo int(5) Primary Key not null,
PatientID int(5)Unique not null,
Patientname varchar(15) not null,
Gender varchar(2) not null,
BloodGroup varchar(3) not null,
Disease varchar(15) not null,
AdmitDate varchar(10) not null,
Wardname varchar(15) not null,
DoctorID int(5) not null,
Doctorname varchar(15) not null,
DischargeDate varchar(10) not null,
BedCharges int(10) not null,
NoOfDays int(10) not null,
TotalBedCharges int(10) not null,
ServiceCharges int(10) not null,
BillingDate varchar(10) not null,
PaymentMode varchar(15) not null,
PaymentModeDetails varchar(25) not null,
TotalCharges int(10) not null,
ChargesPaid int(10) not null,
DueCharges int(10) not null,
CONSTRAINT bill_Ward_1 FOREIGN KEY (PatientID)  REFERENCES dischargepatient_Ward(PatientID)
);
insert into Bill_Ward values(0,0,"demo name","M","O+","disease name","12/12/2012","Ward name",0,"Doctor name","12/12/2012",500,1,500,500,"12/12/2012","by Cash","by Cash",1000,1000,0);
/*--------------------------------------------------------------------------------------------------------------------------------*/