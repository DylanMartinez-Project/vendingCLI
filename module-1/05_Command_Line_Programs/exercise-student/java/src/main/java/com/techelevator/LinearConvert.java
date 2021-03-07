package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println( "PLEASE ENTER THE LENGTH: " );

		String lengthInput = scanner.nextLine();  //PERSON INPUT
		double lengthNum = Double.parseDouble(lengthInput);  // NUM VALUE OF length

		System.out.println("IS THE LENGTH IN (1)METERS or (2) FEET ? TYPE 1 OR 2");
		String tempUnit = scanner.nextLine(); //PERSON INPUTS  UNIT

		double length = Double.parseDouble(lengthInput);
		double mOrFeet = Double.parseDouble(tempUnit);

		if(mOrFeet == 1){
			System.out.println(length + "m is "+ (length*3.280839)+ " f");
// USES 1 TO CONVERT m TO f
		}

		else if(mOrFeet == 2){
			System.out.println(length + "f is "+ (length*0.3048) + " m");
		}
		else {
			// NOT 1 OR 2 ON TEMP UNIT INPUT
			System.out.println("NOT A VALID INPUT. TYPE 1 OR 2");
		}


	}

}
