package com.atm.account;

import com.atm.customer.BasicCustomer;

public class BasicAccount implements Account {
    private BasicCustomer owner;
    private double balance;

    public BasicAccount(BasicCustomer owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    @Override
    public BasicCustomer getOwner() {
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
