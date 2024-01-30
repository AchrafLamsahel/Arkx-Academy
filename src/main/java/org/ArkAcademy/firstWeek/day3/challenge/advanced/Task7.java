package day3.challenge.advanced;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        // Challenge 7: Vowel or Consonant with Switch
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character: ");
        char inputChar = scanner.next().charAt(0);
        switch (Character.toLowerCase(inputChar)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("The entered character is a vowel.");
                break;
            default:
                System.out.println("The entered character is a consonant.");
                break;
        }

        scanner.close();
    }
}

