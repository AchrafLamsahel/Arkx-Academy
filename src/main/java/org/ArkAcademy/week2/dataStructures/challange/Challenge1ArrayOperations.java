package org.ArkAcademy.week2.dataStructures.challange;

import java.util.Arrays;

public class Challenge1ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = { 1 , -1 , 6 , 87 , 89 , 4 , 129 , 7 , 11 };
        System.out.println("Somme Of Array : " + sumOfArray(numbers));
        System.out.println(" Max Of Array  : " + maxOfArray(numbers));
        System.out.println(" Min Of Array  : " + minOfArray(numbers));
        System.out.println(" 1ére Methode  : Reverse ==> " + Arrays.toString(revertArray(numbers)));
        System.out.println(" find Elements from Array : " + binarySearch(numbers, -1)); // Binary Search
        System.out.println(" 2éme Methode  : Reverse ==> " + Arrays.toString(reverseArray(numbers)));
        // On peux Utiliser Les Stream
        //Arrays.stream(numbers).max() , min() , sum() .....
    }

    private static int maxOfArray(int[] array) {
        if (!(array.length == 0)) {
            int iMax = array[0];
            for (int i : array) {
                if (i > iMax) {
                    iMax = i;
                }
            }
            return iMax;
        } else {
            throw new RuntimeException("array is vide");
        }

    }

    private static int minOfArray(int[] array) {
        if (!(array.length == 0)) {
            int iMin = array[0];
            for (int i : array) {
                if (i < iMin) {
                    iMin = i;
                }
            }
            return iMin;
        } else {
            throw new RuntimeException("Array Is vide");
        }

    }

    private static int sumOfArray(int[] array) {
        int somme = 0;
        for (int i : array) {
            somme = somme + i;
        }
        return somme;
    }

    // Binary Search
    private static int binarySearch(int[] array, int numberToFount) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middlePossition = (low + high) / 2;
            int middleNumber = array[middlePossition];
            if (numberToFount == middleNumber) {
                return middlePossition;
            }
            if (numberToFount < middleNumber) {
                high = middlePossition - 1;
            } else {
                low = middlePossition + 1;
            }
        }
        return -1;
    }

    // 1 Methode
    private static int[] revertArray(int[] array) {
        int low = 0;
        int high = array.length - 1;
        int[] reverseArray = new int[array.length];
        for (int i = 0; i <= high; i++) {
            reverseArray[i] = array[high - i];
        }
        return reverseArray;
    }

    // 2 Methode
    private static int[] reverseArray(int[] array) {
        int t;
        for (int i = 0; i < array.length / 2; i++) {
            t = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = t;
        }
        return array;
    }

}
