-- The following queries utilize the "dvdstore" database.

-- 1. All of the films that Nick Stallone has appeared in
-- (30 rows)
select title
from actor 
join film_actor fa on fa.actor_id = actor.actor_id  
join film f on f.film_id = fa.film_id
where actor.first_name = 'NICK' and actor.last_name = 'STALLONE';

-- 2. All of the films that Rita Reynolds has appeared in
-- (20 rows)

select title
from actor 
join film_actor fa on fa.actor_id = actor.actor_id  
join film f on f.film_id = fa.film_id
where actor.first_name = 'RITA' and actor.last_name = 'REYNOLDS';



-- 3. All of the films that Judy Dean or River Dean have appeared in
-- (46 rows)

select title
from actor 
join film_actor fa on fa.actor_id = actor.actor_id  
join film f on f.film_id = fa.film_id
where actor.first_name = 'JUDY' and actor.last_name = 'DEAN' OR actor.first_name = 'RIVER' and actor.last_name = 'DEAN';


-- 4. All of the the ‘Documentary’ films
-- (68 rows)

select f. *
from film f
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
where c.name = 'Documentary';


-- 5. All of the ‘Comedy’ films
-- (58 rows)
select f. *
from film f
join film_category fc on f.film_id = fc.film_id
join category c on fc.category_id = c.category_id
where c.name = 'Comedy';


-- 6. All of the ‘Children’ films that are rated ‘G’
-- (10 rows)

select f. *
from film f
join film_category fc on f.film_id = fc.film_id
where f.rating = 'G' and fc.category_id = '3';


-- 7. All of the ‘Family’ films that are rated ‘G’ and are less than 2 hours in length
-- (3 rows)

select f. *
from film f
join film_category fc on f.film_id = fc.film_id
where f.rating = 'G' and fc.category_id = '8' and f.length < 120;

-- 8. All of the films featuring actor Matthew Leigh that are rated ‘G’
-- (9 rows)

select title
from film f
join film_actor fa on fa.film_id = f.film_id
join actor a on a.actor_id = fa.actor_id
where a.first_name = 'MATTHEW' and a.last_name = 'LEIGH' AND f.rating = 'G';


-- 9. All of the ‘Sci-Fi’ films released in 2006
-- (61 rows)

select title
from film f
join film_category fc on fc.film_id = f.film_id
join category c on c.category_id = fc.category_id
where c.category_id = '14' and f.release_year = '2006';

-- 10. All of the ‘Action’ films starring Nick Stallone
-- (2 rows)

select title
from film f
join film_actor fa on fa.film_id = f.film_id
join actor a on a.actor_id = fa.actor_id
join film_category fc on fc.film_id = f.film_id
join category c on c.category_id = fc.category_id
where c.category_id = '1' and a.first_name = 'NICK' and a.last_name = 'STALLONE';

-- 11. The address of all stores, including street address, city, district, and country
-- (2 rows)

select address, c.city_id, country
from store s
join address a on a.address_id = s.address_id
join city c on c.city_id = a.city_id
join country cou on cou.country_id = c.country_id;

-- 12. A list of all stores by ID, the store’s street address, and the name of the store’s manager
-- (2 rows)

select s.store_id, a.address, sta.first_name
from store s
join address a on a.address_id = s.address_id
join staff sta on sta.store_id = s.store_id;


-- 13. The first and last name of the top ten customers ranked by number of rentals
-- (#1 should be “ELEANOR HUNT�? with 46 rentals, #10 should have 39 rentals)

select cus.first_name, cus.last_name, count(payment.rental_id)
from customer cus
join rental on rental.customer_id = cus.customer_id
join payment on payment.rental_id = rental.rental_id
group by cus.last_name, cus.first_name
order by count(payment.rental_id) desc
limit 10;

-- 14. The first and last name of the top ten customers ranked by dollars spent
-- (#1 should be “KARL SEAL�? with 221.55 spent, #10 should be “ANA BRADLEY�? with 174.66 spent)

select first_name, last_name, Sum(amount)
from customer cus
join rental on rental.customer_id = cus.customer_id
join payment on payment.rental_id = rental.rental_id
group by cus.last_name, cus.first_name
order by Sum(amount) desc;




-- 15. The store ID, street address, total number of rentals, total amount of sales (i.e. payments), and average sale of each store.
-- (NOTE: Keep in mind that while a customer has only one primary store, they may rent from either store.)
-- (Store 1 has 7928 total rentals and Store 2 has 8121 total rentals)

select s.store_id, a.address, count(payment.rental_id), sum(amount), avg (amount)
from store s
join address a on a.address_id = s.address_id
join inventory inv on inv.store_id = s.store_id
join rental on rental.inventory_id = inv.inventory_id
join payment on payment.rental_id = rental.rental_id
group by s.store_id, a.address;




-- 16. The top ten film titles by number of rentals
-- (#1 should be “BUCKET BROTHERHOOD�? with 34 rentals and #10 should have 31 rentals)
select title, count(rental.rental_id) 
from film f
join inventory inv on inv.film_id = f.film_id
join rental on rental.inventory_id = inv.inventory_id
group by title
order by count(rental.rental_id) desc
limit 10;




-- 17. The top five film categories by number of rentals
-- (#1 should be “Sports�? with 1179 rentals and #5 should be “Family�? with 1096 rentals)
select c.name, count(rental.rental_id) 
from film f
join inventory inv on inv.film_id = f.film_id
join rental on rental.inventory_id = inv.inventory_id
join film_category fc on f.film_id = fc.film_id
join category c on c.category_id = fc.category_id
group by c.name
order by count(rental.rental_id) desc limit 10 ;

-- 18. The top five Action film titles by number of rentals
-- (#1 should have 30 rentals and #5 should have 28 rentals)
select f.title, count(rental.rental_id)
from film f
join inventory inv on inv.film_id = f.film_id
join rental on rental.inventory_id = inv.inventory_id
join film_category fc on f.film_id = fc.film_id
join category c on c.category_id = fc.category_id
where c.category_id = '1'
group by f.title
order by  count(rental.rental_id) desc limit 5;



-- 19. The top 10 actors ranked by number of rentals of films starring that actor
-- (#1 should be “GINA DEGENERES�? with 753 rentals and #10 should be “SEAN GUINESS�? with 599 rentals)
select a.actor_id, first_name,last_name , count(rental.rental_id)
from film f
join film_actor fa on fa.film_id = f.film_id
join actor a on a.actor_id = fa.actor_id
join inventory inv on inv.film_id = f.film_id
join rental on rental.inventory_id = inv.inventory_id

group by a.actor_id
order by count(rental.rental_id) desc
limit 10;
 


-- 20. The top 5 “Comedy�? actors ranked by number of rentals of films in the “Comedy�? category starring that actor
-- (#1 should have 87 rentals and #5 should have 72 rentals)


select a.actor_id, first_name, last_name ,count(rental.rental_id)
from film f
join film_actor fa on fa.film_id = f.film_id
join actor a on a.actor_id = fa.actor_id
join inventory inv on inv.film_id = f.film_id
join rental on rental.inventory_id = inv.inventory_id
join film_category fc on f.film_id = fc.film_id
--join category c on c.category_id = fc.category_id
where fc.category_id = 5
group by a.actor_id  
order by count(rental.rental_id) desc
limit 5;

