package com.techelevator;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(String accountHolderName, String accountNumber){
        super(accountHolderName, accountNumber);
    }
    public CheckingAccount(String accountHolderName, String accountNumber, int balance) {
        super(accountHolderName, accountNumber,balance);
    }

    @Override
    public int withdraw(int amountToWithdraw) {
        if (super.getBalance() >= amountToWithdraw) // if withdrawl is possible
            return super.withdraw(amountToWithdraw);  //

        else if(super.getBalance() - amountToWithdraw  >= -100){  // if your withdrawl doesnt bring you below -100
            super.withdraw(amountToWithdraw + 10);
        }
        return super.getBalance();
    }
}
