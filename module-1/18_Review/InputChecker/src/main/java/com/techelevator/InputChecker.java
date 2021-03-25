package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputChecker {

    public static void main(String[] args) {

        boolean keepGoing = true;
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<Integer>();

        do {

            System.out.println("Enter a whole number, press Q to quit");
            String userInput = scanner.nextLine();

            if (userInput.equals("Q")) {
                keepGoing = false;
            } else {

                try {
                    int ourNumber = Integer.parseInt(userInput);
                    numbers.add(ourNumber);
                } catch (NumberFormatException e) {
                    System.out.println("this is not a number, try again.");
                }

            }

        } while (keepGoing);

        System.out.println(numbers);

    }
}
