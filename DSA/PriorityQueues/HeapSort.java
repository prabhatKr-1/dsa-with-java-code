package com.DSA.PriorityQueues;
//Wrong Code
public class HeapSort {

    public static void downHeapify(int[] arr, int i, int n) {
        int parentIndex = i;
        int leftChild = 2 * parentIndex + 1;
        int rightChild = 2 * parentIndex + 2;
        while (leftChild < n) {
            int minIndex = parentIndex;
            if (arr[minIndex] > arr[leftChild]) {
                minIndex = leftChild;
            }
            if (rightChild < arr.length && arr[minIndex] > arr[rightChild]) {
                minIndex = rightChild;
            }
            if (minIndex == i) {
                return;
            }

            int temp = arr[parentIndex];
            arr[parentIndex] = arr[minIndex];
            arr[minIndex] = temp;

            parentIndex = minIndex;
            leftChild = 2*parentIndex+1;
            rightChild = 2*parentIndex+2;
        }
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = (n/2)-1; i >=0; i--) {     //heap building
            downHeapify(arr,i,n);
        }
        //Removing elements from starting and putting them at respective last position
        for (int i = n-1; i >= 0; i--) {    //will arrange in descending order
            int temp = arr[i];
            arr[i]= arr[0];
            arr[0] = temp;
            downHeapify(arr,0,i);
        }
    }

    public static void main(String[] args) {
        int[] input = {4, 12, 15, 7, 6, 11, 17, 5};
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
        heapSort(input);
        System.out.println();

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]+" ");
        }
    }
}
