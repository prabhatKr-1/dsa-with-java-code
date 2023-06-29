package com.DSA.Queues;
//We couldn't access the data members after importing from Linked List package as they were private.
//I didn't want to make them public, hence I created this class

public class NodeForQueue<T> {
    public T data;
    public NodeForQueue<T> next;

    public NodeForQueue(T data) {
        this.data = data;
//        next=null;    //it is by default
    }

}


