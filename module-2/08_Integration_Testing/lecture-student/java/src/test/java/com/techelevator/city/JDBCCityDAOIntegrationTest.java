package com.techelevator.city;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.junit.*;
import org.junit.runners.MethodSorters;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JDBCCityDAOIntegrationTest {

	private static final String TEST_COUNTRY = "XYZ";
	private static SingleConnectionDataSource dataSource;
	private JDBCCityDAO dao;

	@BeforeClass
	public static void setupDataSource(){

		dataSource = new SingleConnectionDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/world");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");

		dataSource.setAutoCommit(false);
	}

	@AfterClass
	public static void closeDataSource(){

		dataSource.destroy();
	}

	@Before
	public void setupTest(){

		String sqlInsertCountry = "INSERT INTO country (code, name, continent, region, surfacearea, indepyear, population, lifeexpectancy, gnp, gnpold, localname, governmentform, headofstate, capital, code2) VALUES (?, 'Afghanistan', 'Asia', 'Southern and Central Asia', 652090, 1919, 22720000, 45.9000015, 5976.00, NULL, 'Afganistan/Afqanestan', 'Islamic Emirate', 'Mohammad Omar', 1, 'AF')";

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sqlInsertCountry,TEST_COUNTRY);
		dao = new JDBCCityDAO(dataSource);
	}

	@After
	public void rollback() throws SQLException {

		dataSource.getConnection().rollback();
	}

	@Test
	public void save_new_city_and_read_it_back(){

		City theCity = createCityObject("SQL Station","South Daokta",TEST_COUNTRY,6553);
		dao.save(theCity);

		List<City> xyzResults = dao.findCityByCountryCode(TEST_COUNTRY);
		Assert.assertEquals(1,xyzResults.size());

		City city = xyzResults.get(0);

		assertCitiesAreEqual(theCity,city);

	}

	@Test
	public void returns_multiple_cities_by_country_code(){
		City city1 =  createCityObject("SQL Station","South Daokta",TEST_COUNTRY,6553);
		City city2 = createCityObject("Postgres Point", "North Daokta",TEST_COUNTRY, 6553);

		dao.save(city1);
		dao.save(city2);

		List<City> results = dao.findCityByCountryCode(TEST_COUNTRY);
		Assert.assertEquals(2,results.size());

	}

	@Test
	public void returns_cities_by_district(){
		String testDistrict = "Tech Elevator";
		City city = createCityObject("Metropolis", testDistrict, TEST_COUNTRY,999);
		dao.save(city);

		List <City> results = dao.findCityByDistrict(testDistrict);

		Assert.assertEquals(1,results.size());

		City cityActual = results.get(0);

		assertCitiesAreEqual(city,cityActual);


	}



	private City createCityObject(String name, String district, String countryCode, int population) {
		City theCity = new City();
		theCity.setName(name);
		theCity.setDistrict(district);
		theCity.setCountryCode(countryCode);
		theCity.setPopulation(population);
		return theCity;
	}

	private void assertCitiesAreEqual(City expected, City actual) {
		assertEquals(expected.getId(), actual.getId());
		assertEquals(expected.getName(), actual.getName());
		assertEquals(expected.getDistrict(), actual.getDistrict());
		assertEquals(expected.getCountryCode(), actual.getCountryCode());
		assertEquals(expected.getPopulation(), actual.getPopulation());
	}
}
