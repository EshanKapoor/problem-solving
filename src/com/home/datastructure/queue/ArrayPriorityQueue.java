package com.home.datastructure.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayPriorityQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(2);
        q.add(8);
        q.add(4);
        q.add(1);
        System.out.println(q);
        System.out.println(q.remove());
    }
}
