package org.ArkAcademy.week2.dataStructures.challange;

import static org.ArkAcademy.week2.dataStructures.challange.BinarySearch.binarySearch;

public class Challenge6BinarySearch {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetElement = 5;
        int result = binarySearch(sortedArray, targetElement);
        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result);
        } else {
            System.out.println("Element " + targetElement + " not found in the array.");
        }
        int nonExistentElement = 15;
        int resultNotFound = binarySearch(sortedArray, nonExistentElement);
        if (resultNotFound != -1) {
            System.out.println("Element " + nonExistentElement + " found at index " + resultNotFound);
        } else {
            System.out.println("Element " + nonExistentElement + " not found in the array.");
        }
    }
}
class BinarySearch {
    // Binary search method
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
