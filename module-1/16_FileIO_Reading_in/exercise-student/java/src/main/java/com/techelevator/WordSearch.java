package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {


		Scanner inputScanner = new Scanner(System.in); // standard start / expecting input from user

		System.out.println("What is the fully qualified name of the file that should be searched?");
		String path = inputScanner.nextLine();   //  user input

		File inputFile = new File(path);  // their input is now path

		int count = 1; // first lie of txt == 1

		if (inputFile.exists()) {  // if path exists continue


			System.out.println("WHAT WORD ARE YOU LOOKING FOR");  // ask user for word

			String wordFind = inputScanner.nextLine();  // expecting input again
			Scanner inputScannerWord = new Scanner(wordFind);  // word from user

			System.out.println("Should the search be case sensitive? (YN)");
			String caseInsense = inputScanner.nextLine();


			if (caseInsense.equals("Y")) {

				try (Scanner fileScanner = new Scanner(inputFile)) {    // When you need to write code where there might be an exception,
					while (fileScanner.hasNextLine()) {                    // you use the try and catch keywords to handle the potential error:
						String line = fileScanner.nextLine();
						boolean doesContain = line.contains(wordFind);  // true false -- does that line contain 'inputScannerWord'
						if (doesContain) {            // if so
							System.out.println(count + ") " + line);  // print out "count"
						}
						count++;
					}

				}
			} else {
				try (Scanner fileScanner = new Scanner(inputFile)) {    // When you need to write code where there might be an exception,
					while (fileScanner.hasNextLine()) {                    // you use the try and catch keywords to handle the potential error:
						String line = fileScanner.nextLine();
						boolean doesContain = line.toLowerCase().contains(wordFind.toLowerCase(Locale.ROOT));  // true false -- does that line contain 'inputScannerWord' lowercase
						if (doesContain) {            // if so
							System.out.println(count + ") " + line);  // print out "count"
						}
						count++;
					}

				}

			}
			} else{

				System.out.println("Does not exist ");
			}
		}
	}

