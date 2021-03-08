package com.techelevator;

public class Lecture {

	public static void main(String[] args) {

		/*
VIN Numbers:
1GNSCBE09ER147271
1FAHP3F24CL127125
3GNEC13T73G142264
1MEFM50U85A612817
*/







		System.out.println("************************************");
		System.out.println("****** MAKING A STRING OBJECT ******");
		System.out.println("************************************");

		/* The String class gets special treatment in the Java language.  One
		 * example of this is that there is a literal representation of a
		 * String (i.e. characters appearing between two double quotes.  This
		 * is not the case for most classes */

		/* create an new instance of String using a literal */

		
		System.out.println();
		System.out.println("******************************");
		System.out.println("****** MEMBER METHODS ******");
		System.out.println("******************************");
		System.out.println();

		String vin = "1GNSCBE09ER147271 ";

		char manufact = vin.charAt(1);
		System.out.println(manufact);
		char countryCode = vin.charAt(0);
		// if the car is made in the USA and its a FORD say print out FOD USA

		if (countryCode == '1' && manufact == 'F'){
			System.out.println( "FORD-USA");
		} else {
			System.out.println( "OTHER" );
		}

		int lengthOfVin = vin.length();
		System.out.println("THE LENGTH OF VIN IS " + lengthOfVin);

		int vinClean = vin.trim().length();
		System.out.println("THE CLEANED UP VIN NUMBER HAS A LENGTH OF "+ vinClean);


		int position = vin.indexOf("ER1");
		System.out.println(position);

		String carFeatures = vin.substring(3,8);

		System.out.println(carFeatures);

		String lowerCaseVin = vin.toLowerCase();
		System.out.println(lowerCaseVin);

		boolean hasLetters = vin.contains("934");
		System.out.println(hasLetters);

		String bar = "AAA ";
		bar = bar.trim();  //string are immutabel
		System.out.println("LENGTH OF BAR :" + bar.length());
		bar.toLowerCase();
		System.out.println("value of bar : " + bar);


		/* Other commonly used methods:
		 *
		 * endsWith
		 * startsWith
		 * indexOf
		 * lastIndexOf
		 * length
		 * substring
		 * toLowerCase
		 * toUpperCase
		 * trim
		 */

		System.out.println();
		System.out.println("**********************");
		System.out.println("****** EQUALITY ******");
		System.out.println("**********************");
		System.out.println();

		String hello1 = "POTATO";
		String hello2 = new String( "POTATO");

		char [] charArray = {'P','O', 'T', 'A', 'T', 'O'};

		String hello4 = new String (charArray);

		/* Double equals will compare to see if the two variables, hello1 and
		 * hello2 point to the same object in memory. Are they the same object? */
		if (hello1 == hello2) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

		String hello3 = hello1;
		if (hello1 == hello3) {
			System.out.println("hello1 is the same reference as hello3");
		}

		/* So, to compare the values of two objects, we need to use the equals method.
		 * Every object type has an equals method */
		if (hello1.equals(hello2)) {
			System.out.println("They are equal!");
		} else {
			System.out.println(hello1 + " is not equal to " + hello2);
		}

	}
}
