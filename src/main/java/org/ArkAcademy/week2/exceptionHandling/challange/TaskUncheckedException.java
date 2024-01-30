package org.ArkAcademy.week2.exceptionHandling.challange;

public class TaskUncheckedException {
    public static void main(String[] args) {
        try {
            String nullString = null;
            int length = nullString.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: Attempted to perform an operation on a null reference.");
            System.out.println("Details: " + e.getMessage());
        }

    }
}
