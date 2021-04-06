package com.techelevator.projects.model.jdbc;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.DepartmentDAO;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCDepartmentDAO implements DepartmentDAO {
	
	private JdbcTemplate jdbcTemplate;

	public JDBCDepartmentDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Department> getAllDepartments() {

		List <Department> allDepts = new ArrayList<Department>();

		String sql = "SELECT department_id, name from department";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sql);

		while(results.next()){
			long id = results.getLong("department_id");
			String name = results.getString("name");

			Department department = new Department();
			department.setId(id);
			department.setName(name);

			allDepts.add(department);

		}

		return allDepts;
	}

	@Override
	public List<Department> searchDepartmentsByName(String nameSearch) {
		return new ArrayList<>();
	}

	@Override
	public void saveDepartment(Department updatedDepartment) {

	String newName = updatedDepartment.getName();
	long currentId = updatedDepartment.getId();
	String sql = "UPDATE department SET name = ? WHERE department_id = ?";

	jdbcTemplate.update(sql,newName,currentId);


		
	}

	@Override
	public Department createDepartment(Department newDepartment) {
		return null;
	}

	@Override
	public Department getDepartmentById(Long id) {
		return null;
	}

}
