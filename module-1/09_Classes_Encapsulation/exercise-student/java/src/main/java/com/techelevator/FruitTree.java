package com.techelevator;

public class FruitTree {

    private String typeOfFruit;
    private int piecesOfFruitLeft;

    public boolean pickFruit (int numberOfPiecesToRemove){
        if(this.piecesOfFruitLeft >= numberOfPiecesToRemove){
            piecesOfFruitLeft = piecesOfFruitLeft - numberOfPiecesToRemove;
            return true;

        }
        return false;
    }


    public FruitTree(String typeOfFruit, int piecesOfFruit) {
        this.typeOfFruit = typeOfFruit;
        this.piecesOfFruitLeft = piecesOfFruit;
    }

    public String getTypeOfFruit() {
        return typeOfFruit;
    }

    public int getPiecesOfFruitLeft() {
        return piecesOfFruitLeft;
    }
}
