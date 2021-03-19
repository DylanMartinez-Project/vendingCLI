package pizzabuilder.materials;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaTest {

    @Test
    public void plain_pizza_is_priced_correctly() {

        Pizza testPizza = new Pizza();

        BigDecimal expectedPrice = new BigDecimal(4.99);
        BigDecimal actualPrice = testPizza.getTotalPrice();

        Assert.assertEquals(expectedPrice, actualPrice);
    }

    @Test
    public void two_topping_pizza_is_priced_correctly() {

        Pizza testPizza = new Pizza();

        Topping mushroom = new Mushroom();
        Topping cheese = new Cheese();

        testPizza.addTopping(mushroom);
        testPizza.addTopping(cheese);

        BigDecimal expectedPrice = new BigDecimal(9.99);
        BigDecimal actualPrice = testPizza.getTotalPrice();

        Assert.assertEquals(expectedPrice, actualPrice);
    }


}