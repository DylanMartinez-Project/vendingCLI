package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.*;

public class FlowerShopOrderTest {

    @Test
    public void calculateDeliveryTotal() {
        BigDecimal total = BigDecimal.ZERO;

        BigDecimal expected = new BigDecimal(3.99);


        FlowerShopOrder orderTest = new FlowerShopOrder("TestBouquet",5);
        Assert.assertEquals(total.setScale(2,RoundingMode.HALF_UP).add(expected).setScale(2,RoundingMode.HALF_UP),orderTest.calculateDeliveryTotal(false,"20000"));    }

    @Test
    public void can_instantiate_flower_order() {

        FlowerShopOrder testOrder = new FlowerShopOrder("tester",45);
        Assert.assertEquals("tester", testOrder.getBouquetType());

        Assert.assertEquals(45,testOrder.getNumberOfRosesAdded());
    }

}