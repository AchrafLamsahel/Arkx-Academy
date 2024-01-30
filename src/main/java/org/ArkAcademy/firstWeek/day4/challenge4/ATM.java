package org.ArkAcademy.firstWeek.day4.challenge4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATM {
    private Map<String, BankAccount> accounts;

    public ATM() {
        this.accounts = new HashMap<>();
    }

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the ATM!");

        while (true) {
            System.out.print("Enter your account number: ");
            String accountNumber = scanner.nextLine();

            if (!accounts.containsKey(accountNumber)) {
                System.out.println("Account not found. Please try again.");
                continue;
            }

            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            BankAccount currentAccount = accounts.get(accountNumber);
            if (!currentAccount.verifyPin(enteredPin)) {
                System.out.println("Incorrect PIN. Please try again.");
                continue;
            }

            displayMenu();

            int choice;
            try {
                choice = scanner.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Balance: $ :" + currentAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    int depositAmount = scanner.nextInt();
                    currentAccount.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: $" + currentAccount.getBalance());
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    int withdrawalAmount = scanner.nextInt();
                    if (currentAccount.withdraw(withdrawalAmount)) {
                        System.out.println("Withdrawal successful. New balance: $" + currentAccount.getBalance());
                    }
                    break;
                case 4:
                    displayTransactionHistory(currentAccount);
                    break;
                case 5:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
    private void displayMenu() {
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. View Transaction History");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private void displayTransactionHistory(BankAccount account) {
        System.out.println("Transaction History for Account " + account.getAccountNumber() + ":");
        for (Transaction transaction : account.getTransactionHistory()) {
            System.out.println(transaction.type + ": $" + transaction.amount);
        }
    }

}
