package day3.challenge.advanced;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Challenge 1: Positive or Negative
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre Numbre : ");
        int number = scanner.nextInt();
        if( number > 0) {
            System.out.println("Number "+ number+" est : Possitive");
        } else if (number < 0) {
            System.out.println("Number "+ number+" est : Negative");
        }else {
            System.out.println("Number "+ number+" est : null");
        }
    }
}
