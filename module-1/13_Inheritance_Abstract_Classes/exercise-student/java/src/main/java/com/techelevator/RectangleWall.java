package com.techelevator;

public class RectangleWall extends Wall{

    private int length;
    private int height;

    public RectangleWall(String name, String color, int length, int height){
        super(name,color);
        this.length = length;  // pulls prior class to make local
        this.height = height;

    }

    public int getLength() {                // getters needed for every class
        return length;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int getArea() {
        return  this.length*this.height;
    }

    public String toString() {
        return getName() + " (" + length + 'x' + height + ")" + " rectangle";
    }


}
