package com.home.datastructure.heap;

import java.util.Arrays;

//Heap is a Complete Binary Tree. (Not Complete Binary Search Tree)
public class Heap {
    private int capacity = 10;
    private int size;
    private int[] items = new int[capacity];

    private boolean hasParent(int childIndex) {
        return parentIndex(childIndex) >= 0;
    }

    private boolean hasLeftChild(int parentIndex) {
        return leftChildIndex(parentIndex) < size;
    }

    private boolean hasRightChild(int parentIndex) {
        return rightChildIndex(parentIndex) < size;
    }


    private int parentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private int leftChildIndex(int parentIndex) {
        return parentIndex * 2 + 1;
    }

    private int rightChildIndex(int parentIndex) {
        return parentIndex * 2 + 2;
    }


    private int parent(int childIndex) {
        return items[parentIndex(childIndex)];
    }

    private int leftChild(int parentIndex) {
        return items[leftChildIndex(parentIndex)];
    }

    private int rightChild(int parentIndex) {
        return items[rightChildIndex(parentIndex)];
    }

    private void swap(int firstIndex, int secondIndex) {
        int temp = items[firstIndex];
        items[firstIndex] = items[secondIndex];
        items[secondIndex] = temp;
    }

    private void ensureExtraCapacity() {
        if (size == capacity) {
            System.out.println("Doubling the capacity");
            items = Arrays.copyOf(items, capacity * 2);
            capacity = capacity * 2;
        }
    }

    public void insert(int value) {
        ensureExtraCapacity();
        items[size++] = value;
        bubbleUp();
    }

    private void bubbleUp() {
        int index = size - 1;
        while (hasParent(index) && items[index] > parent(index)) {
            swap(index, parentIndex(index));
            index = parentIndex(index);
        }
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException("Heap is empty!");

        int root = items[0];
        items[0] = items[--size];
        bubbleDown();
        return root;
    }

    private void bubbleDown() {
        int index = 0;
        int parent = items[index];
        while (hasLeftChild(index)) {
            int largerChildIndex = leftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
                largerChildIndex = rightChildIndex(index);
            }

            if (parent > items[largerChildIndex]) {
                break;
            } else {
                swap(index, largerChildIndex);
                index = largerChildIndex;
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
