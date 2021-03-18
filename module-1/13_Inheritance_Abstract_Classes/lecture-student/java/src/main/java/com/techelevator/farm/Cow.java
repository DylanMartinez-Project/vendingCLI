package com.techelevator.farm;

import java.math.BigDecimal;

public class Cow extends FarmAnimal implements Sellable{

    private BigDecimal price;



    public Cow(){
        super("Cow", "Moo!" );
        price = new BigDecimal("1500.00");
    }




    @Override
    public String eat() {
        return "eating shrimp";
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
