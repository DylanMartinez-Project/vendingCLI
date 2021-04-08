package com.techelevator.projects.model.jdbc;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Employee;
import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class JDBCEmployeeDAOTest {


    private static final String TEST_FIRST = "Sonic";  // firstname of employee
    private static final String TEST_SECOND = "Hedgehog"; // last name
    private static SingleConnectionDataSource dataSource;
    private JDBCEmployeeDAO dao;


    @BeforeClass
    public static void setUpDataSource() {
        dataSource = new SingleConnectionDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/projects");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");
        dataSource.setAutoCommit(false);

    }

    @AfterClass
    public static void rollback() throws SQLException {
        dataSource.destroy();


    }

    @Before
    public void setUp() throws Exception {

        String sqlInsertDepartment = "INSERT INTO employee (employee_id, department_id, first_name, last_name, birth_date, gender, hire_date) VALUES(99, 3 , ?, ?, '1985-05-10', 'F', '2021-04-20')";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sqlInsertDepartment, TEST_FIRST, TEST_SECOND);
        dao = new JDBCEmployeeDAO(dataSource);

    }

    @After
    public void tearDown() throws Exception {

        dataSource.getConnection().rollback();

    }

    @Test
    public void get_the_emps() {

        List<Employee> xyzResult = dao.getAllEmployees();
        Assert.assertEquals(13, xyzResult.size());
    }

    @Test
    public void searchDepartmentName() {

        List<Employee> departmentList = dao.searchEmployeesByName(TEST_FIRST, TEST_SECOND);
        boolean found = false;

        for (Employee emp : departmentList) {

            if (emp.getFirstName().equals(TEST_FIRST) && emp.getLastName().equals(TEST_SECOND)) {

                found = true;
            }
        }
        Assert.assertTrue(found);
    }
}