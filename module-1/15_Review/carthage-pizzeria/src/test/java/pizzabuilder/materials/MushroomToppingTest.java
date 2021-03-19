package pizzabuilder.materials;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class MushroomToppingTest {

    @Test
    public void mushroom_topping_instantiates_correctly() {

        Topping mushroom = new Mushroom();

        Assert.assertEquals("Mushroom", mushroom.getName());
        Assert.assertEquals(new BigDecimal(3.50), mushroom.getPrice());

    }

}