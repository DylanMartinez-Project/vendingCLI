package pizzabuilder.materials;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<Topping> toppings = new ArrayList<Topping>();
    private BigDecimal basePrice = new BigDecimal(4.99);
    private BigDecimal totalPrice = new BigDecimal(4.99);

    public BigDecimal getTotalPrice() {
        return this.totalPrice;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);

        this.totalPrice = this.totalPrice.add(topping.getPrice());
    }

    @Override
    public String toString() {

        String str = "---------------------\n";
        str += "Your order:\n";
        str += "Base Price: $" + this.basePrice.setScale(2, RoundingMode.HALF_UP) + "\n";
        str += "Your toppings:\n";

        for (Topping topping : toppings) {

            str += topping.getName() + "\t$" + topping.getPrice().setScale(2, RoundingMode.HALF_UP) + "\n";
        }

        str += "$" + this.totalPrice.setScale(2, RoundingMode.HALF_UP);

        return str;
    }
}
