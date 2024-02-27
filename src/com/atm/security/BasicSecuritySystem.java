package com.atm.security;

public class BasicSecuritySystem implements SecuritySystem {

    @Override
    public boolean authenticate(String correctPin, String pin) {
        // Basic authentication logic
        return correctPin.equals(pin);
    }
}
