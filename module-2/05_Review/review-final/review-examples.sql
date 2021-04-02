-- 1. EXAMPLE OF A INSERT WITH A SELECT
select * from countrylanguage;
-- When we do the INSERT we need:
-- countrycode, language, isofficial, percentage
-- countrycode can be obtained from the country table.

-- Make Klingon a language in Antarctica. 

-- inspect the country table:
select * from country;
select code, 'Klingon', true, 98.76 from country WHERE code = 'ANT';

INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
select code, 'Klingon', true, 98.76 from country WHERE code = 'ANT';

select * from countrylanguage where countrycode = 'ANT';

-- 2. SUBQUERY EXAMPLE
-- get the countries that speak Spanish, do it 2 ways with a JOIN and with
-- or with a subquery:

-- With a regular join:
SELECT country.name, country.region, countrylanguage.language 
FROM country
JOIN countrylanguage ON country.code = countrylanguage.countrycode
WHERE countrylanguage.language = 'Spanish';

-- With a subquery:
-- inner query, rows in countrylanguage for spanish speaking countries:
SELECT countrycode from countrylanguage where language = 'Spanish';

-- Plug the inner query into the outer query:
SELECT country.name, country.region FROM country
WHERE country.code IN (
SELECT countrycode from countrylanguage where language = 'Spanish'
);

-- 3. Question # 7 from the homework:
-- Add a copy of "Euclidean PI" to all the stores.

INSERT INTO film (title, description, release_year, language_id, length) VALUES ('EUCLIDEAN PI', 'The epic story of Euclid as a pizza delivery boy in ancient Greece', 2008, (SELECT language_id FROM language WHERE name='English'), 198);

-- Learn more about Euclidean PI:
SELECT * FROM film where title = 'EUCLIDEAN PI';

-- Where do I need to insert this data?
-- Inventory table
-- inventory_id, film_id, store_id would need to be provided.
-- INSERT INTO inventory (inventory_id, film_id, store_id) VALUES (1002, x) <-- we know that the film id is always 1002 but
-- there could be many stores:
INSERT INTO inventory (film_id, store_id) 
SELECT (SELECT film_id FROM film where title = 'EUCLIDEAN PI'), store_id FROM store;

-- 4. List the number of rentals by category, which is the most and least popular category?
SELECT category.name, COUNT(*) AS rentals FROM rental
JOIN inventory ON rental.inventory_id = inventory.inventory_id
JOIN film ON inventory.film_id = film.film_id
JOIN film_category ON film.film_id = film_category.film_id
JOIN category ON film_category.category_id = category.category_id
GROUP BY category.name
ORDER BY rentals DESC
LIMIT 10;
