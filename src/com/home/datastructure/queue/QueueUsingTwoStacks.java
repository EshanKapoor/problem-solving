package com.home.datastructure.queue;

import java.util.Stack;

public class QueueUsingTwoStacks<E> {
    private Stack<E> stack1;
    private Stack<E> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public boolean enqueue(E item) {
        stack1.push(item);
        return true;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty!");
        }
        moveStack1ToStack2();
        return stack2.pop();
    }

    public E peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return null;
        }
        moveStack1ToStack2();
        return stack2.peek();
    }

    private void moveStack1ToStack2() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
    }

    private boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
