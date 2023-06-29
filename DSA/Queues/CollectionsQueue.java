package com.DSA.Queues;
import java.util.LinkedList;    //because it has implemented the Queue interface
import java.util.Queue;
public class CollectionsQueue {
    public static void main(String[] args) {
        Queue<Integer> queue;   //references are allowed but obj creation not allowed
        queue = new LinkedList<>();
        queue.add(2);
    }
}
