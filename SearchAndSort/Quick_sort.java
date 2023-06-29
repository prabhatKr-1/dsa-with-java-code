//Quick sort:
//In Quick sort, we decide a pivot element and put it to its right place first.
//Then we divide the array into two parts with the pivot element as the reference
//such that all the elements in the left of pivot are <= pivot and to the right are
//bigger than the pivot element. Then we make recursive quickSort() call
package com.SearchAndSort;
import java.util.Scanner;

public class Quick_sort {

    public static void quickSort(int[] input, int si, int ei) {

        if (si >= ei)
            return;
        int pivotIndex = findPivot(input, si, ei);  //function to find pivot element and to arrange elements
        quickSort(input, si, pivotIndex - 1);    //recursive calls to the other halves
        quickSort(input, pivotIndex + 1, ei);
    }

    public static int findPivot(int[] input, int si, int ei) {
        int pivotElement = input[si];           //choosing the first element as pivot
        int count = 0;
        for (int i = si + 1; i < ei + 1; i++) {     //count element smaller than the pivot so that we leave that much
            if (input[i] <= pivotElement)           //space before placing our pivot in its place
                count++;

        }
        int pivotIndex = count + si;        //placing the pivot in its palace
        int temp = input[pivotIndex];
        input[pivotIndex] = input[si];
        input[si] = temp;

        int i = si, j = ei;

        while ((i <= pivotIndex - 1) && (j > pivotIndex + 1)) { //arranging the rest of the elements
            if (input[i] <= pivotElement)       //if element at the right place,no swap required
                i++;
            else {                              //so it is no in the right place
                if (pivotElement > input[j]) {  //if the jth element is in the wrong place too
                    int temp2 = input[i];
                    input[i] = input[j];
                    input[j] = temp2;
                    j--;
                    i++;

                } else {    //the jth was in the right place,so we find the j where the element is in
                    while (pivotElement < input[j]){    //the wrong place
                    j--;}

                    int temp2 = input[i];   //swapping
                    input[i] = input[j];
                    input[j] = temp2;
                    j--;
                    i++;
                }

            }


        }


        return pivotIndex;      //returning the index
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
        int[] ques = arr();
        System.out.println("The array you enter is:");
        printArr(ques);
        quickSort(ques, 0, ques.length - 1);
        System.out.println("\nThe array after sorting:");
        printArr(ques);
    }
}
