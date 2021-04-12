package com.techelevator.data;

import com.techelevator.model.Puppy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class PuppyJdbcDAO implements PuppyDAO{

    private JdbcTemplate jdbcTemplate;

    public PuppyJdbcDAO(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public List<Puppy> getAllPuppies() {

        String sql = "SELECT * from puppies";
        List<Puppy> puppyList = new ArrayList<Puppy>();

        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql);

        while (results.next()) {

            int id = results.getInt("id");
            String name = results.getString("name");
            int weight = results.getInt("weight");
            String gender = results.getString("gender");
            boolean paperTrained = results.getBoolean("paper_trained");

            Puppy puppy = new Puppy(id, name, weight, gender, paperTrained);
            puppyList.add(puppy);

        }

        return puppyList;
    }

    @Override
    public Puppy getPuppy(int id) {

        String sql = "SELECT * from puppies WHERE id = ?";
        Puppy puppy = null;

        SqlRowSet result = this.jdbcTemplate.queryForRowSet(sql, id);

        if (result.next()) {

            int id2 = result.getInt("id");
            String name = result.getString("name");
            int weight = result.getInt("weight");
            String gender = result.getString("gender");
            boolean paperTrained = result.getBoolean("paper_trained");

            puppy = new Puppy(id2, name, weight, gender, paperTrained);

        }

        return puppy;
    }

    @Override
    public void savePuppy(Puppy puppy) {

        String name = puppy.getName();
        int weight = puppy.getWeight();
        String gender = puppy.getGender();
        boolean paperTrained = puppy.isPaperTrained();

        String sql = "INSERT INTO puppies(name, weight, gender, paper_trained) VALUES(?, ?, ?, ?)";
        this.jdbcTemplate.update(sql, name, weight, gender, paperTrained);


    }

    @Override
    public void removePuppy(int id) {
        String sqlForRemove = "DELETE FROM puppies WHERE id=?";
        this.jdbcTemplate.update(sqlForRemove, id);

    }

	/*
	 * Body:
	 * {
        "id": 1,
        "name": "Lady",
        "weight": 18,
        "gender": "Female",
        "paperTrained": true
    	}
	 * Note that the regardless of the data passed, only the weight and paper_trained can
	 * be changed. The id must be present in the puppyToSave object.
	 * */

    @Override
    public void editPuppy(Puppy puppyToSave) {
        String sqlUpdPuppy = "UPDATE puppies " + "SET weight = ? , paper_trained = ? WHERE id=?";
        this.jdbcTemplate.update(sqlUpdPuppy, puppyToSave.getWeight(), puppyToSave.isPaperTrained(), puppyToSave.getId());
    }
}
