package org.ArkAcademy.firstWeek.day2.challenge.advanced;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Challenge 3: Time of Day Greeting
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current hour (in 24-hour format): ");
        int hour = scanner.nextInt();

        if (hour >= 5 && hour <= 11) {
            System.out.println("Good morning.");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("Good afternoon.");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Good evening.");
        } else {
            System.out.println("Good night.");
        }

    }
}
