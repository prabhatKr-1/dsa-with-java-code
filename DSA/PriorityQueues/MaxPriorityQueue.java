package com.DSA.PriorityQueues;

import java.util.ArrayList;

public class MaxPriorityQueue<T> {
    private ArrayList<Element<T>> heap;

    public MaxPriorityQueue() {
        heap = new ArrayList<>();
    }

    public void insert(T value, int priority) {
        heap.add(new Element<>(value, priority));    //inserting at the end
        //now up-heapify operation

        int childIndex = heap.size() - 1;
        int parentIndex = (childIndex - 1) / 2;

        while (childIndex > 0) {
            if (heap.get(childIndex).priority > heap.get(parentIndex).priority) {
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;
                parentIndex = (childIndex - 1) / 2;
            } else {
                return;
            }
        }
    }

    public T getMax() throws PQEmptyException {
        if (heap.size() == 0)
            throw new PQEmptyException();
        return heap.get(0).value;
    }

    public T removeMax() throws PQEmptyException {
        if (heap.size() == 0)
            throw new PQEmptyException();

        Element<T> removed = heap.get(0);
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);

        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        //now placing the first element at its right position
        while (leftChildIndex < heap.size()) {
            int maxIndex = parentIndex;
            if (heap.get(leftChildIndex).priority > heap.get(maxIndex).priority) {
                maxIndex = leftChildIndex;
            }
            if (heap.get(rightChildIndex).priority > heap.get(maxIndex).priority) {
                maxIndex = rightChildIndex;
            }
            if (maxIndex == parentIndex)   //no swaps needed
                break;

            //swapping
            Element<T> temp = heap.get(maxIndex);
            heap.set(maxIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);

            parentIndex = maxIndex;
            leftChildIndex = parentIndex * 2 + 1;
            rightChildIndex = parentIndex * 2 + 2;
        }


        return removed.value;
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return size() == 0;        //it's the above fn
    }
}

