package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ExerciseTest {

    @Test
    public void animalGroup_works(){

        AnimalGroupName testObject = new AnimalGroupName();

        String testString = "giraffe";
        String actualResult = testObject.getHerd(testString);
        String expectedResult = "Tower";
        Assert.assertEquals(expectedResult,actualResult);

        String testString2 = "walrus";
        String actualResult2 = testObject.getHerd(testString2);
        String expectedResult2 = "unknown";
        Assert.assertEquals(expectedResult2,actualResult2);

    }

    @Test
    public void cigarParty_works(){

        CigarParty testObject = new CigarParty();

        int testCigar = 50;
        boolean testIsWeekend = false;

        boolean actualResult = testObject.haveParty(testCigar,testIsWeekend);
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void dateFashion_work(){

        DateFashion testObject = new DateFashion();

        int testOne = 8;
        int testTwo = 10;
        int actualResult = testObject.getATable(testOne,testTwo);
        int expectedResult = 2;

        Assert.assertEquals(expectedResult, actualResult);

        int test1 = 0;
        int test2 = 0;
        int actualResult2 = testObject.getATable(test1,test2);
        int expectedResult2 = 0;

        Assert.assertEquals(expectedResult2, actualResult2);



    }
    @Test
    public void frontTimes_work(){

        FrontTimes testObject = new FrontTimes();

        String testString = "Lion";
        int testInt = 3;
        String actualResult = testObject.generateString(testString, testInt);
        String expectedResult = "LioLioLio";
        Assert.assertEquals(expectedResult,actualResult);

        String testString2 = "Li";
        int testInt2 = 3;
        String actualResult2 = testObject.generateString(testString2, testInt2);
        String expectedResult2 = "LiLiLi";
        Assert.assertEquals(expectedResult2,actualResult2);



    }

    @Test
    public void less_work(){

        Less20 testObject = new Less20();

        int testInt = 19;
        boolean actualResult = testObject.isLessThanMultipleOf20(testInt);
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult,actualResult);

        int testInt2 = 20;
        boolean actualResult2 = testObject.isLessThanMultipleOf20(testInt2);
        boolean expectedResult2 = false;

        Assert.assertEquals(expectedResult2,actualResult2);





    }


    @Test
    public void lucky_work(){

        Lucky13 testObject = new Lucky13();

        int [] testArray = {11,31,6,9}; // fix
        boolean actualResult = testObject.getLucky(testArray);
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult,actualResult);

        int [] testArray2 = {1,3,6,9}; // fix
        boolean actualResult2 = testObject.getLucky(testArray2);
        boolean expectedResult2 = false;

        Assert.assertEquals(expectedResult2,actualResult2);


    }

    @Test
    public void max_work(){

        MaxEnd3 testObject = new MaxEnd3();

        int [] testArray = {11,31,6};
        int [] actualResult = testObject.makeArray(testArray);
        int [] expectedResult = { 11,11,11};

        Assert.assertArrayEquals(expectedResult,actualResult);






    }

    @Test
    public void nonStart_work() {

        NonStart testObject = new NonStart();

        String testString = "java";
        String testString1= "code";
        String actualResult = testObject.getPartialString(testString,testString1);
        String expectedResult = "avaode";


        Assert.assertEquals(expectedResult,actualResult);

        String testString2 = "";
        String testStringTwo= "code";
        String actualResult2 = testObject.getPartialString(testString2,testStringTwo);
        String expectedResult2 = "ode";


        Assert.assertEquals(expectedResult2,actualResult2);


        String testString3 = "java";
        String testStringThree= "";
        String actualResult3 = testObject.getPartialString(testString3,testStringThree);
        String expectedResult3 = "ava";


        Assert.assertEquals(expectedResult3,actualResult3);


    }

    @Test
    public void sameLast_work() {

        SameFirstLast testObject = new SameFirstLast();

        int [] testArray = {1,31,1};
        boolean actualResult = testObject.isItTheSame(testArray);
        boolean expectedResult = true;

        Assert.assertEquals(expectedResult,actualResult);

    }

    @Test
    public void getBit_work(){

        StringBits testObject = new StringBits();
        String testString = "javar";
        String actualResult = testObject.getBits(testString);
        String expectedResult = "jvr";
        Assert.assertEquals(expectedResult,actualResult);



    }

    @Test
    public void word_work(){

        WordCount testObject = new WordCount();

        String [] testArray = {"ba","ba","black", "sheep"};
        Map<String, Integer> actualResult = testObject.getCount(testArray);
        Map<String, Integer> expectedResult = new HashMap<>();  //
        expectedResult.put("ba" , 2);
        expectedResult.put("black", 1);
        expectedResult.put("sheep", 1);

        Assert.assertEquals(expectedResult,actualResult);








    }





}
