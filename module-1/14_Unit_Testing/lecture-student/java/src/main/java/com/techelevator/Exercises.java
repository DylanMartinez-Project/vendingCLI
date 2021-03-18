package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Exercises {

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }


    public int countEvens(int[] nums) {
        int eventIntCount = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] % 2 == 0) {
                eventIntCount++;
            }
        }

        return eventIntCount;
    }


    public String animalGroupName(String animalName) {
        Map<String, String> animals = new HashMap<String, String>();
        animals.put("rhino", "Crash");
        animals.put("giraffe", "Tower");
        animals.put("elephant", "Herd");
        animals.put("lion", "Pride");
        animals.put("crow", "Murder");
        animals.put("pigeon", "Kit");
        animals.put("deer", "Herd");
        animals.put("dog", "Pack");
        animals.put("crocodile", "Float");

        if (animalName != null && animals.containsKey(animalName.toLowerCase())) {
            return animals.get(animalName.toLowerCase());
        } else {
            return "unknown";
        }
    }

    /*
 Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string
 length will be at least 2.
 extraEnd("Hello") → "lololo"
 extraEnd("ab") → "ababab"
 extraEnd("Hi") → "HiHiHi"
 */
    public String extraEnd(String str) {
        int len = str.length();
        return str.substring(len - 1) + str.substring(len - 1) + str.substring(len - 1);
    }


}
