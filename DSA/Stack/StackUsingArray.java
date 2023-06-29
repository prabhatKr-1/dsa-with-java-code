package com.DSA.Stack;

public class StackUsingArray {
    private int[] data;
    private int topIndex;

    public StackUsingArray() {
        data = new int[10];
        topIndex = -1;
    }

    public StackUsingArray(int size) {
        data = new int[size];
        topIndex = -1;
    }

    public void push(int element) {
//        If the stack is full
        if (topIndex == data.length - 1)
            doubleStackCapacity();

        topIndex++;
        data[topIndex] = element;
    }

    private void doubleStackCapacity() {
//        System.out.println("Capacity Doubled to "+ 2*data.length);
        int [] temp =data;
        data = new int[2* temp.length];
//        for (int i = 0; i < temp.length; i++) {
//            data[i]= temp[i];
//        } The below function does the same thing
        System.arraycopy(temp, 0, data, 0, temp.length);
    }

    public int top() throws StackEmptyException {
//        If stack is empty i.e. topIndex = -1
//        TODO throw stackEmpty exception
        if (topIndex == -1)
            throw new StackEmptyException();
        return data[topIndex];
    }

    boolean isEmpty() {
        return topIndex == -1;
    }

    public int pop() {
        int temp = data[topIndex];
        topIndex--;
        return temp;
    }

    public int size() {
        return topIndex + 1;

    }
}
