package com.techelevator;

public class TriangleWall extends Wall {  // implement then modify method

    private int base;
    private int height;


    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public TriangleWall(String name, String color, int base,int height ) {
        super(name, color);
        this.height = height;
        this.base = base;
    }

    @Override
    public int getArea() {
        return (this.base*this.height)/2;
    }

    @Override
    public String toString() {
        return getName() + " (" + base + "x" + height + ") triangle";
    }
}
