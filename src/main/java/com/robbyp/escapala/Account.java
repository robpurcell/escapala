package com.robbyp.escapala;

public class Account {
    private int balance;

    public Account() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
}