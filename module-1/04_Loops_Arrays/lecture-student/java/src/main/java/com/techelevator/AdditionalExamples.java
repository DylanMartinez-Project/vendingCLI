package com.techelevator;

public class AdditionalExamples {

    public static void main (String [] args) {

        // if else if example
        int age = 40;
<<<<<<< HEAD

        if (age <= 18) {
            System.out.println("minor");
=======
        if (age <= 18) {
            System.out.println("Minor");
>>>>>>> 6c481e7adc6a2ca9b050f1c6ada9b10a8f90ccc2
        } else if (age > 18 && age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Retiree");
        }

<<<<<<< HEAD

        // loop, print all the numbers from 1 to 10

        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }
        System.out.println("********");

        // loop , print all numbers 1-10 if only even
        for (int i = 1;  i <= 10 ;i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }



    }
=======
        // loop, print all the numbers from 1 to 10.
        for (int i=0; i < 10; i++) {
            System.out.println(i+1);
        }
        System.out.println("******");
        // loop, the numbers from 1 to 10 only if it's even.
        for (int i =1; i<= 10; i++) {
            if(i%2 == 0) {
                System.out.println(i);
            }
        }
    }
}
>>>>>>> 6c481e7adc6a2ca9b050f1c6ada9b10a8f90ccc2
