package org.ArkAcademy.week2.InterfaceAbstraction.Challenge2BankingSystemwithTransactions;

public class Main {
    public static void main(String[] args) {
        // Challenge 2: Banking System with Transactions
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        CheckingAccount checkingAccount = new CheckingAccount(500, 200);

        // Transactions
        savingsAccount.deposit(200);
        savingsAccount.withdraw(50);
        savingsAccount.displayTransactionHistory();
        savingsAccount.displayAccountDetails();

        checkingAccount.withdraw(300);
        checkingAccount.displayTransactionHistory();
        checkingAccount.displayAccountDetails();
    }
}
