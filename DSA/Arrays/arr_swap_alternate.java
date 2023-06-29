package com.DSA.Arrays;

// Swap the alternate elements of an array and print the result
import java.util.Scanner;

public class arr_swap_alternate {

    // Creating the array
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

    // Behold, its the printer himself lol

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Man of the hour
    public static int[] swapAlternate(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length / 2; i++) {
            int temp;
            temp = a[k];
            a[k] = a[k + 1];
            a[k + 1] = temp;
            k += 2;

        }

        return a;
    }

    public static void main(String[] args) {

        int a[] = arr();
        System.out.println("Array before the swap operations:");
        printArr(a);
        a = swapAlternate(a);
        System.out.println("\nArray after the swap operations:");
        printArr(a);

    }
}