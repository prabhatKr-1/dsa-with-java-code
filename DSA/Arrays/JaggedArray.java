/* Jagged Array: In java, we can create jagged arrays. Suppose we write
int [] [] arr = new int [2] []; --> so only the no of rows are fixed here. In the
master array,when we print arr[0,1] null is stored as no 1-D arrays are created as of now. So if we try to print arr[0,1][0,..] we will get null point exception.
##In arr, we can create 1-D arrays of different sizes.
arr[0]=new int [2]; arr[1]= new int [4]; --> Jagged array
Remember that the 1-D array are not stored together and can be present at different
memory locations, we take advantage of this fact. Now the master array stores the
 address of an 1-D array having 2 elements and another 1-D array having four elements.
*/
package com.DSA.Arrays;

import java.util.Scanner;

public class JaggedArray {
    public static int[][] jaggedArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = sc.nextInt();
        int[] colSize = new int[row];
        for (int i = 0; i < row; i++) {
            System.out.print("Enter the size of 1-D array no " + i + " : ");
            colSize[i] = sc.nextInt();
        }

        int[][] arr = new int[row][];
        for (int i = 0; i < row; i++) {
            arr[i] = new int[colSize[i]];
        }
        sc.close();
        return arr;
    }

    public static void main(String[] args) {
        int[][] a = jaggedArray();
        System.out.println("The no of rows in the array is: " + a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("The no of columns in the 1-D array no "
                    + i + " is :" + a[i].length);
        }
//        Write a function to take input(if required).
    }
}
