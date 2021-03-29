package com.techelevator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Log {

    File file = new File("log.txt");



        FileOutputStream outputStream = new FileOutputStream(file, true);
        printWriter = new PrintWriter(outputStream);


        printWriter = new PrintWriter(file);
    }

        printWriter.append(lineFromUser);
        printWriter.flush();
        printWriter.close();

}
