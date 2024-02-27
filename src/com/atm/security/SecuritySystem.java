package com.atm.security;

public interface SecuritySystem {
    boolean authenticate(String correctPin, String pin);
}
