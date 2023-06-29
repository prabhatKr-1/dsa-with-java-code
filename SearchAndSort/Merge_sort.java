//Code for merge sort: Divide and conquer
package com.SearchAndSort;

import java.util.Scanner;

public class Merge_sort {

    public static void mergeSort(int [] input,int start,int end){
        if(start>=end)
            return;
       int mid = start + (end - start)/2;
       mergeSort(input,start,mid);
       mergeSort(input,mid+1,end);
       nowMerge(input,start,end);

    }


    public static void nowMerge(int[] input,int start, int end) {
        int [] smallAns= new int [end - start+1];
        int i=start;
        int mid= start + (end-start)/2;
        int j=mid+1,k=0;
        while (i<=mid && j<=end) {
            if (input[i] < input[j]) {
                smallAns[k] = input[i];
                i++;
                k++;
            } else {
                smallAns[k] = input[j];
                j++;
                k++;
            }

        }
        while (i<=mid){
            smallAns[k]= input[i];
            i++;
            k++;

        }
        while (j<=end){
            smallAns[k]=input[j];
            j++;
            k++;
        }

        for (int l = 0; l < smallAns.length; l++) {
            input[l+start]=smallAns[l];
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
        sc.close();
        return a;
    }

    public static void printArr(int[] a) {
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        int [] ques = arr();
        System.out.println("The array you enter is:");
        printArr(ques);
        mergeSort(ques,0,ques.length-1);
        System.out.println("\nThe array after sorting:");
        printArr(ques);
    }
}
