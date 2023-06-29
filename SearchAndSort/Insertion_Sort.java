package com.SearchAndSort;

import java.util.Scanner;

public class Insertion_Sort {

    public static int[] InsertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            //j>=0  condition phle rkhna must h nhi to j[-1]>temp ho skta h phle execute aur index outta bound hojayega


            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];    //agr condition true hai to bare wale element of right me keep swapping
                j--;
            }
            arr[j + 1] = temp;
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
        System.out.println("The array that was entered is:");
        printArr(a);
        a = InsertionSort(a);
        System.out.println("\nThe sorted is:");
        printArr(a);
    }
}
