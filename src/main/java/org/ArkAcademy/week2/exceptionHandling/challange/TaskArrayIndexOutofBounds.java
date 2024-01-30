package org.ArkAcademy.week2.exceptionHandling.challange;

public class TaskArrayIndexOutofBounds {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            int index = 10;
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Attempted to access an element outside the bounds of the array.");
            System.out.println("Details: " + e.getMessage());
        }
    }
}
