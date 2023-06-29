package com.Patterns;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Taking the value of n as input
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        sc.close(); // Closing the scanner object to prevent resource leak

        // 1st pattern
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print(i+1) ;
        // }
        // System.out.println();
        // }

        // 2nd pattern

        // for (int i = 0; i < n; i++) {
        // for (int j = n; j > 0; j--) {

        // System.out.print(j + "\t");
        // }
        // System.out.println();
        // }

        // 3rd pattern: Take n as input and print. For the below example, n is 4
        // 1
        // 2 3
        // 3 4 5
        // 4 5 6 7
        // int p = 1;
        // for (int i = 0; i < n; i++) {
        // int k = i;
        // for (int j = 0; j < p; j++) {
        // System.out.print(k + 1 + "\t");
        // k++;
        // }
        // p++;
        // System.out.println();
        // }

        // 4th pattern
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10

        // int p = 1;
        // int k = 1;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < p; j++) {
        // System.out.print(k + " ");
        // k++;
        // }
        // p++;
        // System.out.println();
        // }

        // 5th pattern
        // Pattern for N = 4
        // 1
        // 22
        // 333
        // 4444

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {

                System.out.print(i + 1);

            }
            System.out.println();
        }
    }
}
