package com.techelevator;


import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;
import org.apache.commons.dbcp2.BasicDataSource;

public class DAOExample {

	public static void main(String[] args) {

		BasicDataSource worldDataSource = new BasicDataSource();
		worldDataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		worldDataSource.setUsername("postgres");
		worldDataSource.setPassword("postgres1");

		CityDAO dao = new JDBCCityDAO(worldDataSource);

		City city = dao.findCityById(76);

		System.out.println(city.getName() + " " + city.getCountryCode() + " " + city.getPopulation());

		City smallville = new City();
		smallville.setCountryCode("USA");
		smallville.setPopulation(10);
		smallville.setName("Smallville");
		smallville.setDistrict("KS");
		dao.save(smallville);



	}

}
