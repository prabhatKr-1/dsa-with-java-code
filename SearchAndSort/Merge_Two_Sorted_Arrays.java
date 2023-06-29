package com.SearchAndSort;

import java.util.Scanner;

public class Merge_Two_Sorted_Arrays {

    public static int[] MergeArrays(int[] arr1,int[] arr2) {
    int [] arr3= new int [arr1.length+arr2.length];
        int i=0;
        int j=0,k=0;
        while (i<arr3.length){
            if((j<arr1.length) && ((k==arr2.length) || (arr1[j]<=arr2[k]))){

                arr3[i]=arr1[j];
//                System.out.print("\nIn the if  and the index and value are:"+ i+" "+ arr1[j]);
                i++;
                j++;

            }
            else if((k<arr2.length) && ((j==arr1.length) || (arr1[j]>=arr2[k]))){
//                System.out.print("\nIn the else and the index and value are:"+ i+" "+ arr2[k]);
                arr3[i]=arr2[k] ;
                k++;
                i++;
            }
        }


        return arr3;

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
//        sc.close();
        return a;
    }

    public static void printArr(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = arr();
        int[] b = arr();
        System.out.println("The first array that was entered is:");
        printArr(a);
        System.out.println("The second array that was entered is:");
        printArr(b);
        a = MergeArrays(a,b);
        System.out.println("\nThe sorted is:");
        printArr(a);
        System.out.print("\n\n\nIf you think the sorting is wrong," +
                " check if you have entered sorted arrays as input or not");
    }
}
