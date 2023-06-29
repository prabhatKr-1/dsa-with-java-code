package com.SearchAndSort;
// We can either do it by using loop or by using recursive function
import java.util.Scanner;
import java.util.Arrays; //for using the Array.sort() function

public class BinarySearch {

    // Binary search function using recursion
    // Not functioning fully
    public static int BinarySearcher1(int[] arr, int n,int start,int end) {
        if(start>=end)
            return -1;

        int mid = start+(end - start) / 2;
        if (arr[mid] == n) {
            return mid;

        } else if (arr[mid] < n) {
            return BinarySearcher1(arr, n,mid +1 ,end);
        } else if (arr[mid] > n) {
            return BinarySearcher1(arr, n,start,mid - 1);

        }


    return -1;
    }

    // Binary search function using loops
    public static int BinarySearcher2(int[] arr, int n) {

        int mid = arr.length / 2;
        int length = arr.length;
        for (int i = mid; i < length;) {
            int counter = 0;
            mid = (i + length) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (n > arr[mid]) {

                i = mid + 1;
                counter++;
            } else if (arr[mid] > n) {
                length = mid - 1;
                counter++;
            } else if (counter == 0)
                i++;
        }
        return -1;
    }

    public static Scanner sc = new Scanner(System.in);

    public static int[] arr() {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        return a;
    }

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = arr();
        Arrays.sort(arr);
        System.out.println("The entered array(automatically sorted) is:");
        printArr(arr);
        System.out.print("\nEnter the no you want to search: ");
        int n = sc.nextInt();
        int index = BinarySearcher1(arr, n,0,arr.length);
//        int index=BinarySearcher2(arr,n);
        if (index == -1)
            System.out.print("The element is not present in the array!");
        else
            System.out.print("The element is present in the array at the " + (index + 1) + "th position!!");
        sc.close();
    }

}