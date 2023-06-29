package com.SearchAndSort;
// In bubble sort, after nth round, the nth largest element is in the right place
//careful in the way the comparisons are done. It's different from selection sort
//First we compare element 1 and 2,and then we compare element 2 and 3 and so on

import java.util.Scanner;

public class Bubble_Sort {
    public static int[] BubbleSorter(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int temp;
            for (int j = 0; j < arr.length-i-1; j++) {

                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }

        return arr;
    }

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

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = arr();
        System.out.println("The entered array is:");
        printArr(a);
        a=BubbleSorter(a);

        System.out.println("\nThe sorted arrays is:");
        printArr(a);

    }
}