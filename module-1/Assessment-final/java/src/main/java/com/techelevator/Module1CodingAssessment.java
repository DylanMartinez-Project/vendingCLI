package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args) {

		// #3
		TellerMachine atm1 = new TellerMachine("Ethical Bank",
				new BigDecimal(100.00), new BigDecimal(45.23));
		System.out.println(atm1);


		TellerMachine atm2 = new TellerMachine("Honest Bank",
				new BigDecimal(100.00), new BigDecimal(45.23));
		System.out.println(atm2);


		// # 8
		BigDecimal total = BigDecimal.ZERO; // same as: BigDecimal("0.00")
		File data = new File("TellerInput.csv");

		if (!data.exists()) {
			System.out.println("File not found");
		} else {

			try (Scanner scanner = new Scanner(data)) {

				while (scanner.hasNext()) {

					String dataLine = scanner.nextLine();
					String [] dataLineArr = dataLine.split("\\,");

					String manufacturer = dataLineArr[0];
					BigDecimal deposits = new BigDecimal(dataLineArr[1]);
					BigDecimal withdrawals = new BigDecimal(dataLineArr[2]);

					TellerMachine atm = new TellerMachine(manufacturer, deposits, withdrawals);
					// #9
					total = total.add(atm.getBalance());
				}

			} catch (FileNotFoundException e) {
				System.out.println("File not found.");
			}

			// #9
			System.out.println("The total is: $" + total.setScale(2, RoundingMode.HALF_UP));
		}
	}
}
