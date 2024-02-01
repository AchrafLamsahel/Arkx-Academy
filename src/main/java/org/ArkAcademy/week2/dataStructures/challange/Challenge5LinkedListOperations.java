package org.ArkAcademy.week2.dataStructures.challange;

public class Challenge5LinkedListOperations {
    public static void main(String[] args) {
        SimpleLinkedList linkedList = new SimpleLinkedList();

        linkedList.addNode(10);
        linkedList.addNode(20);
        linkedList.addNode(30);
        linkedList.addNode(40);

        System.out.println("Linked List elements:");
        linkedList.printList();

        int length = linkedList.findLength();
        System.out.println("Length of the linked list: " + length);

        linkedList.removeNode(20);
        linkedList.removeNode(35);

        length = linkedList.findLength();
        System.out.println("Length of the linked list after removal: " + length);

        System.out.println("Linked List elements after removal:");
        linkedList.printList();

        linkedList.reverse();

        System.out.println("Linked List elements after reversal:");
        linkedList.printList();
    }
}
class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

 class SimpleLinkedList {
    private Node head;

    // Add a node to the end of the linked list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Remove a node from the linked list
    public void removeNode(int data) {
        if (head == null) {
            System.out.println("Linked list is empty. Cannot remove node.");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println("Node with data " + data + " removed from the linked list.");
            return;
        }

        Node current = head;
        Node previous = null;

        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
            System.out.println("Node with data " + data + " removed from the linked list.");
        } else {
            System.out.println("Node with data " + data + " not found in the linked list.");
        }
    }

    // Find and print the length of the linked list
    public int findLength() {
        int length = 0;
        Node current = head;

        while (current != null) {
            length++;
            current = current.next;
        }

        return length;
    }

    // Reverse the linked list
    public void reverse() {
        Node current = head;
        Node previous = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        head = previous;
    }

    // Print all elements of the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
