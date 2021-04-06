begin transaction; 

insert into department (departmentname)
values ('Mobb Deep');

insert into department (departmentname)
values ('Wu-Tang Clan');

insert into department (departmentname)
values ('MadVillan');

insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'Albert', 'Johnson', 'M' , '1974-11-02', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Mobb Deep'));
 
 insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'Kejuan', 'Muchita', 'M' , '1974-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Mobb Deep'));
 
  insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'The', 'RZA', 'M' , '1969-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Wu-Tang Clan'));
 
insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'The', 'GZA', 'M' , '1966-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Wu-Tang Clan'));
 
 insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'Method', 'Man', 'M' , '1971-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Wu-Tang Clan'));
 
 insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'Ol Dirty', 'Bastard', 'M' , '1968-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Wu-Tang Clan'));
 
 insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'Raekwon', 'The Chef', 'M' , '1970-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Wu-Tang Clan'));
 
  insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'Ghostface', 'Killah', 'M' , '1970-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Wu-Tang Clan'));
 
  insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'Inspectah', 'Deck', 'M' , '1970-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Wu-Tang Clan'));
 
 insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'U', 'God', 'M' , '1970-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Wu-Tang Clan'));
 
  insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'Masta', 'Killa', 'M' , '1970-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Wu-Tang Clan'));
 
 insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'Cappadonna', 'Hill', 'M' , '1970-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'Wu-Tang Clan'));
 
 insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Rapper', 'MF', 'DOOM', 'M' , '1970-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'MadVillan'));
 
 insert into employee (jobtitle, firstname, lastname, gender, dob, dateofhire, departmentnumber) 
values('Producer', 'Madlib', 'Madlib', 'M' , '1970-05-11', '2000-04-20',
(SELECT departmentnumber
FROM department
 WHERE departmentname = 'MadVillan'));
 
 insert into project (projectname, projectstartdate)
 values('The Infamous', '1995-04-25' );
 
 insert into project (projectname, projectstartdate)
 values('Enter the Wu-Tang(36 Chambers)', '1993-04-25' );
 
  insert into project (projectname, projectstartdate)
 values('Madvillany', '2003-03-23' );
 
 insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'The Infamous'),
 (select employeeid from employee where firstname = 'Albert' )
 );
 
 insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'The Infamous'),
 (select employeeid from employee where firstname = 'Kejuan' )
 );
 
  insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Enter the Wu-Tang(36 Chambers)'),
 (select employeeid from employee where lastname = 'RZA' )
 );
 
 insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Enter the Wu-Tang(36 Chambers)'),
 (select employeeid from employee where lastname = 'GZA' )
 );
 
  insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Enter the Wu-Tang(36 Chambers)'),
 (select employeeid from employee where firstname = 'Method' )
 );
 
 insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Enter the Wu-Tang(36 Chambers)'),
 (select employeeid from employee where lastname = 'Bastard' )
 );
 
  insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Enter the Wu-Tang(36 Chambers)'),
 (select employeeid from employee where lastname = 'The Chef' )
 );
 
 
 insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Enter the Wu-Tang(36 Chambers)'),
 (select employeeid from employee where lastname = 'Killah' )
 );
 
 insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Enter the Wu-Tang(36 Chambers)'),
 (select employeeid from employee where lastname = 'Deck' )
 );
 
 insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Enter the Wu-Tang(36 Chambers)'),
 (select employeeid from employee where lastname = 'God' )
 );
 
 insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Enter the Wu-Tang(36 Chambers)'),
 (select employeeid from employee where lastname = 'Killa' )
 );
 
 insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Enter the Wu-Tang(36 Chambers)'),
 (select employeeid from employee where lastname = 'Hill' )
 );
 
 insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Madvillany'),
 (select employeeid from employee where lastname = 'DOOM' )
 );
 
  insert into employee_project(projectnumber, employeeid)
 values (
 (select projectnumber from project where projectname = 'Madvillany'),
 (select employeeid from employee where lastname = 'Madlib' )
 );
 
 
 
 
 
 
 
 
 






rollback;