package org.ArkAcademy.week2.InterfaceAbstraction.Challenge2BankingSystemwithTransactions;

public class CheckingAccount extends BankAccount{
    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Checking Account Details:");
        System.out.println("Balance: $" + balance);
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}
