package com.techelevator.view;

import com.techelevator.city.City;
import com.techelevator.city.CityDAO;
import com.techelevator.city.JDBCCityDAO;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CLI {
    public static void main(String[] args) {

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/world");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        CityDAO dao = new JDBCCityDAO(dataSource);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a country code (i/e USA, CAN");
        String code = scanner.nextLine();

        List <City> results = dao.findCityByCountryCode(code);



    }
}
