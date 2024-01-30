package org.ArkAcademy.week2.exceptionHandling.challange;

import java.util.Scanner;

public class TaskNumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number as a string: ");
            String userInput = scanner.nextLine();
            int number = Integer.parseInt(userInput);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer.");
            System.out.println("Details: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
