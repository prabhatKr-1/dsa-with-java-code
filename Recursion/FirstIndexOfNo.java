//An array and a no are given,find the index where the no first appears using recursion
package com.Recursion;

import java.util.Scanner;

public class FirstIndexOfNo {
    public static int findIndex(int[] arr, int n, int index) {
        if (index == arr.length)
            return -1;
        if (arr[index] == n) {
            return index;
        } else {
            return findIndex(arr, n, index + 1);   //jaruri nvcahi hai ki return me hi recursive call ho
        }
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

        return a;
    }

    public static void main(String[] args) {

        int[] a = arr();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = scan.nextInt();
        scan.close();
        int index = findIndex(a, n, 0);
        if (index == -1)
            System.out.print("The no is not present in the array");
        else {
            System.out.print("The index where the no first appears is: " + index);

        }
    }
}
