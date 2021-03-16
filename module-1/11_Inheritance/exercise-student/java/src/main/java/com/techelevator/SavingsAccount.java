package com.techelevator;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolderName, String accountNumber) {
        super(accountHolderName, accountNumber);
    }

    public SavingsAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber, balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (super.getBalance() <= amountToWithdraw) // if withdrawl is possible
            return super.getBalance();
        else if (super.getBalance() - amountToWithdraw <= 150) {  // if your withdrawl doesnt bring you below -100
            super.withdraw(amountToWithdraw + 2);
        } else if (super.getBalance() - amountToWithdraw >= 150) {  // if your withdrawl doesnt bring you below 150
            super.withdraw(amountToWithdraw);

        }
        return super.getBalance();
    }

}