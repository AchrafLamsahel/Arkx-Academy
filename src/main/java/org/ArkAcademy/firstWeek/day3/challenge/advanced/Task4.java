package org.ArkAcademy.firstWeek.day3.challenge.advanced;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        // Challenge 4: Factorial Calculator with For Loop
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number positive : ");
        int number = scanner.nextInt();
        int var=1;
        for (int i = number; i > 0; i--) {
            var = var*i;
        }
        System.out.println("Factorielle of "+number+ " is  "+ var);
    }
}
