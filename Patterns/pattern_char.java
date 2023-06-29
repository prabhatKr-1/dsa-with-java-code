package com.Patterns;

//Check the last pattern, its the best in the file
import java.util.Scanner;

public class pattern_char {

    public static void main(String[] args) {

        java.util.Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        sc.close();
        // Pattern 1
        // A B C D
        // A B C D
        // A B C D
        // A B C D
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print((char) (65 + j) + " ");
        // }
        // System.out.println();
        // }
        // System.out.println("\n");
        // Pattern 2
        // Print the following pattern for the given N number of rows.
        // Pattern for N = 3
        // A
        // BB
        // CCC
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print((char) (65 + i) + " ");
        // }
        // System.out.println();
        // }
        // Pattern 3 is a
        // Print the following pattern for the given number of rows.
        // Pattern for N = 5
        // E
        // DE
        // CDE
        // BCDE
        // ABCDE

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (65 + n - i + j - 1));
            }
            System.out.println();
        }
    }
}