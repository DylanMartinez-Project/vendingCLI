package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner userInput = new Scanner(System.in); // scanner

		System.out.println(" What is the destination file");
		String destination = userInput.nextLine();
		File d = new File(destination);

		String output = "1";
		String contains = "";


			for (int i =2 ; i < 301; i++) {
				output = output + System.lineSeparator();
				contains = "" + i;
				if ( i%3 ==0 && i%5 ==0){
					output = output + "FizzBuzz";
				} else if(i%3==0 || contains.contains("3")){
					output = output + "Fizz";

				} else if(i%5==0 || contains.contains("5")){
					output = output + "Buzz";

				} else {
					output = output + i;
				}
				try ( PrintWriter dataOutput = new PrintWriter(d)){
					dataOutput.println(output);
				} catch ( Exception e){
					e.printStackTrace();
				}
			}

		}

		}



