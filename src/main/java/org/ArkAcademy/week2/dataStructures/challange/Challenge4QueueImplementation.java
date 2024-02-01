package org.ArkAcademy.week2.dataStructures.challange;

import java.io.IOException;
import java.util.ArrayList;

public class Challenge4QueueImplementation {
    public static void main(String[] args) {
        BasicQueue queue = new BasicQueue();

        System.out.println("Is queue empty? " + queue.isEmpty());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.peek();

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        System.out.println("Is queue empty? " + queue.isEmpty());
    }
}

class BasicQueue {
    private ArrayList<Integer> queueList;

    public BasicQueue() {
        queueList = new ArrayList<>();
    }

    // Enqueue operation: Add an element to the back of the queue
    public void enqueue(int element) {
        queueList.add(element);
        System.out.println("Enqueued element: " + element);
    }

    // Dequeue operation: Remove the element from the front of the queue
    public void dequeue() {
        if (!isEmpty()) {
            int dequeuedElement = queueList.remove(0);
            System.out.println("Dequeued element: " + dequeuedElement);
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
    }

    // Peek operation: Get the element at the front of the queue without removing it
    public void peek() {
        if (!isEmpty()) {
            int frontElement = queueList.get(0);
            System.out.println("Peeked element: " + frontElement);
        } else {
            System.out.println("Queue is empty. Cannot peek.");
        }
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return queueList.isEmpty();
    }
}