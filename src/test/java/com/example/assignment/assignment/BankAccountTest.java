package com.example.assignment.assignment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void testWithdrawWithSufficientFunds() {
        BankAccount account = new BankAccount(5000);
        account.withdraw(2000);
        assertEquals(3000, account.getBalance());
    }

    @Test
    void testWithdrawWithInsufficientFunds() {
        BankAccount account = new BankAccount(5000);
        Exception exception = assertThrows(InsufficientFundsException.class, () -> {
            account.withdraw(10000);
        });
        assertEquals("Insufficient funds to withdraw 10000.0", exception.getMessage());
    }
}

