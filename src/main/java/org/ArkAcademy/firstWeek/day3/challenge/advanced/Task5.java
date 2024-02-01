package org.ArkAcademy.firstWeek.day3.challenge.advanced;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Challenge 5: Guess the Number with Do-While Loop
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int userGuess;
        int numberOfGuesses = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I have selected a number between 1 and 10. Try to guess it.");
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfGuesses++;
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " attempts.");
            } else {
                if (userGuess < randomNumber) {
                    System.out.println("Try again. The number is higher.");
                } else {
                    System.out.println("Try again. The number is lower.");
                }
            }
        } while (userGuess != randomNumber);
        scanner.close();
    }
}

