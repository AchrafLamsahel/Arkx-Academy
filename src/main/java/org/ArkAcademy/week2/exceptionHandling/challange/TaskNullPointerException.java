package org.ArkAcademy.week2.exceptionHandling.challange;

public class TaskNullPointerException {
    public static void main(String[] args) {
        String text = null;
        try {
            int length = text.length();
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Error: The object reference is null.");
            System.out.println("Details: " + e.getMessage());
        }
    }
}

