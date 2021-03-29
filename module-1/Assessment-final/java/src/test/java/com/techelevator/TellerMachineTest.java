package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TellerMachineTest {

    @Test
    public void can_instantiate_a_tellerMachine_object() {

        TellerMachine atm = new TellerMachine("The Iron Bank of Braavos"
                , new BigDecimal("34.23")
                , new BigDecimal("12.23")
        );

        Assert.assertEquals("The Iron Bank of Braavos", atm.getManufacturer());

        BigDecimal expectedDeposit = new BigDecimal("34.23");
        Assert.assertEquals(expectedDeposit, atm.getDeposits());

        BigDecimal expectedWithdrawal = new BigDecimal("12.23");
        Assert.assertEquals(expectedWithdrawal, atm.getWithdrawals());

        BigDecimal expectedBalance = new BigDecimal("22.00");
        Assert.assertEquals(expectedBalance, atm.getBalance());
    }

    @Test
    public void valid_cards_that_starts_with_5() {

        TellerMachine atm = new TellerMachine("The Iron Bank of Braavos"
                , new BigDecimal("34.23")
                , new BigDecimal("12.23")
        );

        String testCard = "5920188834511114";
        boolean actualResult = atm.isValidCard(testCard);

        Assert.assertTrue(actualResult);
    }

    @Test
    public void valid_cards_that_starts_with_4() {

        TellerMachine atm = new TellerMachine("The Iron Bank of Braavos"
                , new BigDecimal("34.23")
                , new BigDecimal("12.23")
        );

        String testCard1 = "4920188834511";
        boolean actualResult1 = atm.isValidCard(testCard1);
        Assert.assertTrue(actualResult1);

        String testCard2 = "4920188834511123";
        boolean actualResult2 = atm.isValidCard(testCard2);
        Assert.assertTrue(actualResult2);
    }

    @Test
    public void valid_cards_that_starts_with_3() {

        TellerMachine atm = new TellerMachine("The Iron Bank of Braavos"
                , new BigDecimal("34.23")
                , new BigDecimal("12.23")
        );

        String testCard1 = "3420188834";
        boolean actualResult1 = atm.isValidCard(testCard1);
        Assert.assertTrue(actualResult1);

        String testCard2 = "372018";
        boolean actualResult2 = atm.isValidCard(testCard2);
        Assert.assertTrue(actualResult2);


    }

    @Test
    public void invalid_cards_test() {

        TellerMachine atm = new TellerMachine("The Iron Bank of Braavos"
                , new BigDecimal("34.23")
                , new BigDecimal("12.23")
        );

        String testCard1 = "7420123";
        boolean actualResult1 = atm.isValidCard(testCard1);
        Assert.assertFalse(actualResult1);

        String testCard2 = "5potatocard11122";
        boolean actualResult2 = atm.isValidCard(testCard2);
        Assert.assertFalse(actualResult2);

    }
}