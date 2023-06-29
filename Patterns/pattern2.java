package com.Patterns;
// Pattern -2. Some more,different pattern printing is done here.
// Check the last one :)
import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();

        // Pattern 1
        // *
        // **
        // ***
        // ****
        // for (int i = 0; i < n; i++) {
        // for (int k = 0; k < n - i - 1; k++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // Pattern 2
        // * * * *
        // * * *
        // * *
        // *

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Pattern 3:
        /*
         ******** 1
         ****** 1 2 1
         **** 1 2 3 2 1
         ** 1 2 3 4 3 2 1
         * Ignore the *s
         */

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  ");

            }
            for (int k = 0; k < 1 + i; k++) {

                System.out.print(k + 1 + " ");

            }
            for (int l = i; l > 0; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }

    }
}