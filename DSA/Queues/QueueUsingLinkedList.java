package com.DSA.Queues;

public class QueueUsingLinkedList<T> {
    private NodeForQueue<T> front;
    private NodeForQueue<T> rear;
    int size;

    public QueueUsingLinkedList() {
        size = 0;
        front = null;
        rear = null;

    }

    public void enqueue(T element) {
        if (size == 0) {
            front = new NodeForQueue<>(element);
            rear = front;
            front.next = null;
            size++;
        } else {
            rear.next = new NodeForQueue<>(element);
            size++;
            rear = rear.next;
            rear.next = null;
        }
    }

    public T dequeue() throws QueueEmptyException {
        if(size==0) {
            throw new QueueEmptyException();
        }
        T temp = front.data;
        front = front.next;
        if(front==null){    //when all the elements are removed, front will point to null but rear still points to the element, hence
            rear=null;
        }
        size--;
        return temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T front() throws QueueEmptyException{
        if(front==null)
            throw new QueueEmptyException();
        return front.data;
    }
}
