package org.ArkAcademy.week2.InterfaceAbstraction.Challenge2BankingSystemwithTransactions;

public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
