CREATE DATABASE EMPLOYEE;
USE EMPLOYEE;
CREATE TABLE WORKER (
Worker_ID INTEGER PRIMARY KEY ,
First_Name VARCHAR(25),
LAST_NAME VARCHAR(25),
SALARY INTEGER(15),
JOINING_DATE datetime,
DEPARTMENT CHAR(25)
);
insert into WORKER VALUES(Worker_ID,First_Name,Last_Name,SALARY,JOINING_DATE,DEPARTMENT);
insert into WORKER VALUES(001 , 'Monika ', 'Arora' , 100000 , '2014-02-20 09:00:00 ' , 'HR');
insert into WORKER VALUES(002 ,'Niharika ' , 'verma' , 80000 , '2014-06-11 09:00:00 ' , 'Admin');
insert into WORKER VALUES(003 , 'Vishal'  , ' Singhal ' , 300000 , '2014-02-20  09:00:00 ' , 'HR');
insert into WORKER VALUES(004 , 'Amithabh' , 'Singh' , 500000 , '2014-02-20 09:00:00 ' , 'Admin');
insert into WORKER VALUES(005 , 'Vivek ', 'Bhatia ' , 500000 , '2014-06-11 09:00:00 ', ' Admin');
insert into WORKER VALUES(006 , ' Vipul' , 'Diwan' , 200000 , '2014-06-11 09:00:00 ' , 'Account');
insert into WORKER VALUES(007 , 'Satish ' , 'Kumar' , 75000 , '2014-01-20 09:00:00 ' , 'Account');
insert into WORKER VALUES(008 , 'Geetika ', 'Chauhan ', 90000 , '2014-04-11 09:00:00 ' , 'Admin');

select * from worker;

SELECT REPLACE(First_Name , 'a' ,'A' ) from WORKER;

Select CONCAT ( First_Name, ' ',Last_Name) AS COMPLETE_NAME from Worker;

Select * from Worker order by  First_Name asc , DEPARTMENT desc;

SELECT * FROM WORKER WHERE DEPARTMENT = 'Admin' ;

Select * from Worker where First_Name not  in ("vipul" , "satish ");

Select * from Worker where First_Name like '%a' ;

Select * from worker where First_Name like '_____h' ;

select First_name as worker_Name from Worker ;

select upper (First_Name) from worker;
select * from worker where salary between 100000 and 500000;