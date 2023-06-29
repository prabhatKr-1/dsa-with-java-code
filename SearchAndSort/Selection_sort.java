package com.SearchAndSort;

// selection sort:In each iteration, we find the smallest element in the array and swap it to its right position
import java.util.Scanner;

public class Selection_sort {

    public static int[] arr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        return a;
    }

    // Selection sort function
    public static int[] selectionSort(int[] arr) {

        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex=i;
            int temp;
            for (int j = i + 1; j < length ; j++) {

                if (arr[j] < arr[i]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = arr();
        System.out.println("The array before sorting:");
        printArr(a);
        a = selectionSort(a);
        System.out.println("\nThe array after sorting:");
        printArr(a);
    }
}
