package day4.challenge4;

import java.util.ArrayList;

public class BankAccount {
    private String accountNumber;
    private int pin;
    private double balance;
    private ArrayList<Transaction> transactionHistory;

    public BankAccount(String accountNumber, int pin, double balance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean verifyPin(int enteredPin) {
        return pin == enteredPin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add(new Transaction("DEPOSIT", amount));
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("WITHDRAW", amount));
            return true;
        } else {
            System.out.println("Insufficient funds!");
            return false;
        }
    }
    public ArrayList<Transaction> getTransactionHistory() {
        return transactionHistory;
    }

}
