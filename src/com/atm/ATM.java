package com.atm;

import com.atm.account.IAccount;
import com.atm.card.CardReader;
import com.atm.card.ICard;
import com.atm.card.ICardReader;
import com.atm.dispenser.CashDispenser;
import com.atm.dispenser.ICashDispenser;
import com.atm.security.SecuritySystem;
import com.atm.security.ISecuritySystem;
import com.atm.transaction.TransactionProcessor;
import com.atm.transaction.ITransactionProcessor;

import java.util.Scanner;

/**
 * Automated Teller Machine Simulator.
 */
public class ATM {

    private static final String TXT_QUIT = "q";
    private static final String MSG_INPUT_CARDNUMBER = "Input card number (q=quit): ";
    private static final String MSG_INPUT_PINCODE = "Input pin code: ";
    private static final String MSG_INPUT_AMOUNT = "Input amount: ";
    private static final String ERR_AUTHENTICATION = "Authentication failed. Please try again.";
    private static final String ERR_INVALID_CARD = "Invalid card. Please try again.";
    private static final String MSG_QUIT_RECEIVED = "ATM quit received";


    /**
     * Main entry point.
     *
     * @param args
     */
    public static void main(String[] args) {
        // Instantiate components
        ICardReader cardReader = new CardReader();
        ITransactionProcessor transactionProcessor = new TransactionProcessor();
        ICashDispenser cashDispenser = new CashDispenser();
        ISecuritySystem securitySystem = new SecuritySystem();

        // Simulate ATM operations
        boolean quit = false;
        Scanner scanner = new Scanner(System.in);

        while (!quit) {
            System.out.println("*******************************");
            System.out.println("**   ATM Simulator Program   **");
            System.out.println("*******************************");
            System.out.println(MSG_INPUT_CARDNUMBER);
            String cardNumber = scanner.next();

            if (!cardNumber.equals(TXT_QUIT)) {
                System.out.println(MSG_INPUT_PINCODE);
                String pinCode = scanner.next();

                ICard card = cardReader.validateCard(cardNumber);
                if (card != null) {
                    IAccount account = card.getAccount();
                    if (securitySystem.authenticate(card.getPin(), pinCode)) {

                        System.out.println(MSG_INPUT_AMOUNT);
                        double amount = Double.parseDouble(scanner.next());

                        transactionProcessor.processTransaction(account, amount);
                        cashDispenser.dispenseCash(amount);
                    } else {
                        System.out.println(ERR_AUTHENTICATION);
                    }
                } else {
                    System.out.println(ERR_INVALID_CARD);
                }
            } else {
                quit = true;
                System.out.println(MSG_QUIT_RECEIVED);
            }
        }
    }
}
