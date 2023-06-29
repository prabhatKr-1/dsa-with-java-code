package com.DSA.PriorityQueues;
//We are implementing Min-Priority queue here

import java.util.ArrayList;

public class MinPriorityQueue<T> {
    protected ArrayList<Element<T>> heap;

    public MinPriorityQueue() {
        heap = new ArrayList<>();
    }

    public void insert(T value, int priority) {
        //first adding all the elements at the end of the list
        heap.add(new Element<>(value, priority));
        int childIndex = heap.size() - 1;     //index of newly inserted element
        int parentIndex = (childIndex - 1) / 2; //current parent of new element
        //if child's priority is less than parent's priority: swap
        while (childIndex > 0) {  //if childIndex==0, all the work is done,return
            if (heap.get(childIndex).priority < heap.get(parentIndex).priority) {
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex = parentIndex;   //index of the newly inserted element
                parentIndex = (childIndex - 1) / 2;     //it's current parent

            } else
                return;
        }
    }

    public T getMin() throws PQEmptyException {
        if (isEmpty())
            throw new PQEmptyException();
        return heap.get(0).value;
    }

    public T removeMin() throws PQEmptyException {
        if (isEmpty())
            throw new PQEmptyException();
        Element<T> removed = heap.get(0);
        //Replace the element at first poistion with the elemeent at last, effectively deleting the first element
        heap.set(0, heap.get(heap.size() - 1));
        heap.remove(heap.size() - 1);     //removing the last element

        //Down-heapify operation
        int parentIndex = 0;
        int leftChildIndex = 2 * parentIndex + 1;
        int rightChildIndex = 2 * parentIndex + 2;

        while (leftChildIndex < heap.size()) {
            int minIndex = parentIndex; //for now
            if (heap.get(minIndex).priority > heap.get(leftChildIndex).priority) {
                minIndex = leftChildIndex;
            }
            if (rightChildIndex < heap.size() && heap.get(minIndex).priority > heap.get(rightChildIndex).priority) {
                minIndex = rightChildIndex;
            }
            //found the index of min among the parent and children, now swap

            if (minIndex == parentIndex) {   //then no swap required

                break;
            }
            Element<T> temp = heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            parentIndex = minIndex;
            leftChildIndex = 2 * parentIndex + 1;
            rightChildIndex = 2 * parentIndex + 2;
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
