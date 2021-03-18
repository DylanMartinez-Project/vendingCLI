package com.techelevator.farm;

import java.math.BigDecimal;

public class Pig extends FarmAnimal implements Sellable{

    private BigDecimal price;


    public Pig(){
        super("Pig", "Oink!" );
        price = new BigDecimal("300.00");
    }


    @Override
    public String eat() {
        return "bacon bits";
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
