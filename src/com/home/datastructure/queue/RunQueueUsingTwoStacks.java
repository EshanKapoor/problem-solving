package com.home.datastructure.queue;

public class RunQueueUsingTwoStacks {
    public static void main(String[] args) {
        QueueUsingTwoStacks<Integer> queue = new QueueUsingTwoStacks<>();
        queue.enqueue(2);
        queue.enqueue(4);
        System.out.println(queue.peek());
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());//empty queue - throws exception
    }
}
