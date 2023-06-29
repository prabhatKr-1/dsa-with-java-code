package com.DSA.DynamicProgramming;

import java.util.Scanner;

//Min Steps To One
//        Given a positive integer 'n', find and return the minimum number of steps that 'n' has to take to get reduced to 1. You can perform any one of the following 3 steps:
//        1.) Subtract 1 from it. (n = n - 1) ,
//        2.) If its divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
//        3.) If its divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).
//        Write brute-force recursive solution for this.
//        Input format :
//        The first and the only line of input contains an integer value, 'n'.
//        Output format :
//        Print the minimum number of steps.
//        Constraints :
//        1 <= n <= 200
//
//        Time Limit: 1 sec
//        Sample Input 1 :
//        4
//        Sample Output 1 :
//        2
public class minSteps {

    public static int minStepsRecursively(int n) {
        if (n == 1)
            return 0;

        int minSteps = minStepsRecursively(n - 1);
        int minSteps2 = Integer.MAX_VALUE;
        if (n % 2 == 0) {
            minSteps2 = minStepsRecursively(n / 2);
        }
        int minSteps3 = Integer.MAX_VALUE;
        if (n % 3 == 0) {
            minSteps3 = minStepsRecursively(n / 3);
        }

        return 1 + Math.min(minSteps, Math.min(minSteps2, minSteps3));

    }

    public static int minStepMemorization(int n, int[] dp) {
        if (n == 1)
            return 0;
        int minSteps;
        if (dp[n - 1] == -1) {
            minSteps = minStepsRecursively(n - 1);
            dp[n - 1] = minSteps;
        } else {
            minSteps = dp[n - 1];
        }
        int minSteps2 = Integer.MAX_VALUE;

        if (n % 2 == 0) {
            if (dp[n / 2] == -1) {
                minSteps2 = minStepsRecursively(n / 2);
                dp[n / 2] = minSteps2;
            } else
                minSteps2 = dp[n / 2];
        }
        int minSteps3 = Integer.MAX_VALUE;
        if (n % 3 == 0) {
            if (dp[n / 3] == -1) {
                minSteps3 = minStepsRecursively(n / 3);
                dp[n / 3] = minSteps3;
            } else {
                minSteps3 = dp[n / 3];
            }
        }

        return 1 + Math.min(minSteps, Math.min(minSteps2, minSteps3));
    }

    public static int minStepDP(int n) {
        if (n == 1)
            return 0;
        int[] dp = new int[n + 1];
        dp[0] = Integer.MAX_VALUE;
        dp[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                dp[i] = 1 + Math.min(dp[i - 1], Math.min(dp[i / 2], dp[i / 3]));
            } else if (i % 2 != 0 && i % 3 == 0) {
                dp[i] = 1 + Math.min(dp[i - 1], dp[i / 3]);
            } else if (i % 3 != 0 && i % 2 == 0)
                dp[i] = 1 + Math.min(dp[i - 1], (dp[i / 2]));
            else dp[i] = 1 + dp[i - 1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        int ans = minStepsRecursively(n);
        int[] dp = new int[n + 1];
        System.out.println(ans);
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int ans2 = minStepMemorization(n, dp);
        System.out.println(ans2);
        int ans3 = minStepDP(n);
        System.out.println(ans3);
    }
}
