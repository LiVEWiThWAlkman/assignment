package com.example.assignment.assignment;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds to withdraw " + amount);
        }
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

