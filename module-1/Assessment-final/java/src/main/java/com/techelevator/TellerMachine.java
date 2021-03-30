package com.techelevator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TellerMachine {

    private String manufacturer;
    private BigDecimal deposits;
    private BigDecimal withdrawals;
    private BigDecimal balance;

    public TellerMachine(String manufacturer, BigDecimal deposits, BigDecimal withdrawals) {
        this.manufacturer = manufacturer;
        this.deposits = deposits;
        this.withdrawals = withdrawals;
        this.balance = this.deposits.subtract(this.withdrawals);
    }



    public boolean isValidCard(String cardNumber) {

        // Check to see if it doesn't contain digits
        try {
            Long digitsTest = Long.parseLong(cardNumber);
        } catch (NumberFormatException e) {
            return false;
        }

        String firstPosition = cardNumber.substring(0,1);
        String secondPosition = cardNumber.substring(1,2);

        int cardLength = cardNumber.length();

        if (firstPosition.equals("5") && cardLength == 16) {
            return true;
        } else if (firstPosition.equals("4") && (cardLength == 13 || cardLength == 16)) {
            return true;
        }  else if (firstPosition.equals("3") && (secondPosition.equals("4") || secondPosition.equals("7"))) {
            return true;
        }

        return false;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public BigDecimal getDeposits() {
        return deposits;
    }

    public BigDecimal getWithdrawals() {
        return withdrawals;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "ATM - {" + manufacturer + "}-{$"
                + this.balance.setScale(2, RoundingMode.HALF_UP) + "}";
    }
}
