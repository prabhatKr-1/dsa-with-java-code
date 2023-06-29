package com.DSA.PriorityQueues;

public class PriorityQueueUse {
    public static void main(String[] args) {
        MinPriorityQueue<Integer> queue = new MinPriorityQueue<>();
        queue.insert(45, 3);
        queue.insert(1, 5);
        queue.insert(11, 1);
        queue.insert(100, 14);
        try {
            System.out.println(queue.getMin());
        } catch (PQEmptyException e) {
            System.out.println("Queue is empty");
        }
        System.out.println(queue.size());
        try {
            System.out.println("Removed " + queue.removeMin());
        } catch (PQEmptyException e) {
            System.out.println("Queue is already empty");
        }
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());



        MaxPriorityQueue<Integer> queue2 = new MaxPriorityQueue<>();
        queue2.insert(45, 3);
        queue2.insert(1, 5);
        queue2.insert(11, 1);
        queue2.insert(100, 14);
        try {
            System.out.println(queue2.getMax());
        } catch (PQEmptyException e) {
            System.out.println("Queue is empty");
        }
        System.out.println(queue2.size());
        try {
            System.out.println("Removed " + queue2.removeMax());
        } catch (PQEmptyException e) {
            System.out.println("Queue is already empty");
        }
        System.out.println(queue2.size());
        System.out.println(queue2.isEmpty());
    }
}
