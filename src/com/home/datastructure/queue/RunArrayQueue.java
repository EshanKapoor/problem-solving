package com.home.datastructure.queue;

public class RunArrayQueue {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(Integer.class, 4);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(5);
        System.out.println("Size : " + queue.size());
        System.out.println(queue.peek());
        queue.enqueue(8);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(7);
        queue.print();
        System.out.println(queue.peek());
        System.out.println("Size : " + queue.size());


        ArrayQueue strQueue = new ArrayQueue(String.class, 10);
        strQueue.enqueue("One");
        strQueue.enqueue("Four");
        strQueue.enqueue("Seven");
        strQueue.enqueue("Nine");
        strQueue.dequeue();
        strQueue.dequeue();
        strQueue.enqueue("Three");
        strQueue.print();
    }
}
