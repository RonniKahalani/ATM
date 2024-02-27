package com.atm.transaction;

import com.atm.account.Account;

public interface TransactionProcessor {
    void processTransaction(Account account, double amount);
}