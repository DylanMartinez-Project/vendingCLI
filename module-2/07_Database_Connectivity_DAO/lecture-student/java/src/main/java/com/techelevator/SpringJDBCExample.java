package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlRowSetResultSetExtractor;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class SpringJDBCExample {

	public static void main(String[] args) {


		BasicDataSource dvdStoreDataSource = new BasicDataSource();

		dvdStoreDataSource.setUrl("jdbc:postgresql://localhost:5432/dvdstore");
		dvdStoreDataSource.setUsername("postgres");
		dvdStoreDataSource.setPassword("postgres1");


		JdbcTemplate jdbcTemplate = new JdbcTemplate(dvdStoreDataSource);

		String sql = "select film.title, film.release_year from film limit 10";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

		while (results.next()){
			String title = results.getString("title");
			int releaseYear = results.getInt("release_year");
			System.out.println(title + ": "+ releaseYear);

		}

		System.out.println("***********************************************************************");

		String sql2 = "SELECT film.title, film.release_year " +
				"from film " +
				" join film_category on film.film_id = film_category.film_id " +
				"join category on film_category.category_id = category.category_id " +
				" where category.name = ?";

		String category = "Documentary";

		SqlRowSet results2 = jdbcTemplate.queryForRowSet(sql2, category);

		while (results2.next()){
			String title = results2.getString("title");
			int releaseYear = results2.getInt("release_year");
			System.out.println(title + ": "+ releaseYear);



		}
}
}
