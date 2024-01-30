package day2.challenge.advanced;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Challenge 2: Grade Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your exam score (0 to 100): ");
        int score = scanner.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 80 && score < 90) {
            System.out.println("Grade: B");
        } else if (score >= 70 && score < 80) {
            System.out.println("Grade: C");
        } else if (score >= 60 && score < 70) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

    }
}
