package com.example.demo.controllers;

import com.example.demo.web.InputObject;
import com.example.demo.web.OutputObject;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class MainController {

    @RequestMapping(path="/fizzbuzz", method=RequestMethod.GET)
    public String fizzBuzzAPICalculator(@RequestParam String number) {

        int targetNumber = Integer.parseInt(number);
        String output = number;

        if (targetNumber%15 == 0) {
            output = "FizzBuzz";
        } else if (targetNumber%3 == 0) {
            output = "Fizz";
        } else if (targetNumber%5 == 0) {
            output = "Buzz";
        }

        return output;
    }


    @RequestMapping(path="/calculate", method= RequestMethod.POST)
    public OutputObject summarizeNumbers(@RequestBody InputObject input) {

        Arrays.sort(input.getInputArr());

        int min = input.getInputArr()[0];
        int max = input.getInputArr()[ input.getInputArr().length -1 ];

        OutputObject output = new OutputObject();
        output.setMin(min);
        output.setMax(max);

        int sum = 0;
        for (int i : input.getInputArr()) {
            sum += i;
        }

        output.setMean(sum / input.getInputArr().length);

        return output;
    }
}
