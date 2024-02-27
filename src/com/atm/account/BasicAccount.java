package com.atm.account;

import com.atm.customer.Customer;

/**
 * Basic Account Implementation.
 */
public class BasicAccount implements Account {
    private Customer owner;
    private double balance;

    public BasicAccount(Customer owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    /**
     * @see com.atm.customer.Customer
     */
    @Override
    public Customer getOwner() {
        return owner;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. Current balance: $" + balance);
            return true;
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
            return false;
        }
    }
}
