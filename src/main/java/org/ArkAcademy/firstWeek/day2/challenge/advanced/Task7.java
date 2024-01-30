package day2.challenge.advanced;


import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Challenge 7: Days in a Month
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month (1 to 12): ");
        int month = scanner.nextInt();
        int daysInMonth;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            case 2:
                daysInMonth = 28;
                break;
            default:
                System.out.println("Invalid month entered. Please enter a number between 1 and 12.");
                return;
        }

        System.out.println("Number of days in month " + month + ": " + daysInMonth);

    }
}
