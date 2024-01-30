package org.ArkAcademy.firstWeek.day2.challenge.advanced;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Challenge 1: Age Classifier
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 13) {
            System.out.println("Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager.");
        } else {
            System.out.println("Adult.");
        }
    }
}
