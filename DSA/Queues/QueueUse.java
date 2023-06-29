package com.DSA.Queues;

public class QueueUse {
    public static void main(String[] args) throws QueueEmptyException {
//        QueueUsingArrays queue = new QueueUsingArrays(3);
        QueueUsingLinkedList<Integer> queue = new QueueUsingLinkedList<>();
        queue.enqueue(10);
        queue.enqueue(20);
//        System.out.println(queue.size());
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.size());
//        System.out.println(queue.front());
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}
