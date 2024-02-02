package org.ArkAcademy.week2.dataStructures.challange;

import java.util.Stack;

public class Challenge3StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Is stack empty? " + stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();

        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}
