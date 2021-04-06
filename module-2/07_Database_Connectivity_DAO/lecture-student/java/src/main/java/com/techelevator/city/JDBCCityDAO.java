package com.techelevator.city;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.List;

public class JDBCCityDAO implements CityDAO {

    private JdbcTemplate jdbcTemplate;

    public JDBCCityDAO(DataSource dataSource){

        this.jdbcTemplate = new JdbcTemplate(dataSource);

    }


    @Override
    public City findCityById(long id) {
        City thisCity = null;
        String sqlFindCityById = "SELECT id, name, countrycode, district, population FROM city WHERE id = ?";

        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sqlFindCityById, id);

        if(results.next()){
            long cityId = results.getLong("id");
            String name = results.getString("name");
            String countrycode = results.getString("countrycode");
            String district = results.getString("district");
            int population = results.getInt("population");

            thisCity = new City();
            thisCity.setId(cityId);
            thisCity.setName(name);
            thisCity.setCountryCode(countrycode);
            thisCity.setDistrict(district);
            thisCity.setPopulation(population);


        }
            return thisCity;
    }






    @Override
    public void save(City newCity) {
        String sql = "Insert into city (name, countrycode, district, population)" +
                "Values(?,?,?,?)";
        jdbcTemplate.update(sql,newCity.getName(),newCity.getCountryCode(), newCity.getDistrict(), newCity.getPopulation());
    }

    @Override
    public List<City> findCityByCountryCode(String countryCode) {
        return null;
    }

    @Override
    public List<City> findCityByDistrict(String district) {
        return null;
    }

    @Override
    public void update(City city) {

    }

    @Override
    public void delete(long id) {

    }

    private long getNextCityId() {
        SqlRowSet nextIdResult = jdbcTemplate.queryForRowSet("SELECT nextval('seq_city_id')");
        if(nextIdResult.next()) {
            return nextIdResult.getLong(1);
        } else {
            throw new RuntimeException("Something went wrong while getting an id for the new city");
        }
    }

}
