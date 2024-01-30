package day2.challenge.advanced;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        // Challenge 9: Ticket Price Calculator
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a student ID? (true/false): ");
        boolean hasStudentID = scanner.nextBoolean();

        double ticketPrice;
        if (age <= 12) {
            ticketPrice = 5.0;
        } else if (age >= 13 && age <= 17) {
            ticketPrice = 8.0;
        } else if (age >= 18 && hasStudentID) {
            ticketPrice = 10.0;
        } else {
            ticketPrice = 15.0;
        }
        System.out.println("The ticket price is: $" + ticketPrice);


    }
}
