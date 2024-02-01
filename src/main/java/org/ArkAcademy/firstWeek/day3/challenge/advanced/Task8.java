package org.ArkAcademy.firstWeek.day3.challenge.advanced;

public class Task8 {
    public static void main(String[] args) {
        //Challenge 8: Sum of Squares with While Loop
        int start = 1;
        int end = 5;
        int sumOfSquares = 0;
        while( start <= end ) {
            // sumOfSquares = sumOfSquares + start * start;
            sumOfSquares += start * start; // ( Affictation )
            start++;
        }
        System.out.println("The sum of the squares of numbers from 1 to 5 is: " + sumOfSquares);
    }
}
