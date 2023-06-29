package com.DSA.DynamicProgramming;

import java.util.Scanner;

//Find the minimum no of square of numbers required for reaching to the given no
//eg: if n = 6, it can be reached through adding the squares of 1 six times or by adding the square of two once and the square of one twice. Hence, return 3.
public class minSquares {

    public static int minSquareRecursive(int n) {
        if (n < 0)
            return Integer.MAX_VALUE;
        if (n < 4)
            return n;
        int num = 0;
        int sqrt = (int) Math.sqrt(n);
        int[] squares = new int[sqrt + 1];
        num = 1 + minSquareRecursive(n - 1);
        for (int i = 2; i <= sqrt; i++) {
            int num2 = 1 + minSquareRecursive(n - i * i);
            if (num2 < num)
                num = num2;
        }
        return num;
    }

    public static int minSquareMemorizatin(int n, int[] dp) {
        if (n == 0)
            return 0;
        int minAns = Integer.MAX_VALUE;
        for (int i = 1; i * i <= n; i++) {
            int curAns;
            if (dp[n - i * i] == -1) {
                curAns =  minSquareRecursive(n - i * i);
                dp[n - i * i] = curAns;
            } else {
                curAns = dp[n - i * i];
            }
            if (curAns < minAns)
                minAns = curAns;
        }
        return 1+minAns;
    }

    public static int minSquareDP(int n) {
        if (n < 4)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            int min = 1 + dp[i - 1];
            int sqrt = (int) Math.sqrt(i);
            for (int j = 2; j <= sqrt; j++) {
                int min2 = 1 + dp[i - (j * j)];
                if (min2 < min)
                    min = min2;
            }
            dp[i] = min;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scan.nextInt();
        System.out.println("The min no of squares required: " + minSquareRecursive(n));
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        System.out.println("The min no of squares required: " + minSquareMemorizatin(n, dp));
        System.out.println("The min no of squares required: " + minSquareDP(n));
    }
}
