package com.techelevator;

public abstract class Wall {
    private String name;
    private String color;

    public Wall(String name, String color) {
        this.name = name;  // pulls instance variable
        this.color= color ;  // same


    }

    public abstract int getArea();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }


}
