package com.DSA.DynamicProgramming;

//Return the maximum sum of two non-adjacent elements of a given array
public class maxSumOfElements {
    private static int helperRecursive(int[] arr, int i) {
        if (i < 0)
            return 0;
        if (i == 0)
            return arr[0];
        int select = helperRecursive(arr, i - 2) + arr[i];
        int notSelect = helperRecursive(arr, i - 1);
        return Math.max(select, notSelect);
    }

    public static int findMaxSum(int[] arr) {
        int n = arr.length;
        int ans = helperRecursive(arr, n - 1);
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 0, 3, 4, 2};
        System.out.println(findMaxSum(arr));
    }
}
