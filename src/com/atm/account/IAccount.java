package com.atm.account;

import com.atm.customer.ICustomer;

/**
 * Account interface.
 */
public interface IAccount {

    /**
     * Returns a Customer instance.
     * @return
     */
    ICustomer getOwner();
    double getBalance();
    void deposit(double amount);
    boolean withdraw(double amount);
}
