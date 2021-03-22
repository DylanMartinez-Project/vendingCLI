package pizzabuilder.materials;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PepperoniTest {

    @Test
    public void pepperoni_topping_instantiates_correctly() {
        Topping pepperoni = new Pepperoni();
        Assert.assertEquals("Pepperoni", pepperoni.getName());
        Assert.assertEquals(new BigDecimal(3.50), pepperoni.getPrice());
    }

}