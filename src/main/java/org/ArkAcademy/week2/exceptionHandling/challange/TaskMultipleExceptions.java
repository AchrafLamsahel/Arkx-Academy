package org.ArkAcademy.week2.exceptionHandling.challange;

import java.util.Scanner;

public class TaskMultipleExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Performing division operation
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            int result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);

            // Performing array access operation
            int[] numbers = {1, 2, 3};
            System.out.print("Enter the index to access in the array: ");
            int index = scanner.nextInt();

            int value = accessArray(numbers, index);
            System.out.println("Value at index " + index + " in the array: " + value);

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    private static int divide(int numerator, int denominator) {
        // Performing division
        return numerator / denominator;
    }
    private static int accessArray(int[] array, int index) {
        // Performing array access
        return array[index];
    }
}
