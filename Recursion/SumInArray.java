package com.Recursion;
import java.util.Scanner;
public class SumInArray {

    public static int findSum(int []arr,int n){
        if(n==0)
            return 0;
        else
            return arr[n-1]+findSum(arr,n-1);
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

    public static void main(String[] args) {
        int []a= arr();
        int sum = findSum(a,a.length);
        System.out.print("Length of the array is: "+sum);
    }
}
