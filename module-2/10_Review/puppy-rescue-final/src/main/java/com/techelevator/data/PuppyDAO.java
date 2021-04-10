package com.techelevator.data;

import com.techelevator.model.Puppy;

import java.util.List;

public interface PuppyDAO {

    public List<Puppy> getAllPuppies();

    public Puppy getPuppy(int id);

    public void savePuppy(Puppy puppy);

    public void removePuppy(int id);

    public void editPuppy(Puppy puppyToSave);

}
