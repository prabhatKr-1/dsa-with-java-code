package com.DSA.DynamicProgramming;
//There are some things which can be improved but okay I solved it
import java.util.Arrays;
import java.util.Scanner;

//You are given a target and some coins. Find the minimum number of coins required to reach the target
public class minCoins {
    private static int numCoinsHelper(int target) {
        if (target <= 0)
            return 0;
        if (target < 4)
            return 1;
        int one = numCoinsHelper(target - 1);
        int two = numCoinsHelper(target - 2);
        int three = numCoinsHelper(target - 3);
        int num = Math.min(one, Math.min(two, three));
        return num + 1;
    }

    public static int numCoins(int target) {

        int one = numCoinsHelper(target - 1);
        int two = numCoinsHelper(target - 2);
        int three = numCoinsHelper(target - 3);
        int num = Math.min(one, Math.min(two, three));
        return num+1;

    }

    private static int numCoinsMemorizationHelper(int target, int[] dp) {

        if (target <= 0)
            return 0;
        if (target < 4)
            return 1;
        int one, two, three;
        if (dp[target - 1] == -1) {
            one = numCoinsMemorizationHelper(target - 1, dp);
            dp[target - 1] = one;
        } else {
            one = dp[target - 1];
        }
        if (dp[target - 2] == -1) {
            two = numCoinsMemorizationHelper(target - 2, dp);
            dp[target - 2] = two;
        } else {
            two = dp[target - 2];
        }
        if (dp[target - 3] == -1) {
            three = numCoinsMemorizationHelper(target - 3, dp);
            dp[target - 3] = three;
        } else {
            three = dp[target - 3];
        }
        int num = Math.min(one, Math.min(two, three));
        return num + 1;
    }

    public static int numCoinsMemorization(int target) {
        int[] dp = new int[target];
        Arrays.fill(dp, -1);
        int one, two, three;
        if (dp[target - 1] == -1) {
            one = numCoinsMemorizationHelper(target - 1, dp);
            dp[target - 1] = one;
        } else {
            one = dp[target - 1];
        }
        if (dp[target - 2] == -1) {
            two = numCoinsMemorizationHelper(target - 2, dp);
            dp[target - 2] = two;
        } else {
            two = dp[target - 2];
        }
        if (dp[target - 3] == -1) {
            three = numCoinsMemorizationHelper(target - 3, dp);
            dp[target - 3] = three;
        } else {
            three = dp[target - 3];
        }
        int num = Math.min(one, Math.min(two, three));
        return num+1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] coins = {1, 2, 3};
        int ans = numCoins(target);
        System.out.println(ans);

        int ans2 = numCoinsMemorization(target);
        System.out.println(ans2);

    }

}
