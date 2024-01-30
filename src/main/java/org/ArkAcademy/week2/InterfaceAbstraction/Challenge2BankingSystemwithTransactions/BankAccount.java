package org.ArkAcademy.week2.InterfaceAbstraction.Challenge2BankingSystemwithTransactions;

import java.util.ArrayList;
import java.util.List;

public abstract class BankAccount implements Transactable{
    protected double balance;
    protected List<String> transactionHistory;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    // Implementing deposit method from the interface
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            String transaction = "Deposited: $" + amount;
            transactionHistory.add(transaction);
            System.out.println(transaction);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            String transaction = "Withdrawn: $" + amount;
            transactionHistory.add(transaction);
            System.out.println(transaction);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    @Override
    public void displayTransactionHistory() {
        System.out.println("Transaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    public abstract void displayAccountDetails();
}
