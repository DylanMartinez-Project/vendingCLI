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



		System.out.println("ENTER THE fib NUMBER : ");
		String fibValue = scanner.nextLine();

		int fibNum = Integer.parseInt(fibValue);

		int a = 0;
		int b = 1;
		System.out.print(a);
		int sum = 0;

		while( sum <= fibNum){// 0 is less than number user put in
			System.out.print(","+ b );
			sum = a + b ;
			a = b;
			b = sum;
		}


	}


	}


//		double n = Double.parseDouble(fibValue) ; // Double.parsedouble makes user/strinig input = number we can use in array
//
//		// now i need to create the fib stuff
//
//		// now to print the first two given values a & b
//
//		System.out.println(a);
//		System.out.println(b);
//
//		// NOW CREATE a for Loop  TO PRINT REST OF THE FIB VALUES
//
//		int nextValue; // int nextValue is just a defined C variable
//
//
//
//		for(int i = 2; i < n; i++){
//
//			// this for loop starts at at the
//			// second element and goes up to the N iteration by increments of 1 (i++)
//			nextValue = a + b;  // here we set C to equal a +b
//			System.out.println(nextValue);
//			a = b;
//			b = nextValue;
//
//
//		}
//
//
//
//
//
//
//	}
//
//}
