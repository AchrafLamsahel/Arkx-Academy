package org.ArkAcademy.firstWeek.day3.challenge.advanced;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Challenge 2: Weekday Name
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) representing a day of the week: ");
        int dayNumber = scanner.nextInt();
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                return;
        }
        System.out.println("The corresponding day is: " + dayName);

    }
}

