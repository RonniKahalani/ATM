package com.atm.card;

import com.atm.account.IAccount;

public interface ICard {
    public IAccount getAccount();
    public String getCardNumber();
    public String getPin();
}
