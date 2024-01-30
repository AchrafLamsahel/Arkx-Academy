package org.ArkAcademy.week2.exceptionHandling.challange;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskUserInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int userInput = 0;
        while (!validInput) {
            try {
                System.out.print("Enter a positive integer: ");
                userInput = scanner.nextInt();
                if (userInput > 0) {
                    validInput = true;
                } else {
                    System.out.println("Error: Please enter a positive integer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a valid integer.");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine();
            }
        }
        System.out.println("You entered: " + userInput);
        scanner.close();
    }
}

