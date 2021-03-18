package com.techelevator.farm;

import java.math.BigDecimal;

public class Tractor implements Singable {

    private String name;
    private String sound;

    public Tractor() {
        this.name = "Tractor";
        this.sound = "vroom!";
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSound() {
        return this.sound;
    }
}
