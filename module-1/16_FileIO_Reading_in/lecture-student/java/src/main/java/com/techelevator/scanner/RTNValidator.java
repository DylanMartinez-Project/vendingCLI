package com.techelevator.scanner;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RTNValidator {

    private static final int[] CHECKSUM_WEIGHTS = new int[]{3, 7, 1, 3, 7, 1, 3, 7, 1};

    public static void main(String[] args) throws FileNotFoundException {

        printApplicationBanner();
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter path of the file >>>>>>>>");
        String path = inputScanner.nextLine();

        File inputFile = new File(path);
        if (inputFile.exists()) {
            System.out.println("file exists");

            try (Scanner fileScanner = new Scanner(inputFile)) {
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    boolean isRTNValid = checksumIsValid(line);

                    if (isRTNValid) {
                        System.out.println(line + " is VALID");
                    } else {
                        System.out.println(line + "is not valid ");
                    }

                }
            } catch (NumberFormatException e){
				System.out.println("this number had formatting issues");
			}


        } else {
            System.out.println("does not exist");
        }

    }

    private static void printApplicationBanner() {
        System.out.println("******************");
        System.out.println("RTN Validator 9000");
        System.out.println("******************");
        System.out.println();
    }


    private static boolean checksumIsValid(String routingNumber) {
        int checksum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Integer.parseInt(routingNumber.substring(i, i + 1));
            checksum += digit * CHECKSUM_WEIGHTS[i];
        }
        return checksum % 10 == 0;
    }
}
