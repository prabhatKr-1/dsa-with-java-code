package com.Recursion;

import java.util.Scanner;

public class ArraySortedOrNot {

       public static boolean checkArray2(int[] arr) {
        if (arr.length <= 1)
            return true;
        if (arr[0] > arr[1])
            return false;

        int[] smallerProblemArray = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            smallerProblemArray[i - 1] = arr[i];
        }
        boolean smallerProblem = checkArray2(smallerProblemArray);
//      In the above line we are getting that the local variable is redundant because instead
//      of creating that variable, we could just have
//      written return checkArray_realRecursively(smallerProblemArray);
       return smallerProblem;

    }


    public static boolean checkArray(int[] arr, int n) {
        if (n == 1)
            return true;
        if (arr[n - 2] > arr[n - 1])
            return false;
        else
            return checkArray(arr, n - 1);

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
//        boolean result = checkArray(a,a.length);  //junk function poor one
        boolean result = checkArray2(a);
        if (result)
            System.out.print("The arrays is sorted.");
        else
            System.out.print("The array is unsorted.");
    }

}
