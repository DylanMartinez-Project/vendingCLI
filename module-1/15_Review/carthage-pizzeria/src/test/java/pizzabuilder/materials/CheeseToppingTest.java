package pizzabuilder.materials;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class CheeseToppingTest {

    @Test
    public void cheese_topping_instantiates_correctly() {

        Topping cheeseTop = new Cheese();

        Assert.assertEquals("Cheese", cheeseTop.getName());
        Assert.assertEquals(new BigDecimal(1.50), cheeseTop.getPrice());

    }

}