package org.ArkAcademy.week2.dataStructures.challange;

public class Challenge3StackImplementation {
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.peek();

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
class SimpleStack {
    private static final int MAX_SIZE = 100;
    private int[] stackArray;
    private int top;
    public SimpleStack() {
        stackArray = new int[MAX_SIZE];
        top = -1;
    }

    // Push operation: Add an element to the top of the stack
    public void push(int element) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = element;
            System.out.println("Pushed element: " + element);
        } else {
            System.out.println("Stack overflow. Cannot push element: " + element);
        }
    }

    // Pop operation: Remove the element from the top of the stack
    public void pop() {
        if (!isEmpty()) {
            int poppedElement = stackArray[top--];
            System.out.println("Popped element: " + poppedElement);
        } else {
            System.out.println("Stack underflow. Cannot pop from an empty stack.");
        }
    }

    // Peek operation: Get the element at the top of the stack without removing it
    public void peek() {
        if (!isEmpty()) {
            int peekedElement = stackArray[top];
            System.out.println("Peeked element: " + peekedElement);
        } else {
            System.out.println("Stack is empty. Cannot peek.");
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }
}