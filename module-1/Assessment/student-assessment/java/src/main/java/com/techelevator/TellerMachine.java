package com.techelevator;

public class TellerMachine {

    private String manufacturer;
    private double deposits;
    private double withdrawals;
    private double balance;

    public TellerMachine(String manufacturer, double deposits, double withdrawals) {
        this.manufacturer = manufacturer;
        this.deposits = deposits;
        this.withdrawals = withdrawals;
    }

    public TellerMachine() {

    }

    public void addDeposit(double deposits) {
        balance = this.balance + deposits;
    }

    public void doWithdrawal(double withdrawals) {
        balance = this.balance - withdrawals;
    }

    public double getBalance() {
        return balance;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    public void setWithdrawals(double withdrawals) {
        this.withdrawals = withdrawals;
    }

    public boolean checkCardNumber(String cardNumber) {
        if (cardNumber.length() == 16 && cardNumber.charAt(0) == 5) {
            return true;

        } else if (cardNumber.length() == 14 || cardNumber.length() == 13 && cardNumber.charAt(0) == 4) {
            return true;
        } else if (cardNumber.charAt(0) == 3 && cardNumber.charAt(1) == 4 || cardNumber.charAt(0) == 3 && cardNumber.charAt(1) == 7) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ATM - {" + manufacturer + " }" +
                "-  { "+ balance +
                " }";
    }
}
