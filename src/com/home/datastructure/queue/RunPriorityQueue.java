package com.home.datastructure.queue;

public class RunPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(5);
        priorityQueue.enqueue(3);
        priorityQueue.print();
        priorityQueue.enqueue(5);
        priorityQueue.print();
        priorityQueue.enqueue(2);
        priorityQueue.print();
        priorityQueue.enqueue(4);
        priorityQueue.print();
        priorityQueue.enqueue(1);
        priorityQueue.print();
        System.out.println("Size:" + priorityQueue.size());

        System.out.println("Removed: " + priorityQueue.dequeue());
        priorityQueue.print();
        System.out.println("Removed: " + priorityQueue.dequeue());
        priorityQueue.print();
        System.out.println("Removed: " + priorityQueue.dequeue());
        priorityQueue.print();
        System.out.println("Removed: " + priorityQueue.dequeue());
        priorityQueue.print();
        System.out.println("Removed: " + priorityQueue.dequeue());
        System.out.println("Size:" + priorityQueue.size());
    }
}
