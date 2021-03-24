package stocks;

import java.util.ArrayList;
import java.util.List;

public class Index {

    private List<Stock> stocks = new ArrayList<Stock>();
    private String name;

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void printAllStocks() {

        for (Stock stock : stocks) {
            System.out.println(stock.getName() + " " + stock.getPrice());
        }
    }

}
