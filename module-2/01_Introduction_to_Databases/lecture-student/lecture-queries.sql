-- SELECT ... FROM
-- Selecting the names for all countries
SELECT NAME FROM country;

-- Selecting the name and population of all countries
select name, population from country;

-- Selecting all columns from the city table
SeLECT * from city;

-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio
select * from city where district = 'Ohio';

-- Selecting countries that gained independence in the year 1776
select * from country where indepyear = 1776;

-- Selecting countries not in Asia
select * from country where continent <> 'Asia';

-- Selecting countries that do not have an independence year
select * from country where indepyear IS NULL;
-- Selecting countries that do have an independence year
select * from country where indepyear IS NOT NULL;

-- Selecting countries that have a population greater than 5 million
select * from country where population > 5000000;


-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000
select * from city 
where district = 'Ohio' AND population > 400000;
-- Selecting country names on the continent North America or South America
select name, continent 
FROM country
where continent = 'North America' OR continent = 'South America'; 



-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword
select name, population, surfacearea, lifeexpectancy, (population / surfacearea) AS density
FROM country;


