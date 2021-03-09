package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in); //USER INPUT CAN BE CHANGED TO W.E

		System.out.println("Please enter a series of decimal values (separated by spaces): ");
		String decimalInput = userInput.nextLine();

		String[] decimalsArray = decimalInput.split(" ");

		for (int i = 0; i<decimalsArray.length; i+=1) {   //FOR LOOP



			int number = Integer.parseInt(decimalsArray[i]);//ELEMENTS IN ARRAY --> INT.


			String container = ""; //BUCKET FOR % REMAINDERS

			int quotient = number; //create a variable called int quotient = number.

			while (quotient>=1) {                     //create a while loop for the statement below.
				int remainder = quotient%2;
				String sRemainder = Integer.toString(remainder);
				container += sRemainder;
				quotient/=2;
				//  mod 2 UNTIL STOPS AT 2/1
			}
			//this is how you reverse the order of elements within "container" array.
			//convert the string "container" in to an array
			String[] containerArray = container.split("");
			//create another string to store the elements in reverse order.
			int j = containerArray.length-1;
			String reverse = "";
			while(j>=0){
				// ADD TO REVERSE BUCKET
				reverse+=containerArray[j];
				//decrementing j -=
				j-=1;
			}
			System.out.println(decimalsArray[i] + " in binary is " + reverse);
		}
	}
}











//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("PLEASE ENTER A SET OF # VALUES SEP'D BY SPACES -EX 21 21 21");
//		String decimalValue = scanner.nextLine(); // INPUT FROM USER
//
//		// NOW I NEED TO SPLIT THE STRING INTO VALUES I CAN USE
//
//		String [] decimalValueList = decimalValue.split(" ");
//
//		//






