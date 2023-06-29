package com.DSA.Stack;
//We couldn't access the data members after importing from Linked List package as they were private.
//I didn't want to make them public, hence I created this class

public class NodeForStack<T> {
    public T data;
    public NodeForStack<T> next;

    public NodeForStack(T data) {
        this.data = data;
//        next=null;    //it is by default
    }

}


