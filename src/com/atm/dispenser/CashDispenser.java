package com.atm.dispenser;

public class CashDispenser implements ICashDispenser {
    @Override
    public void dispenseCash(double amount) {
        // Basic cash dispensing logic
        System.out.println("Dispensing cash: $" + amount);
    }
}
