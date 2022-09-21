create database Project;
use Project;
show tables;
drop table hibernate_sequence;
create table CollegeStudent(sid int primary key not null,sname varchar(23),deptname varchar(23),address varchar(23),marks int,age int);
select * from CollegeStudent;
truncate table CollegeStudent;

create table CollegeStaff(staffid int primary key not null,staffname varchar(23),staffdeptname varchar(23),address varchar(23),mobileno double,salary double);
select * from CollegeStaff;
