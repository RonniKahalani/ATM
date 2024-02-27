package com.atm.account;

import com.atm.customer.BasicCustomer;

public interface Account {

    BasicCustomer getOwner();
    double getBalance();
    void deposit(double amount);
    boolean withdraw(double amount);
}
