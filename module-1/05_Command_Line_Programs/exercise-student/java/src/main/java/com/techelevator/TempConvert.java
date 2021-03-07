package com.techelevator;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println( "PLEASE ENTER THE TEMPERATURE: " );

		String tempInput = scanner.nextLine();  //PERSON INPUT
		double tempDegree = Double.parseDouble(tempInput);  // NUM VALUE OF DEGREE

		System.out.println("IS THE TEMPERATURE IN (1)CELSIUS or (2) FAHRENHEIT? TYPE 1 OR 2");
		String tempUnit = scanner.nextLine(); //PERSON INPUTS TEMP UNIT

		double temperature = Double.parseDouble(tempInput);
		double fahrOrCel = Double.parseDouble(tempUnit);

		if(fahrOrCel == 1){
			System.out.println(temperature + "C is "+ (temperature*1.8 + 32)+ "F");
// USES 1 TO CONVERT C TO F
		}

		else if(fahrOrCel == 2){
			System.out.println(temperature + "F is "+ (temperature-32)/1.8+ "C");
		}
		else {
			// NOT 1 OR 2 ON TEMP UNIT INPUT
			System.out.println("NOT A VALID INPUT. TYPE 1 OR 2");
		}


	}

}
