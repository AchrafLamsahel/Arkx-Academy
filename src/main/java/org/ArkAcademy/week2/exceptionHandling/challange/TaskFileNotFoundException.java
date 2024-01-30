package org.ArkAcademy.week2.exceptionHandling.challange;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaskFileNotFoundException {
    public static void main(String[] args) {
        String filePath = "nonexistentfile.txt";
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            // Handling the FileNotFoundException
            System.out.println("Error: The specified file was not found.");
            System.out.println("Details: " + e.getMessage());
        }
    }
}

