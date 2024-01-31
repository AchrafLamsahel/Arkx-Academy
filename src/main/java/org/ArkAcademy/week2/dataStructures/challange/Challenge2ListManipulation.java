package org.ArkAcademy.week2.dataStructures.challange;

import java.util.ArrayList;

public class Challenge2ListManipulation {
    public static void main(String[] args) {
        // 1- Initialize an ArrayList with some String values.
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // 2-Add a new element to the end of the ArrayList.
        stringList.add("Watermelon");

        // Print all elements of the ArrayList
        System.out.println("Elements in the ArrayList:");
        stringList.forEach(System.out::println);

        // 3-Remove an element from the ArrayList.
        String elementToRemove = "Banana";
        boolean removed = stringList.removeIf(element -> element.equals(elementToRemove));
        if (removed) {
            System.out.println("\n'" + elementToRemove + "' removed from the ArrayList.");
        } else {
            System.out.println("\n'" + elementToRemove + "' not found in the ArrayList.");
        }

        // Check if a specific element exists in the ArrayList
        String elementToCheck = "Grapes";
        boolean removed1 = stringList.removeIf(s -> s.equals(elementToCheck));
        if(removed1){
            System.out.println("\n'" + elementToCheck + "' exists in the ArrayList.");
        }else {
            System.out.println("\n'" + elementToCheck + "' not found in the ArrayList.");
        }

        // Print all elements of the modified ArrayList
        System.out.println("\nElements in the modified ArrayList:");
        stringList.forEach(System.out::println);
    }


}
