package com.DSA.Queues;

public class QueueUsingArrays {
    private int[] data;
    private int front;
    private int rear;
    private int size;

    public QueueUsingArrays() {
        data = new int[5];
        front = -1;
        rear = -1;

    }

    public QueueUsingArrays(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;

    }

    public void enqueue(int element) {
        if (size == data.length) {
//            throw new QueueFullException();
            doubleCapacity();
        }
        if (size == 0) {
            front++;
        }
//        rear++;
//        if(rear==data.length)   //because we can't insert at index >= data.length even if we have space empty, hence we start inserting at the start of the array
//       this situation arises when we remove elements
//            rear=0;     //circular queue

        rear = (rear + 1) % data.length;    //same thing as above comment code

        data[rear] = element;
        size++;
    }

    private void doubleCapacity() {
        int[] temp = data;
        data = new int[2 * temp.length];
        int index = 0;
        for (int i = front; i < temp.length; i++) {
            data[index++] = temp[i];         //first the value will be stored then the index will be updated by 1
        }
        for (int i = 0; i <= front - 1; i++) {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;
    }

    public int dequeue() throws QueueEmptyException {
        if (size == 0)
            throw new QueueEmptyException();
        int temp = data[front];
//        front++;
//        if(front== data.length)     //analyze circular queue in enqueue
//            front=0;
        front = (front + 1) % data.length;  //same thing as above
        size--;
        if (size == 0) {    //when the last element is just removed
            front = -1;
            rear = -1;
        }
        return temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int front() throws QueueEmptyException {
        if (size == 0)
            throw new QueueEmptyException();
        return data[front];
    }


}
