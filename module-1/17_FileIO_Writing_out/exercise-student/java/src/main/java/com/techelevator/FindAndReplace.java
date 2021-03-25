package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in); // scanner

        System.out.println("What word are you searching for");
        String searchWord = scanner.nextLine();  // user word

        System.out.println("What word are you wanting to replace");
        String replaceWord = scanner.nextLine();  // user word

        System.out.println("Enter source.txt >>>");
        String source = scanner.nextLine();
        File f = new File(source);

//        System.out.println("Enter Destination >>>>");
//        String destination = scanner.nextLine();  // ??????????



        if(f.exists()){
            System.out.println("name" + f.getName());
            System.out.println("absolute path" + f.getAbsolutePath());



            System.out.println(" What is the destination file");
            String destination = scanner.nextLine();
            File d = new File(destination);

            try (
                    Scanner dataInput = new Scanner(f);
                    PrintWriter dataOutput = new PrintWriter(d)
            ) {
                while(dataInput.hasNextLine()) {
                    String lineOfInput = dataInput.nextLine();
                    dataOutput.println(lineOfInput.replaceAll(searchWord, replaceWord));  // replacement
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }



        } else {
            System.out.println(" this doesn't exist");

        }

    }

}
