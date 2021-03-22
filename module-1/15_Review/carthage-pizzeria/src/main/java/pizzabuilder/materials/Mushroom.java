package pizzabuilder.materials;

import java.math.BigDecimal;

public class Mushroom implements Topping {

    private String name = "Mushroom";
    private BigDecimal price = new BigDecimal(3.50);

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public BigDecimal getPrice() {
        return this.price;
    }
}
