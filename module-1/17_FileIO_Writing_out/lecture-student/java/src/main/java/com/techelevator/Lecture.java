package com.techelevator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lecture {

	public static void main(String[] args) throws IOException {

		Scanner userInput = new Scanner(System.in);

		/*
		 * The java.io.File class is a representation of file and directory path names.  It provides methods to inspect and
		 * modify file system objects.
		 *
		 * One benefit is that it compensates for differences in Windows and Unix use of '/' and '\' as directory delimiters.
		 *
		 * A new instance of File can be created from a String that contains a file system path
		 */

		System.out.println("EX 1");
		System.out.println("Enter path >>>");
		String path = userInput.nextLine();
		File f = new File(path);

		if (f.exists()){
			System.out.println("name: " + f.getName());
			System.out.println("absolute path" + f.getAbsolutePath());

			if (f.isDirectory()){
				System.out.println( " is DIRECTORY");

			} else if(f.isFile()){
				System.out.println("is file");


			}

		} else {

			System.out.println(f.getAbsolutePath() + " does not exist ");

		}

		System.out.println("**************************************");
		System.out.println( "Ex 2");
		System.out.println("Enter path for a directory");
		path = userInput.nextLine();
		File newDirectory = new File(path);

		if(newDirectory.exists()){
			System.out.println("Folder Already exists ");


		} else {

			newDirectory.mkdir();


		}

		System.out.println("EXAMPLE 3");
		System.out.println("Enter name of file");
		String fileName = userInput.nextLine();

		File newFile = new File(newDirectory, fileName);
		newFile.createNewFile();


		System.out.println("EX 4");
		System.out.println("Enter message youd want to write in the file>>>");
		String message = userInput.nextLine();

		System.out.println("file size before write is : " + newFile.length());

		try(PrintWriter writer = new PrintWriter(newFile)){
			writer.println(message);


		}
		System.out.println("file size after write is : " + newFile.length());





	}

}
