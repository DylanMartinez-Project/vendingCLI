package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Appender {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Print something meaningful bro");
        String lineFromUser = scanner.nextLine();

        File file = new File ("data.txt");

        PrintWriter printWriter= null;
        if(file.exists()){
            FileOutputStream outputStream = new FileOutputStream(file,true);
            printWriter = new PrintWriter(outputStream);
        } else {

            printWriter = new PrintWriter(file);


        }
        printWriter.append(lineFromUser);
        printWriter.flush();
        printWriter.close();



    }
}
