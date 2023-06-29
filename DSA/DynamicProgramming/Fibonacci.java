package com.DSA.DynamicProgramming;
//Here we will optimise the recursion and the time complexity will become O(n).

import java.util.Scanner;

//We will store the values in an array and instead of making the same calls, we will use the values from the array
public class Fibonacci {
    public static int fibonacci(int n, int[] dp) {
        if (n == 0 || n == 1)   //base case
            return n;
        int ans1, ans2;
        if (dp[n - 1] == -1) {  //we don't have the value so making the recursive call
            ans1 = fibonacci(n - 1, dp);
            dp[n - 1] = ans1;   //adding the value in the array
        } else {    //we already have the value so no call
            ans1 = dp[n - 1];
        }
        if (dp[n - 2] == -1) {  //same work as done above
            ans2 = fibonacci(n - 2, dp);
            dp[n - 2] = ans2;
        } else {
            ans2 = dp[n - 2];
        }

        return ans1 + ans2;
    }

    //  Converting the recursive + dp code to iterative code
    public static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        int[] dp = new int[n + 1];   //cox index starts from zero
        dp[0] = 0;    //filling the base cases
        dp[1] = 1;
        //for index <=2
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scan.nextInt();
        int[] dp = new int[n + 1];  //so that nth index has the value of fibonacci(n)
//      Initialising the dp array with -1.
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        int ans = fibonacci(n, dp);
        int ans2 = fibonacci(n, dp);
        System.out.println("The fibonacci of " + n + " is: " + ans);
        System.out.println("The fibonacci of " + n + " is: " + ans2);
    }
}
