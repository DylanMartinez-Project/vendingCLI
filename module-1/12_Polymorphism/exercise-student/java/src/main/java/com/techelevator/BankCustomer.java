package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer  {

    private String name;
    private String address;
    private String phoneNumber;
    private List<Accountable> accounts = new ArrayList<Accountable>();

    public void addAccount(Accountable newAccount){
        accounts.add(newAccount);
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Accountable[] getAccounts() {   // must return public " xxxx"
        Accountable[] tester = new Accountable [accounts.size()];
        for (int i = 0; i < tester.length; i ++){
            tester[i] = accounts.get(i);
        }
        return tester;
    }

     public boolean isVip() {
        int vipTotal = 0;
        boolean isVip = false;
        for (Accountable accountable : accounts){
            vipTotal = vipTotal + accountable.getBalance();
        }
            if(vipTotal >=25000){
                return !isVip;
            }

            return isVip;
     }

}
