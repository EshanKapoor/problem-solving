package com.home.datastructure.queue;

public class RunLinkedListQueue {
    public static void main(String[] args) {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>(5);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Size : " + queue.size());
        System.out.println(queue.peek());
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(10);
        System.out.println("Size : " + queue.size());
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(7);
        queue.print();
        System.out.println(queue.peek());
        System.out.println("Size : " + queue.size());


        LinkedListQueue<String> strQueue = new LinkedListQueue<>(5);
        strQueue.enqueue("One");
        strQueue.enqueue("Four");
        strQueue.enqueue("Seven");
        strQueue.enqueue("Nine");
        strQueue.dequeue();
        strQueue.dequeue();
        strQueue.enqueue("Three");
        strQueue.dequeue();
        strQueue.print();
        System.out.println("Size : " + strQueue.size());
    }
}
