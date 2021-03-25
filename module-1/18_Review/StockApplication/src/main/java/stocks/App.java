package stocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        File inputFile = new File("stocks.txt");
        Index fang = new Index();

        try (Scanner scanner = new Scanner(inputFile)) {

            while (scanner.hasNext()) {

                String lineOfData = scanner.nextLine();
                String [] arr = lineOfData.split("\\|");

                String name = arr[0];
                String ticker = arr[1];
                double price = Double.parseDouble(arr[2]);
                double change = Double.parseDouble(arr[3]);

                Stock stock = new Stock(name, ticker, price, change);
                fang.addStock(stock);
                System.out.println(stock);
            }


        } catch (FileNotFoundException e) {
            System.out.println("problem opening file");
        }

       fang.printAllStocks();


    }

}
