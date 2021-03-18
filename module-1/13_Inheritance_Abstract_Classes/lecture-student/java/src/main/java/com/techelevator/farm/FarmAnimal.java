package com.techelevator.farm;

public abstract class FarmAnimal implements Singable {

    private String name;
    private String sound;
    private boolean isAsleep;

    public FarmAnimal(String name, String sound){
        this.name = name;
        this.sound = sound;

    }

    public abstract String eat(); // neeed keyword abstract

    public void sleep(boolean isAsleep){
        this.isAsleep = isAsleep;
    }


    public String getName() {
        return this.name;
    }

    public final String getSound(){
        if(this.isAsleep){
            return "zzZZZzzz....";
        }
        return this.sound;
    }

}
