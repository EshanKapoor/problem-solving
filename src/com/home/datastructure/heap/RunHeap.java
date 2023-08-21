package com.home.datastructure.heap;

public class RunHeap {
    public static void main(String[] args) {
        Heap heap = new Heap();
        int[] numbers = {5, 8, 3, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            heap.insert(numbers[i]);
        }


        //To get elements in descending order:
        //since this is a max heap, if we remove elements one by one from root,
        //each time we will get the max value.
        while (!heap.isEmpty())
            System.out.print(heap.remove() + " ");
    }
}
