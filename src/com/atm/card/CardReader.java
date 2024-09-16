package com.atm.card;

import com.atm.account.Account;
import com.atm.customer.Customer;

import java.util.HashMap;
import java.util.Map;

public class CardReader implements ICardReader {
    private final Map<String, ICard> validCards = new HashMap<String, ICard>()
    {{
        put("1234567890123456", new Card("1234567890123456", "1234", new Account(new Customer("John", "", "Doe"), 1000.0)));
        put("9876543210987654", new Card( "9876543210987654", "4321", new Account(new Customer("Jane", "", "Smith"), 2000.0)));
    }};

    public ICard validateCard(String cardNumber) {
        if (cardNumber != null && validCards.containsKey(cardNumber)) {
            return validCards.get(cardNumber);
        }
        return null;
    }
}