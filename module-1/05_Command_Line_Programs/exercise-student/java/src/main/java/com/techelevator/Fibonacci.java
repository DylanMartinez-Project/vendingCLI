package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //SCANNER IS STANDARD FOR ALL THESE THINGS

		// FIB SERIES
		// LET VARIABLE A = 0
		//LET VARIABLE B = 1
		// WHY? THESE ARE THE FIRST TWO VALUES OF THE SEQ

		// ASK THE USER HOW MANY ITERATIONS THEY WANT FOR THE SEQ
		// USE THAT INPUT AS AN "N" VARIABLE TO STICK INTO THE LOOP

		int a = 0;
		int b = 1;

		System.out.println("ENTER THE NUMBER OF FIB ITERATIONS YOU WOULD LIKE -EX : 5  -");
		String fibValue = scanner.nextLine();
		double n = Double.parseDouble(fibValue) ; // Double.parsedouble makes user/strinig input = number we can use in array

		// now i need to create the fib stuff

		// now to print the first two given values a & b

		System.out.println(a);
		System.out.println(b);

		// NOW CREATE a for Loop  TO PRINT REST OF THE FIB VALUES

		int nextValue; // int nextValue is just a defined C variable



		for(int i = 2; i < n; i++){

			// this for loop starts at at the
			// second element and goes up to the N iteration by increments of 1 (i++)
			nextValue = a + b;  // here we set C to equal a +b
			System.out.println(nextValue);
			a = b;
			b = nextValue;


		}






	}

}
