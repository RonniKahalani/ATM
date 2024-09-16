package com.atm.security;

public class SecuritySystem implements ISecuritySystem {

    @Override
    public boolean authenticate(String correctPin, String pin) {
        // Basic authentication logic
        return correctPin.equals(pin);
    }
}
