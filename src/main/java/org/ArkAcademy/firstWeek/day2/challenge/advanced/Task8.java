package day2.challenge.advanced;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        // Challenge 8: Number Comparison
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        if (num1 == num2) {
            System.out.println("The numbers are equal.");
        } else if (num1 > num2) {
            System.out.println("The first number is greater than the second number.");
        } else {
            System.out.println("The first number is less than the second number.");
        }

    }
}
