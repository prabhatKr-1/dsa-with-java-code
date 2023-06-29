//We'll study two dimensional arrays in java
package com.DSA.Arrays;

import java.util.Scanner;

public class two_d_array {
    public static int[][] setArr() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter the element in ("+i+","+j+"): ");
                arr[i][j]= sc.nextInt();
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        int[][] a = setArr();
        System.out.print(a[2][2]);

    }
}
