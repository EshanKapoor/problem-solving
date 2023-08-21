package com.home.datastructure.queue;

public class LinkedListQueue<X> {

    private Node rear;
    private Node front;
    private int size;
    private final int capacity;

    private class Node {
        Node next;
        X data;

        Node(X data) {
            this.data = data;
            next = null;
        }
    }

    public LinkedListQueue(int capacity) {
        this.capacity = capacity;
    }

    public boolean enqueue(X data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full!");
        }

        Node newNode = new Node(data);
        if (isEmpty()) {
            rear = newNode;
            front = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        return true;
    }

    public X dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }

        X data = front.data;
        if (front == rear) {
            resetQueue();
        } else {
            front = front.next;
        }
        size--;
        return data;
    }

    public X peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        return front.data;
    }

    private boolean isEmpty() {
        if (rear == null && front == null) {
            return true;
        }
        return false;
    }

    private boolean isFull() {
        if (size == capacity) {
            return true;
        }
        return false;
    }

    private void resetQueue() {
        rear = null;
        front = null;
    }

    public int size() {
        return this.size;
    }

    public void print() {
        System.out.print("Printing Queue : ");
        for (Node head = front; head != null; head = head.next) {
            System.out.print(head.data + " ");
        }
        System.out.println();
    }
}