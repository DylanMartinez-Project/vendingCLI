-- ORDERING RESULTS

-- Populations of all countries in descending order
select name,population 
from country
order BY population DESC;
--Names of countries and continents in ascending order
select name, continent 
from country
order by continent ASC, name ASC;

-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.
select name, lifeexpectancy
from country 
where lifeexpectancy is not null;
ORDER BY lifeexpectancy DESC
limit 10;

-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
-- "city, state", sorted by state then city

select (name || ', ' || district) as name_and_state
from city
where district in ('California', 'Oregon', 'Washington')
order by district, name;

-- AGGREGATE FUNCTIONS
-- Average Life Expectancy in the World
select AVG(lifeexpectancy)
from country;


-- Total population in Ohio
select sum(population)
from city
where district = 'Ohio';



-- The surface area of the smallest country in the world
select min (surfacearea)
from country;

select surfacearea
from country 
order by surfacearea ASC
limit 1;

-- The 10 largest countries in the world
select *
from country
order by surfacearea DESC;
LIMIT 10;

-- The number of countries who declared independence in 1991
select COUNT(*)
from country
where indepyear = 1991;


-- GROUP BY
-- Count the number of countries where each language is spoken, ordered from most countries to least
select language, count(countrycode) as countries 
from countrylanguage 
group by language
order by countries desc;

-- Average life expectancy of each continent ordered from highest to lowest

select continent, AVG (lifeexpectancy) as expectancy
from country
group by continent
order by expectancy desc;


-- Exclude Antarctica from consideration for average life expectancy
select continent, AVG (lifeexpectancy) as expectancy
from country
where continent <> 'Antartica'
group by continent
order by expectancy desc;


-- Sum of the population of cities in each state in the USA ordered by state name
select district, sum (population)
from city
where countrycode = 'USA'
group by district
order by district asc;


-- The average population of cities in each state in the USA ordered by state name
select district, avg (population)
from city
where countrycode = 'USA'
group by district
order by district asc;

-- SUBQUERIES
-- Find the names of cities under a given government leader

-- Find the names of cities whose country they belong to has not declared independence yet

-- Additional samples
-- You may alias column and table names to be more descriptive

-- Alias can also be used to create shorthand references, such as "c" for city and "co" for country.

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)

-- Limiting results allows rows to be returned in 'limited' clusters,where LIMIT says how many, and OFFSET (optional) specifies the number of rows to skip

-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.

-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.

-- Counts the number of rows in the city table

-- Also counts the number of rows in the city table

-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.

-- Gets the MIN population and the MAX population from the city table.
select min (population), max (population)
from city;


-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
select countrycode,  min (population), max (population)
from city
group by countrycode;