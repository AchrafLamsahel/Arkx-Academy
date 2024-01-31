package org.ArkAcademy.week2.dataStructures.challange;

import java.util.Arrays;

public class Challenge1ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = {1, -1, 6, 87, 89, 4, 129, 7};
        System.out.println("Somme : " + sumOfArray(numbers));
        System.out.println(" Max : " + maxOfArray(numbers));
        System.out.println(" Min : " + minOfArray(numbers));
        System.out.println(" Reverse : " + Arrays.toString(revertArray(numbers)));
        // On peux Utiliser Les Stream
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

    private static int[] revertArray(int[] array) {
        int low = 0;
        int high = array.length-1;
        int[]  reverseArray = new int[array.length];
        for(int i = 0; i <= high; i++) {
            reverseArray[i]=array[high-i];
        }
        return reverseArray;
    }
}
