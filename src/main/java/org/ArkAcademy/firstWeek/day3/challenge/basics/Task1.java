package org.ArkAcademy.firstWeek.day3.challenge.basics;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Challenge 1: Even or Odd?
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int userNumber =  scanner.nextInt();
        if( userNumber % 2 == 0){
            System.out.println("The number " + userNumber + " is even.");
        } else {
            System.out.println("The number " + userNumber + " is odd.");
        }
    }
}
