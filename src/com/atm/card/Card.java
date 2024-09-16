package com.atm.card;

import com.atm.account.IAccount;

public class Card implements ICard {
    private String cardNumber;
    private String pin;
    private IAccount account;

    public Card(String cardNumber, String pin, IAccount account) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.account = account;
    }

    public IAccount getAccount() {
        return account;
    }
    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }
}
