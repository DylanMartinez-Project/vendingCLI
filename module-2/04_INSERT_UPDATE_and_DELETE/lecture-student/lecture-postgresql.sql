-- INSERT

-- 1. Add Klingon as a spoken language in the USA
insert into countrylanguage (countrycode, language, isofficial, percentage)
values ('USA', 'Klingon', false, 0.01);

select * from countrylanguage
where countrycode = 'USA';


-- 2. Add Klingon as a spoken language in Great Britain (GBR)
insert into countrylanguage (countrycode, language, isofficial, percentage)
values ('GBR', 'Klingon', false, 0.01);

select * from countrylanguage
where language = 'Klingon';


-- UPDATE

-- 1. Update the capital of the USA to Houston

select * from city
where name = 'Houston';
--3796 
update country set capital = 3796
where code ='USA';

select * from country where code = 'USA';

-- or join 

select a.name, b.name 
from country a 
inner join city b on a.capital = b.id
where a.code = 'USA';






-- 2. Update the capital of the USA to Washington DC and the head of state

select * from country where code = 'USA';

update country set headofstate = 'Britney Spears' where code = 'USA';

select * from country where code = 'USA';


-- DELETE

-- 1. Delete English as a spoken language in the USA

delete from countrylanguage where countrycode = 'USA'and language = 'English';

select * from countrylanguage where countrycode = 'USA';

-- count 



-- 2. Delete all occurrences of the Klingon language 

delete from countrylanguage where language = 'Klingon';



-- REFERENTIAL INTEGRITY

-- 1. Try just adding Elvish to the country language table.

insert into countrylanguage (language ) values ('Elvish');

-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?

insert into countrylanguage (countrycode, language, isofficial, percentage ) values
 ('ZZZ','English', false, 0.01 );


-- 3. Try deleting the country USA. What happens?
delete from country where code = 'USA';

-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA

-- 2. Try again. What happens?

-- 3. Let's relocate the USA to the continent - 'Outer Space'


-- How to view all of the constraints

SELECT pg_constraint.*
FROM pg_catalog.pg_constraint
INNER JOIN pg_catalog.pg_class ON pg_class.oid = pg_constraint.conrelid
INNER JOIN pg_catalog.pg_namespace ON pg_namespace.oid = connamespace;


-- TRANSACTIONS

-- 1. Try deleting all of the rows from the country language table and roll it back.

update country set population = 20 where code = 'ATA';
        

-- 2. Try updating all of the cities to be in the USA and roll it back


start transaction;
update country set population = 20 where code = 'ATA';
delete from country where code = 'USA';

end transaction;

select * from country where code = 'ATA';




-- 3. Demonstrate two different SQL connections trying to access the same table where one happens to be inside of a transaction but hasn't committed yet.






