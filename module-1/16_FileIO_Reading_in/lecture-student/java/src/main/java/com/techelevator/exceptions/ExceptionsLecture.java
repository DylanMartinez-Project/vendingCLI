package com.techelevator.exceptions;

import java.util.Currency;
import java.util.Scanner;

public class ExceptionsLecture {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Example 1");
		try {
			String[] cities = {"Cleveland", "Columbus", "Cincinatti"};
			System.out.println(cities[3]);
			System.out.println("Hello?");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("AN ARRAY OUT OF BOUNDS EXCEPTION HAS OCCURRED");
		}

		System.out.println("Example 2");
		System.out.println( "hello everyone watch this !");

		try {
			doSomethingDangerous();
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println(" silly rabbit ");
		}

		System.out.println("Example 3");
		try {
			int nights = -3;
			int numberOfGuests = 2;
			calculateHotelRoomCharges(nights, numberOfGuests);
		} catch (IllegalArgumentException e ) {
			System.out.println("exception occurred");
			e.printStackTrace();
		}

		System.out.println("Example 4");
		try {
			double currentBalance = 250;
			double amountToWithdraw = 300;
			double newBalance = withdraw(currentBalance, amountToWithdraw);
		} catch (OverdraftException e){
			System.out.println(" you dont have enough money man ");
		}




	}





	
	/* this method does not need to declare that it throws an IllegalArgumentException because
	 * it is a subclass of RuntimeException.  These are known as "unchecked exceptions" because
	 * the compiler does not force us to catch them. */
	private static double calculateHotelRoomCharges(int nights, int numberOfGuests) {
		final double EXTRA_GUEST_CHARGE = 20;
		final double ROOM_RATE = 85;
		
		/* The throw statements below demonstrate how to throw a new Exception. */
		if(nights < 1) {
			throw new IllegalArgumentException("Minimum number of nights is 1");
		} else if(numberOfGuests < 1) {
			throw new IllegalArgumentException("Minimum number of guests is 1");
		}
		
		int numberOfExtraGuests = 0;
		if(numberOfGuests > 4) {
			numberOfExtraGuests = numberOfGuests - 4;
		}
		
		double dailyRate = ROOM_RATE + (EXTRA_GUEST_CHARGE * numberOfExtraGuests);
		return dailyRate * nights;
	}


	/* OverdraftException is a "checked exception" (i.e. it is a subclass of java.lang.Exception)
	 * so we need to either catch it or declare that it is thrown.  This method declares that 
	 * it can throw an OverdraftException using the "throws" keyword */
	public static double withdraw(double currentBalance, double amountToWithdraw) throws OverdraftException {
		double newBalance;
		if(amountToWithdraw <= currentBalance) {
			newBalance = currentBalance - amountToWithdraw;
		} else {
			throw new OverdraftException("The requested withdrawal amount is greater than the current balance", Math.abs(currentBalance - amountToWithdraw));
		}
		return newBalance;		
	}



	private static void doSomethingDangerous() {
		int[] numbers = new int[5];
		for(int i = 0; i < 10; i++) {
			numbers[i] = i;  // this line will throw an Exception once i reaches 5
		}
		System.out.println("Look Ma, no Exceptions!");  // This line will not execute because an Exception will be thrown inside the for loop
	}

}
