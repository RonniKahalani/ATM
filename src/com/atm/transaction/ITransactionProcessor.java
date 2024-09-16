package com.atm.transaction;

import com.atm.account.IAccount;

public interface ITransactionProcessor {
    void processTransaction(IAccount account, double amount);
}