package com.atm.card;

import com.atm.account.Account;

public class BasicCard implements Card{
    private String cardNumber;
    private String pin;
    private Account account;

    public BasicCard(String cardNumber, String pin, Account account) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }
}
