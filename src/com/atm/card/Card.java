package com.atm.card;

import com.atm.account.Account;

public interface Card {
    public Account getAccount();
    public String getCardNumber();
    public String getPin();
}
