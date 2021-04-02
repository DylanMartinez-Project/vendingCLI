-- Write queries to return the following:
-- The following changes are applied to the "dvdstore" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.

        insert into actor (first_name, last_name)
        values ('HAMPTON', 'AVENUE'), ('LISA', 'BYWAY');
        




-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in
-- ancient Greece", to the film table. The movie was released in 2008 in English.
-- Since its an epic, the run length is 3hrs and 18mins. There are no special
-- features, the film speaks for itself, and doesn't need any gimmicks.

       insert into film (title, description, release_year,language_id, length)
       values ('Euclidean PI','The epic story of Euclid as a pizza delivery boy in
-- ancient Greece', 2008, 1, 198 ); 
      
      select *
      from film 
      where length = 198;

-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.

    insert into film_actor (actor_id, film_id)
    values (201, 1002) , (202 , 1002);
    
    select film_id
    from film_actor 
    where actor_id = 201 or actor_id = 202;


-- 4. Add Mathmagical to the category table.

insert into category (name)
values ( 'Mathmagical');


-- 5. Assign the Mathmagical category to the following films, "Euclidean PI",
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"

select f. * 
from film f
where f.title = 'EGG IGBY' or title =  'KARATE MOON'or title =  'YOUNG LANGUAGE' ;
-- 274 egg 
-- 494 kara
--996 young

update film_category 
set category_id = 17
where film_id = 274 ;

update film_category 
set category_id = 17
where film_id = 494 ;

update film_category 
set category_id = 17
where film_id = 996 ;

update film_category 
set category_id = 17
where film_id = 1001;

update film_category 
set category_id = 17
where film_id = 714 ;



-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films
-- accordingly.
-- (5 rows affected)

select f.film_id, rating, fc.category_id
from film f
join film_category fc on fc.film_id = f.film_id
where fc.category_id = 17;

update 


-- 7. Add a copy of "Euclidean PI" to all the stores.

-- 8. The Feds have stepped in and have impounded all copies of the pirated film,
-- "Euclidean PI". The film has been seized from all stores, and needs to be
-- deleted from the film table. Delete "Euclidean PI" from the film table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 9. Delete Mathmagical from the category table.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 10. Delete all links to Mathmagical in the film_category tale.
-- (Did it succeed? Why?)
-- <YOUR ANSWER HERE>

-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI".
-- (Did either deletes succeed? Why?)
-- <YOUR ANSWER HERE>

-- 12. Check database metadata to determine all constraints of the film id, and
-- describe any remaining adjustments needed before the film "Euclidean PI" can
-- be removed from the film table.
