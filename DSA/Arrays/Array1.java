package com.DSA.Arrays;

// Input, display and operations on arrays.
import java.util.Scanner;

public class Array1 {

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

    // Function to find unique element in the array
    public static void findUnique(int a[]) {
        int p = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; (j < a.length) && (j != i); j++) {
                if (a[i] == a[j])
                    p++;

            }
            if (p == 0) {
                System.out.println("\nThe unique element is " + a[i]);
                System.out.println("It is present at the index no: " + i);
            }
        }

    }

    public static void main(String[] args) {

        int p[] = arr(); // Taking the input in the array
        System.out.println("The array is as following:");
        printArr(p); // printing the array
        // Now finding the unique element in the array(use iff only one unique element)
        findUnique(p);

    }
}
