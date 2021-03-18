package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExercisesTest {

     /*
     firstLast6

     Given an array of ints, return true if 6 appears as either the first or last element in the array.
     The array will be length 1 or more.
     firstLast6([1, 2, 6]) → true
     firstLast6([6, 1, 2, 3]) → true
     firstLast6([13, 6, 1, 2, 3]) → false
     */

    @Test
    public void first_last_6_works(){

        Exercises testObject = new Exercises();

        int [] testArray = {1,3,6,9};
        boolean actualResult = testObject.firstLast6(testArray);
        boolean expectedResult = false;

        Assert.assertEquals(expectedResult,actualResult);

        int [] testArr2 = {6, 3, -12};
        boolean actualResult2 = testObject.firstLast6(testArr2);
        Assert.assertEquals(true,actualResult2);


    }


     /*
     countEvens

     Return the number of even ints in the given array. Note: the % "mod" operator computes the
     remainder, e.g. 5 % 2 is 1.
     countEvens([2, 1, 2, 3, 4]) → 3
     countEvens([2, 2, 0]) → 3
     countEvens([1, 3, 5]) → 0
     */

    @Test
    public void countEven_works(){

        Exercises  testObject = new Exercises();
        int [] testData = {1,2,4,9,6};
        int actualResult = testObject.countEvens(testData);
        int expectedResult = 3;

        Assert.assertEquals(expectedResult, actualResult);



    }







    /*
     animalGroupName

     Given the name of an animal, return the name of a group of that animal
     (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").

     The animal name should be case insensitive so "elephant", "Elephant", and
     "ELEPHANT" should all return "herd".

     If the name of the animal is not found, null, or empty, return "unknown".

     Rhino -> Crash
     Giraffe -> Tower
     Elephant -> Herd
     Lion -> Pride
     Crow -> Murder
     Pigeon -> Kit
     Flamingo -> Pat
     Deer -> Herd
     Dog -> Pack
     Crocodile -> Float

     animalGroupName("giraffe") → "Tower"
     animalGroupName("") -> "unknown"
     animalGroupName("walrus") -> "unknown"
     animalGroupName("Rhino") -> "Crash"
     animalGroupName("rhino") -> "Crash"
     animalGroupName("elephants") -> "unknown"
     */

    @Test
    public void animalGroupName_works(){

        Exercises testObject = new Exercises();
        String testString = "Lion";
        String actualResult = testObject.animalGroupName(testString);
        String expectedResult = "Pride";
        Assert.assertEquals(expectedResult,actualResult);

        String testString2 = "TART";
        String actualResult2 = testObject.animalGroupName(testString2);
        String expectedResult2 = "unknown";
        Assert.assertEquals(expectedResult2,actualResult2);

    }

    @Test
    public void extraEnd_works(){
        Exercises testObject = new Exercises();
        String testString = "Hello";
        String actualResult = testObject.extraEnd(testString);
        String expectedResult = "lololo";
        Assert.assertEquals(expectedResult,actualResult);


    }


}