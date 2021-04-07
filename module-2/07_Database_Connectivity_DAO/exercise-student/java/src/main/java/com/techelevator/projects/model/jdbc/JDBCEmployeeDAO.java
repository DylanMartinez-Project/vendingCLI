package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import com.techelevator.projects.model.EmployeeDAO;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCEmployeeDAO implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCEmployeeDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {

		List <Employee> allEmployees = new ArrayList<Employee>();
		String sql = "SELECT first_name, last_Name from employee";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {

			String first_name = results.getString("first_name");
			String last_name = results.getString("last_name");

			Employee employee = new Employee();
			employee.setFirstName(first_name);
			employee.setLastName(last_name);

			allEmployees.add(employee);
		}






		return allEmployees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List <Employee> allEmployees = new ArrayList<Employee>();
		String sql = "select * from employee where first_name = ? and last_name = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,firstNameSearch,lastNameSearch);

		while(results.next()) {
			String first_name = results.getString("first_name");
			String last_name = results.getString("last_name");
			Employee employee = new Employee();
			employee.setFirstName(first_name);
			employee.setLastName(last_name);
//			employee.setId(employee.getId());
//			employee.getBirthDay();
//			employee.getGender();
			allEmployees.add(employee);
		}
		return allEmployees;

	}

	@Override
	public List<Employee> getEmployeesByDepartmentId(long id) {
		List <Employee> allEmployees = new ArrayList<Employee>();

		String sql = "select first_name, last_Name from employee where department_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql,id);
		while(results.next()){
			String first_name = results.getString("first_name");
			String last_name = results.getString("last_name");
			Employee employee = new Employee();
			employee.setFirstName(first_name);
			employee.setLastName(last_name);
			allEmployees.add(employee);



		}
		return allEmployees;
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List <Employee> allEmployees = new ArrayList<Employee>();
		String sql ="select first_name, last_name from employee where employee_id not in(select employee_id from project_employee)";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
		while(results.next()) {
			String first_name = results.getString("first_name");
			String last_name = results.getString("last_name");
			Employee employee = new Employee();
			employee.setFirstName(first_name);
			employee.setLastName(last_name);
			allEmployees.add(employee);
		}
		return allEmployees;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(Long projectId) {
		return new ArrayList<>();
	}

	@Override
	public void changeEmployeeDepartment(Long employeeId, Long departmentId) {

		String sql = "UPDATE employee SET department_id = ? where employee_id = ?";
		jdbcTemplate.update(sql,departmentId,employeeId);





	}

}
