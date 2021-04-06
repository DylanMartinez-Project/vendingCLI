begin transaction;

create table customers (
customerid serial,
firstname varchar(64) not null,
lastname varchar (64) not null,  
address varchar (64) not null,
phone varchar(11) null,
constraint pk_customers primary key (customerid)




);

create table artists (

artistid serial,
firstname varchar(64) not null,
lastname varchar (64) not null,  

constraint pk_artists primary key (artistid)

);

create table art (

artcodeid serial ,
title varchar (64) not null,
artistid int not null,

constraint pk_art primary key (artcodeid),
constraint fk_art_artists foreign key (artistid) references artists(artistid)
);

create table customer_art (

customerid int not null, 
artcodeid int not null, 
purchasedate timestamp not null, 
price money not null ,

constraint pk_customer_art primary key (customerid , artcodeid,purchasedate),
constraint fk_customer_art_customer foreign key(customerid) references customers (customerid),
constraint fk_customer_art_art foreign key (artcodeid) references art(artcodeid)

);


rollback; 