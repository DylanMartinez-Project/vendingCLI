begin transaction;


create table department (
departmentnumber serial,
departmentname varchar (64) not null, 

constraint pk_department primary key (departmentnumber)
);


create table employee (
employeeid serial,
jobtitle varchar(64) not null,
firstname varchar(64) not null,
lastname varchar (64) not null,  
gender character (1) not null,
dob date not null,
dateofhire date not null,
departmentnumber int not null,

constraint pk_employee primary key (employeeid),
constraint fk_employee_department  foreign key (departmentnumber) references department(departmentnumber)
);


create table project  (
projectnumber serial,
projectname varchar (64) not null, 
projectstartdate date not null, 

constraint pk_project primary key (projectnumber)
);


create table employee_project (
projectnumber int not null,
employeeid int not null,

constraint pk_employee_project primary key (projectnumber,employeeid),
constraint fk_project foreign key (projectnumber) references project(projectnumber),
constraint fk_employee foreign key (employeeid) references employee(employeeid)


);

commit; 
