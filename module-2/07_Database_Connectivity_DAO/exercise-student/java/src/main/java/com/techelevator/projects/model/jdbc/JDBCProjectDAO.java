package com.techelevator.projects.model.jdbc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Project;
import com.techelevator.projects.model.ProjectDAO;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JDBCProjectDAO implements ProjectDAO {

	private JdbcTemplate jdbcTemplate;

	public JDBCProjectDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Project> getAllActiveProjects() {

		List <Project>  allProjects = new ArrayList<Project>();

		String sqlGetAllActiveProjects = "SELECT project_id, name, from_date, to_date FROM project WHERE "
				+ "(now() BETWEEN from_date AND to_date) OR "
				+ "(now() > from_date AND to_date IS NULL) OR "
				+ "(now() < to_date AND from_date IS NULL)";

		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlGetAllActiveProjects);
		while(results.next()) {

			long projectId = results.getLong("project_id");
			String name = results.getString("name");
			Date fromDate = results.getDate("from_date");
			Date toDate = results.getDate("to_date");

			Project project = new Project();
			project.setId(projectId);
			project.setName(name);
			if(results.getDate("from_date") == null) {}
			else {
				project.setStartDate(results.getDate("from_date").toLocalDate());
			}
			if(results.getDate("to_date") == null) {}
			else {
				project.setEndDate(results.getDate("to_date").toLocalDate());
			}
			allProjects.add(project);
		}
		return allProjects;
	}

	@Override
	public void removeEmployeeFromProject(Long projectId, Long employeeId) {

		String sql = "DELETE from project_employee WHERE employee_id = ? AND project_id = ?";
		jdbcTemplate.update(sql, projectId, employeeId);
		
	}

	@Override
	public void addEmployeeToProject(Long projectId, Long employeeId) {

		String sql = "INSERT into project_employee(project_id, employee_id)" + "VALUES(?,?)";
		jdbcTemplate.update(sql,projectId, employeeId);

		
	}

}
