package org.ArkAcademy.firstWeek.day2.challenge.advanced;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Challenge 4: Positive/Negative/Zero Checker
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number > 0) {
            System.out.println("Positive.");
        } else if (number < 0) {
            System.out.println("Negative.");
        } else {
            System.out.println("Zero.");
        }
    }
}
