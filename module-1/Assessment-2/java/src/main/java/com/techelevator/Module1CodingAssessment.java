package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Module1CodingAssessment {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub


		FlowerShopOrder order1 = new FlowerShopOrder("Rose", 1);

		System.out.println(order1);  // $22.98    #4

		FlowerShopOrder order2 = new FlowerShopOrder("Poppy", 3);
		System.out.println(order2); // $28.96      #4

		//The delivery fee is $3.99 if the zip code falls between 20000 and 29999 (+$5.99 for same-day delivery).
		System.out.println(order1.calculateDeliveryTotal(false, "20000"));
		System.out.println(order1.calculateDeliveryTotal(true, "20000"));
		//The delivery fee is $6.99 if the zip code falls between 30000 and 39999 (+$5.99 for same-day delivery).
		System.out.println(order1.calculateDeliveryTotal(true, "30000"));
		System.out.println(order1.calculateDeliveryTotal(false, "30000"));
		//The delivery fee is waived ($0.00) if the zip code falls between 10000 and 19999.
		System.out.println(order1.calculateDeliveryTotal(false, "10000"));
		System.out.println(order1.calculateDeliveryTotal(true, "10000"));
		// All other zip codes cost $19.99 (same-day delivery is not an option).
		System.out.println(order1.calculateDeliveryTotal(true, "50000"));

		File file = new File("FlowerInput.csv");
		List<FlowerShopOrder> orders = new ArrayList<>();

		try (Scanner scanner = new Scanner(file)) {


			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] str = line.split("\\,");
				String bouquetType = str[0];
				int numOfRoses = Integer.parseInt(str[1]);
				FlowerShopOrder flowerShopOrder = new FlowerShopOrder(bouquetType, numOfRoses);

				orders.add(flowerShopOrder);
				System.out.println(flowerShopOrder.toString());
			}
		}
			catch (FileNotFoundException e) {
				System.out.println("file not found");
			}

	}}
//	public void logger(){
//		try {
//
//			File file = new File("FlowerInput.txt"); // created the file prior
//		FileOutputStream outputStream = new FileOutputStream(file, true);
//		PrintWriter printWriter = new PrintWriter(outputStream);
//
//
//		printWriter.append( flowerShopOrder.getBouquetType()  + flowerShopOrder.getBouquetType() + " " + flowerShopOrder.getNumberOfRosesAdded()+ " " + flowerShopOrder.getSubtotal());
//
//		printWriter.flush();
//		printWriter.close();
//
//	} catch(FileNotFoundException e) {
//		System.out.println("Problem Reading File");
//	}
//}}