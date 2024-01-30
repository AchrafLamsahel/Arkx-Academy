package org.ArkAcademy.firstWeek.day4.challenge4;

public class Main {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("123456", 1234,2000);
        BankAccount account2 = new BankAccount("789012", 5678,3000);

        ATM atm = new ATM();
        atm.addAccount(account1);
        atm.addAccount(account2);

        atm.start();

    }
}
