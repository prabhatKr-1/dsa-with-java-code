package com.DSA.Stack;

public class StackUsingLL<T> {
    private NodeForStack<T> head;
    private NodeForStack<T> tail;
    private int size;

    public int size() {
        return size;
    }

    public void push(T element) {
        NodeForStack<T> newNode = new NodeForStack<>(element);
        newNode.next = head;
        head = newNode;
        size++;

    }

    public T pop() throws StackEmptyException {
        if (head == null)
            throw new StackEmptyException();
        T temp = head.data;
        head = head.next;   //we don't have to worry about  space as garbage collector will take care of it
        size--;
        return temp;
    }

    public T top() throws StackEmptyException {
        if (head == null)
            throw new StackEmptyException();
        return head.data;

    }

    public boolean isEmpty() {
        return size == 0;
    }

}
