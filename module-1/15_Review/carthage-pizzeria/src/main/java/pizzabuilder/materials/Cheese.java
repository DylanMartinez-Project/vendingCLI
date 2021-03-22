package pizzabuilder.materials;

import java.math.BigDecimal;

public class Cheese implements Topping {

    private String name = "Cheese";
    private BigDecimal price = new BigDecimal(1.50);


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
