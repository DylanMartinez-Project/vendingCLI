package com.techelevator.view;

import com.techelevator.data.PuppyDAO;
import com.techelevator.data.PuppyJdbcDAO;
import com.techelevator.model.Puppy;
import org.apache.commons.dbcp.BasicDataSource;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:postgresql://localhost:5432/puppies");
        ds.setUsername("postgres");
        ds.setPassword("postgres1");

        PuppyDAO dao = new PuppyJdbcDAO(ds);

        List<Puppy> puppies = dao.getAllPuppies();

        for (Puppy puppy : puppies) {
            System.out.println(puppy.getName() + " " + puppy.getWeight());
        }


        Puppy bigRedDog = dao.getPuppy(99);

        if (bigRedDog != null) {
            System.out.println(bigRedDog.getName() + " " + bigRedDog.getWeight());
        } else {
            System.out.println("puppy not found");
        }

        System.out.println("ADDING PUPPY");

        Puppy toughie = new Puppy(99,"Toughie",30, "Male", false);
        dao.savePuppy(toughie);


        List<Puppy> puppies2 = dao.getAllPuppies();

        for (Puppy puppy : puppies2) {
            System.out.println(puppy.getName() + " " + puppy.getWeight());
        }


    }
}
