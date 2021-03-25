package stocks;

public class Stock {

    private String name;
    private String ticker;
    private double price;
    private double change;

    public Stock(String name, String ticker, double price, double change) {
        this.name = name;
        this.ticker = ticker;
        this.price = price;
        this.change = change;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public String getName() {
        return name;
    }

    public String getTicker() {
        return ticker;
    }

    public double getPrice() {
        return price;
    }

    public double getChange() {
        return change;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", ticker='" + ticker + '\'' +
                ", price=" + price +
                ", change=" + change +
                '}';
    }
}
