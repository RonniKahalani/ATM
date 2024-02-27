package com.atm.account;

import com.atm.customer.Customer;

/**
 * Account interface.
 */
public interface Account {

    /**
     * Returns a Customer instance.
     * @return
     */
    Customer getOwner();
    double getBalance();
    void deposit(double amount);
    boolean withdraw(double amount);
}
