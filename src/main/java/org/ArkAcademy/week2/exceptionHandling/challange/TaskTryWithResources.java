package org.ArkAcademy.week2.exceptionHandling.challange;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TaskTryWithResources {
    public static void main(String[] args) {
        String filePath = "/home/achraf/Ark-Academy/Challanges-Ark-Academy/src/main/resources/test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                if(line.equals("go")){
                    reader.close();
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
