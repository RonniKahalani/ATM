package com.atm.dispenser;

public class BasicCashDispenser implements CashDispenser {
    @Override
    public void dispenseCash(double amount) {
        // Basic cash dispensing logic
        System.out.println("Dispensing cash: $" + amount);
    }
}
