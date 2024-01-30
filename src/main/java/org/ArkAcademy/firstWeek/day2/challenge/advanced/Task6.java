package org.ArkAcademy.firstWeek.day2.challenge.advanced;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        // Challenge 6: BMI Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre weight : ");
        double weight = scanner.nextDouble();
        System.out.println("Entre height : ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is: " + bmi);
    }
}
