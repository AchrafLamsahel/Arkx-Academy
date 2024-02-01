package org.ArkAcademy.firstWeek.day2.challenge.advanced;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Challenge 5: Vowel or Consonant Checker
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre char :");
        char ch = scanner.next().charAt(0);
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }
    }
}

