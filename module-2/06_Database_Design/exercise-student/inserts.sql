begin transaction; 

insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values ('project guy', ' dylan', 'martinez', 'm', '1994-12-18', '2020-4-20', 1);

insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values ('dough roller', ' diddy', 'kong', 'm', '1990-12-18', '2020-4-20', 1);

insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values ('money counter', 'mario', 'super', 'm', '1986-12-25', '2020-4-20', 1);


insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values ('rapper', 'prodigy', 'P', 'm', '1986-12-25', '2020-4-20', 2);

insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values ('rapper', 'havoc', 'P', 'm', '1986-1-25', '2020-4-20', 2);
--------------------------------------------------------------------------------------

insert into department( departmentnumber, departmentname, employeeid )
values (1,'pizza guys', 2);

insert into department( departmentnumber, departmentname, employeeid )
values (1,'pizza guys', 3);

insert into department( departmentnumber, departmentname, employeeid )
values (1,'pizza guys', 4);

insert into department( departmentnumber, departmentname, employeeid )
values (2,'Mobb Deep', 5);

insert into department( departmentnumber, departmentname, employeeid )
values (2,'Mobb Deep', 6);

insert into project (projectname,
projectstartdate,
employeeid)
values ('pizzapros','2020-04-20', 2);



rollback;