package com.techelevator;

public class SquareWall extends RectangleWall{

    private int sideLength;




    public SquareWall(String name, String color, int sideLength) { // per README h & L swapped
        super(name, color, sideLength, sideLength);// for SL & SL
        this.sideLength = sideLength;  // dont forget this
    }

    public int getSideLength() {
        return sideLength;
    }


    @Override
    public String toString() {
        return super.getName() + " (" + sideLength + 'x' + sideLength+ ")" + " square";
    }
}
