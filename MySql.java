show databases;
use mysql;
create table EmployeeData(
id int,
name varchar(50),
age int,
salary int
);
INSERT INTO EmployeeData
VALUES (158,"Vikaz" , 22, 30000);
INSERT INTO EmployeeData
VALUES (164,"Mithresh" , 22, 30000);
INSERT INTO EmployeeData
VALUES (175,"Joan" , 22, 30000);
select * from EmployeeData;
