package org.ArkAcademy.week2.InterfaceAbstraction.Challenge2BankingSystemwithTransactions;

public interface Transactable {
    void deposit(double amount);
    void withdraw(double amount);
    void displayTransactionHistory();
}
