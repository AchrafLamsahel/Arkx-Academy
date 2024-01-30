package org.ArkAcademy.week2.exceptionHandling.challange;

public class TaskCustomException {
    public static void main(String[] args) {
        try {
            int userInput = -5;
            if (userInput < 0) {
                throw new CustomException("Input must be a positive number.");
            }
            System.out.println("Valid input: " + userInput);
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
