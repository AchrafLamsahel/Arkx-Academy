package org.ArkAcademy.firstWeek.day3.challenge.advanced;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // Challenge 9: Leap Year Checker with If-Else
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }
}
