package com.DSA.PriorityQueues;

import java.util.PriorityQueue;

public class InbuiltPQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        System.out.println(pq.peek());      //returns the head element
        pq.poll();     //removes the head element
        System.out.println(pq.isEmpty());
        pq.add(1);
        pq.add(2);
        pq.add(3);
        System.out.println(pq.element());   //throws exception when queue is empty while peek returns null when queue is empty
    }
}
