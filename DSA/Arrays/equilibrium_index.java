//Find the index where the sum of elements to its left is equal to sum of elements to its right
//In the naive solution, we will have to find the sum of left hand and right half again and again, so the time complexity will be O(n^2).
//We don't want this, so what we will do instead is just update the values of left half sum and right half sum as we progress in the array.
//After this the complexity will become O(n). Good to go!!
package com.DSA.Arrays;

import java.util.Scanner;

public class equilibrium_index {
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


    public static int equiliIndex(int[] arr) {
        if (arr.length == 0)
            return -1;
        int left = 0, right = 0;
        for (int i = 1; i < arr.length; i++) {
            right += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (right == left) {
                return i;
            }else if(i==arr.length-1){          //this is needed to avoid index out of bound exception
                return -1;
            }

            else {
                left += arr[i];
                right -= arr[i + 1];
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] a = arr();
        int result = equiliIndex(a);
        if (result == -1)
            System.out.print("No such index exists");
        else System.out.print("The equilibrium index is: " + result);
    }

}
