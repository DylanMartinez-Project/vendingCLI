package com.techelevator;


import java.util.Scanner;

class DiscountCalculator {

    /**
     * The main method is the start and end of our program
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Discount Calculator");
        System.out.println("Enter the discount amount without percentage (i.e) 45 for 45%");

        String discountInput = scanner.nextLine();
        double discount = Double.parseDouble(discountInput) / 100.0;

        System.out.println(" The discount you entered was " + discount);

        // Prompt the user for a series of prices
        System.out.print("Please provide a series of prices (space separated): ");
        String pricelist = scanner.nextLine();

        System.out.println(" These are the prices you entered " + pricelist);

        String [] priceArray = pricelist.split(" ");
        for (int i = 0; i < priceArray.length; i++){

            double originalPrice = Double.parseDouble(priceArray[i]);
            double amountOff = originalPrice * discount;
            double salePrice = originalPrice - amountOff;

            System.out.println("Sale price: $"+ salePrice);

        }


    }

}