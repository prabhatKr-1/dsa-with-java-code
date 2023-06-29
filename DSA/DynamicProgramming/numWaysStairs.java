package com.DSA.DynamicProgramming;

import java.util.Scanner;

//No of stairs is given, find the total no of ways using which you can climb the stairs if you can climb only 2 or 3 steps at a time
public class numWaysStairs {

    public static int numStairs(int n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        int ways = 0;
        ways += numStairs(n - 1);
        ways += numStairs(n - 2);
        return ways;
    }

    public static int numStairsMemorization(int n, int[] dp) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 1;
        int ways = 0;
        if (dp[n - 1] == -1) {
            int one = numStairs(n - 1);
            ways += one;
            dp[n - 1] = one;
        } else {
            ways += dp[n - 1];
        }
        if (dp[n - 2] == -1) {
            int two = numStairs(n - 2);
            ways += two;
            dp[n - 2] = two;
        } else {
            ways += dp[n - 2];
        }
        return ways;
    }

    public static int numStairsBottomUP(int n) {
        if (n < 0)
            return 0;
        if (n <= 1)
            return 1;
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }


        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.print("Enter the no of stairs: ");
        n = scan.nextInt();
        int ans = numStairs(n);
        int[] dp = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            dp[i] = -1;
        }
        int ans2 = numStairsMemorization(n, dp);
        int ans3 = numStairsBottomUP(n);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
