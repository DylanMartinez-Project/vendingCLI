create table reservations (
	id serial PRIMARY KEY,
	name VARCHAR(50),
	number_guests INT,
	reservation_date DATE,
	specialOccasion BOOLEAN
);