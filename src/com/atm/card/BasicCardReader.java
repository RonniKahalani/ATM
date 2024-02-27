package com.atm.card;

import com.atm.account.BasicAccount;
import com.atm.customer.BasicCustomer;

import java.util.HashMap;
import java.util.Map;

public class BasicCardReader implements CardReader {
    private final Map<String, Card> validCards = new HashMap<String, Card>()
    {{
        put("1234567890123456", new BasicCard("1234567890123456", "1234", new BasicAccount(new BasicCustomer("John", "", "Doe"), 1000.0)));
        put("9876543210987654", new BasicCard( "9876543210987654", "4321", new BasicAccount(new BasicCustomer("Jane", "", "Smith"), 2000.0)));
    }};

    public Card validateCard(String cardNumber) {
        if (cardNumber != null && validCards.containsKey(cardNumber)) {
            return validCards.get(cardNumber);
        }
        return null;
    }
}