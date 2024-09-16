package com.atm.transaction;

import com.atm.account.IAccount;

public class TransactionProcessor implements ITransactionProcessor {

    public void processTransaction(IAccount account, double amount) {
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Transaction processed for amount: $" + amount);
            } else {
                System.out.println("Insufficient funds. Transaction failed.");
            }
        } else {
            System.out.println("Invalid account. Transaction failed.");
        }
    }
}
