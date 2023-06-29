package com.DSA.Arrays;

// ***Very Important***: Don't close the scanner until u have scanned all the
// required things because sc.close() closes the input stream and it can't be
// activated again even if you create a new scanner object!!
// You can create multiple Scanner objects.
import java.util.Scanner;

public class PairsOfSum {
    public static Scanner sc = new Scanner(System.in);

    // Function to create array. Taken from the other file
    public static int[] arr() {
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements in the array:");
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // sc.close();
        return a;
    }

    // Function to display the entered array
    public static void printArr(int[] a) {
        System.out.println("The array you entered is:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // Function to find the pairs
    public static void findPair(int add, int a[]) {
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == add) {
                    System.out
                            .println("\nYes this pair returns the desires sum.\nThe indices are: " + i + " and " + j);
                    counter++;
                }

            }
        }
        if (counter == 0)
            System.out.println("\nNo such pair exists");
    }

    public static void main(String[] args) {

        int a[] = arr();
        System.out.print("Enter the desired value of sum: ");

        int add = sc.nextInt();
        sc.close();
        printArr(a);
        findPair(add, a);

    }
}
