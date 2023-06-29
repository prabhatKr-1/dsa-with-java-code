package com.DSA.DynamicProgramming;

import java.util.Scanner;

//Stair Case
//
//        A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count and return all possible ways in which the child can run up to the stairs.
//        Input format :
//        The first and the only line of input contains an integer value, 'n', denoting the total number of steps.
//        Output format :
//        Print the total possible number of ways.
//        Constraints :
//        0 <= n <= 10 ^ 4
//
//        Time Limit: 1 sec
//        Sample Input 1:
//        4
//        Sample Output 1:
//        7
//        Sample Input 2:
//        10
//        Sample Output 2:
//        274
public class stairCase {
    public static int countWaysRecursively(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        int ways1 = countWaysRecursively(n - 1);
        int ways2 = countWaysRecursively(n - 2);
        int ways3 = countWaysRecursively(n - 3);
        return ways1 + ways2 + ways3;
    }

    public static int countWaysMemorization(int n, int[] dp) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        int ways1, ways2, ways3;
        if (dp[n - 1] == -1) {
            ways1 = countWaysRecursively(n - 1);
            dp[n - 1] = ways1;
        } else {
            ways1 = dp[n - 1];
        }
        if (dp[n - 2] == -1) {
            ways2 = countWaysRecursively(n - 2);
            dp[n - 2] = ways2;
        } else {
            ways2 = dp[n - 2];
        }
        if (dp[n - 3] == -1) {
            ways3 = countWaysRecursively(n - 3);
            dp[n - 3] = ways3;
        } else {
            ways3 = dp[n - 3];
        }

        return ways1 + ways2 + ways3;

    }

    public static int countWaysDP(int n) {
        if (n == 0)
            return 1;
        if (n == 1 || n == 2)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of stairs: ");
        int n = scan.nextInt();
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println(countWaysRecursively(n));
        System.out.println(countWaysMemorization(n,dp));
    }
}
