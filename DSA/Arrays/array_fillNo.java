package com.DSA.Arrays;

// Took me hours and lots of help, still barely managed to pull it off
// Very poorly executed but it works, so yeah!
// Take input and make an array
// If input= 5, the array should be 1 3 5 4 2
// If input= 6, the array should be 1 3 5 6 4 2
import java.util.Scanner;

public class array_fillNo {

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int arr[] = new int[n];
        int first = 1;
        int second;
        if (n % 2 == 0)
            second = arr.length;
        else
            second = arr.length - 1;
        if (n % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {

                if (i <= n / 2) {
                    arr[i] = first;
                    first += 2;
                } else {

                    arr[i] = second;
                    second -= 2;

                }
            }
        }

        if (n % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {

                if (i < n / 2) {
                    arr[i] = first;
                    first += 2;
                } else {

                    arr[i] = second;
                    second -= 2;

                }
            }
        }
        printArr(arr);
    }
}