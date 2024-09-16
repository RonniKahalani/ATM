package com.atm.security;

public interface ISecuritySystem {
    boolean authenticate(String correctPin, String pin);
}
