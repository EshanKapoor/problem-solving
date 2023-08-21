package com.home.datastructure.queue;

public class PriorityQueue<E extends Comparable<E>> {
    private Node head;
    private int size;
    private final int capacity;

    private class Node {
        Node next;
        Node prev;
        E data;

        Node(E data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public PriorityQueue(int capacity) {
        this.capacity = capacity;
    }

    public boolean enqueue(E data) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full!");
        }

        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (null != current) {
                if (newNode.data.compareTo(current.data) <= 0) {
                    setHeadOrNext(newNode, current);
                    current.prev = newNode;
                    newNode.next = current;
                    break;
                } else {
                    if (null == current.next) {
                        current.next = newNode;
                        newNode.prev = current;
                        break;
                    }
                    current = current.next;
                }
            }
        }
        size++;
        return true;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }

        if (null != head.next) {
            head.next.prev = null;
        }
        E returnVal = head.data;
        head = head.next;
        size--;
        return returnVal;
    }

    public E peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        return head.data;
    }

    public int size() {
        return size;
    }

    public void print() {
        System.out.print("Printing Queue : ");
        for (Node current = head; current != null; current = current.next) {
            System.out.print(current.data + " ");
        }
        System.out.println();
    }

    private void setHeadOrNext(Node newNode, Node current) {
        if (isFirst(current)) {
            head = newNode;
        } else {
            current.prev.next = newNode;
        }
    }

    private boolean isFull() {
        if (size == capacity) {
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    private boolean isFirst(Node node) {
        return node == head;
    }
}
