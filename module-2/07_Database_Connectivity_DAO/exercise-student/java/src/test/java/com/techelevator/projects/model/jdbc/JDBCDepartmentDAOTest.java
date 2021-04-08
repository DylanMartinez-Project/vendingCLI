package com.techelevator.projects.model.jdbc;


import com.techelevator.projects.model.Department;
import org.junit.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;

import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JDBCDepartmentDAOTest {


    private static final String TEST_DEPARTMENT = "XYZ";  // name of department
    private static SingleConnectionDataSource dataSource;
    private JDBCDepartmentDAO dao;


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

        String sqlInsertDepartment = "INSERT INTO department (name) VALUES (?)";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(sqlInsertDepartment, TEST_DEPARTMENT);
        dao = new JDBCDepartmentDAO(dataSource);

    }

    @After
    public void tearDown() throws Exception {

        dataSource.getConnection().rollback();
    }

    @Test
    public void save_create_depTest() {

        Department theDepartment = createDEPObject(99,TEST_DEPARTMENT);
        dao.saveDepartment(theDepartment);
        List <Department> results = dao.searchDepartmentsByName(TEST_DEPARTMENT);

        Assert.assertEquals("XYZ", TEST_DEPARTMENT);



    }

    @Test
    public void searchDepartmentName(){

        List <Department> departmentList = dao.searchDepartmentsByName(TEST_DEPARTMENT);
        boolean found = false;

        for (Department dept : departmentList){

            if(dept.getName().equals(TEST_DEPARTMENT)){

                found = true;
            }
        }

        Assert.assertTrue(found);
    }




    @Test
    public void get_the_departments() {

        List<Department> xyzResult = dao.getAllDepartments();
        Assert.assertEquals(6, xyzResult.size());


    }

    public Department createDEPObject(long department_id, String name) {
        Department theDEP = new Department();
        theDEP.setName(name);
        theDEP.setId(department_id);
        return theDEP;

    }

    private void assertDepAreEqual(Department expected, Department actual) {
        assertEquals(expected.getName(), actual.getName());

    }
}