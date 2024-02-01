package org.ArkAcademy.firstWeek.day3.challenge.advanced;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Challenge 3: Multiplication Table with While Loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int counter = 1;
        System.out.println("Multiplication Table for " + number + ":");
        while (counter <= 10) {
            int result = number * counter;
            System.out.println(number + " * " + counter + " = " + result);
            counter++;
        }
    }
}

