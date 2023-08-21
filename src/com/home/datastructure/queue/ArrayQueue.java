/**
 * Circular Array Queue.
 */
package com.home.datastructure.queue;

import java.lang.reflect.Array;

public class ArrayQueue<X> {

    private X[] arr;
    private int rear;
    private int front;
    private int size;
    private final int capacity;

    public ArrayQueue(Class<X> type, int capacity) {
        this.arr = (X[]) Array.newInstance(type, capacity);
        this.rear = -1;
        this.front = -1;
        this.capacity = capacity;
    }

    public boolean enqueue(X data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full!");
        }

        if (isEmpty()) {
            rear++;
            front++;
        } else {
            rear = (rear + 1) % capacity;
        }
        arr[rear] = data;
        size++;
        return true;
    }

    public X dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }

        X data = arr[front];
        arr[front] = null;
        if (front == rear) {
            resetQueue();
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return data;
    }

    public X peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        return arr[front];
    }

    private boolean isEmpty() {
        if (rear == -1 && front == -1) {
            return true;
        }
        return false;
    }

    private boolean isFull() {
        if ((rear + 1) % capacity == front) {
            return true;
        }
        return false;
    }

    private void resetQueue() {
        rear = -1;
        front = -1;
    }

    public int size() {
        return this.size;
    }

    public void print() {
        System.out.print("Printing Queue : ");
        for (int i = front, j = 0; j < size; i = (i + 1) % capacity, j++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}