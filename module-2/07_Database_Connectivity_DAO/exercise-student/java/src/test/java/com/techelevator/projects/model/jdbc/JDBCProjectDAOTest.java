package com.techelevator.projects.model.jdbc;

import com.techelevator.projects.model.Project;
import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class JDBCProjectDAOTest {

    private static final String TEST_NAME = "The worst project";  // firstname of employee
    private static LocalDate TEST_FROMDate = LocalDate.ofEpochDay(2012-04-05);
    private static LocalDate TEST_To = LocalDate.ofEpochDay(2021-05-12);
    private static final String TEST_FIRST = "Sonic";  // firstname of employee
    private static final String TEST_SECOND = "Hedgehog"; // last name
    private static final Long TEST_PROJECT_ID = 99L;
    private static final Long TEST_EMPLOY_ID = 159L;

    private static JdbcTemplate jdbcTemplate;

    private static SingleConnectionDataSource dataSource;
    private JDBCProjectDAO dao;

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
        this.jdbcTemplate = new JdbcTemplate(dataSource);

        String sqlInsertProject = "Insert into project (project_id, name, from_date, to_date) VALUES(?,?,?,?)";
        String sqlInsertEmployee =  "INSERT INTO employee (employee_id, department_id, first_name, last_name, birth_date, gender, hire_date) VALUES(?, 3 , ?, ?, '1985-05-10', 'F', '2021-04-20')";

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sqlInsertProject, TEST_PROJECT_ID,TEST_NAME,TEST_FROMDate,TEST_To);
        jdbcTemplate.update(sqlInsertEmployee,TEST_EMPLOY_ID, TEST_FIRST, TEST_SECOND);
        dao = new JDBCProjectDAO(dataSource);

    }

    @After
    public void tearDown() throws Exception {

        dataSource.getConnection().rollback();
    }
    @Test
    public void test_active_projects(){

        List<Project> xyzResult = dao.getAllActiveProjects();
        Assert.assertEquals(1,xyzResult.size());
    }

    @Test
    public void test_remove_emp_project(){

        String sqlInsertProject = "INSERT INTO project_employee (project_id,employee_id) VALUES (?,?)";
        String sqlCheck = "SELECT employee_id from project_employee where employee_id = ?";
        jdbcTemplate.update(sqlInsertProject, TEST_PROJECT_ID, TEST_EMPLOY_ID);

        dao.removeEmployeeFromProject(TEST_PROJECT_ID,TEST_EMPLOY_ID);


        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlCheck,TEST_EMPLOY_ID);


        if (results.next()){
            Assert.assertTrue(false);

        } else {
            Assert.assertTrue(true);
        }
    }


    @Test
    public void test_add_emp_project(){

        String sqlInsertProject = "INSERT INTO project_employee (project_id,employee_id) VALUES (?,?)";
        String sqlCheck = "SELECT employee_id from project_employee where employee_id = ?";

        jdbcTemplate.update(sqlInsertProject, TEST_PROJECT_ID, TEST_EMPLOY_ID);
        SqlRowSet results = jdbcTemplate.queryForRowSet(sqlCheck,TEST_EMPLOY_ID);

        if (results.next()){
            Assert.assertTrue(true);

        } else {
            Assert.assertTrue(false);
        }
    }



    }
