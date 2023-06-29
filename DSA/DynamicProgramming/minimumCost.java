package com.DSA.DynamicProgramming;

//Min Cost Path Problem
//
//        An integer matrix of size (M x N) has been given. Find out the minimum cost to reach from the cell (0, 0) to (M - 1, N - 1).
//        From a cell (i, j), you can move in three directions:
//        1. ((i + 1),  j) which is, "down"
//        2. (i, (j + 1)) which is, "to the right"
//        3. ((i+1), (j+1)) which is, "to the diagonal"
//        The cost of a path is defined as the sum of each cell's values through which the route passes.
//        Input format :
//        The first line of the test case contains two integer values, 'M' and 'N', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
//
//        The second line onwards, the next 'M' lines or rows represent the ith row values.
//
//        Each of the ith row constitutes 'N' column values separated by a single space.
//        Output format :
//        Print the minimum cost to reach the destination.
//        Constraints :
//        1 <= M <= 10 ^ 2
//        1 <= N <=  10 ^ 2
//
//        Time Limit: 1 sec
//        Sample Input 1 :
//        3 4
//        3 4 1 2
//        2 1 8 9
//        4 7 8 1
//        Sample Output 1 :
//        13
//        Sample Input 2 :
//        3 4
//        10 6 9 0
//        -23 8 9 90
//        -200 0 89 200
//        Sample Output 2 :
//        76
//        Sample Input 3 :
//        5 6
//        9 6 0 12 90 1
//        2 7 8 5 78 6
//        1 6 0 5 10 -4
//        9 6 2 -10 7 4
//        10 -2 0 5 5 7
//        Sample Output 3 :
//        18

import java.util.HashMap;

public class minimumCost {
    public static int minCostRecursive(int[][] minCost, int i, int j) {
        int m = minCost.length;     //no of rows
        int n = minCost[0].length;   //no of columns
        if (i >= m || j >= n)        //base case when the index goes out of bounds of the array
            return Integer.MAX_VALUE;
        if (i == m - 1 && j == n - 1)   //Special case: when at the destination
            return minCost[i][j];

        //recursive calls on all the three paths
        int diagonalAns = minCostRecursive(minCost, i + 1, j + 1);
        int rightAns = minCostRecursive(minCost, i, j + 1);
        int downAns = minCostRecursive(minCost, i + 1, j);

        return minCost[i][j] + Math.min(rightAns, Math.min(diagonalAns, downAns));
    }

    //We can either use Hashmap or 2D array to store the memorization elements.

    public static int minCostMemorization(int[][] minCost, int i, int j, int[][] dp) {
        int m = minCost.length;     //no of rows
        int n = minCost[0].length;   //no of columns
        if (i >= m || j >= n)        //base case when the index goes out of bounds of the array
            return Integer.MAX_VALUE;
        if (i == m - 1 && j == n - 1)   //Special case: when at the destination
            return minCost[i][j];

        //We have two choices, either we write if-else condition to make sure that we are not accessing the invalid index, or we can have an extra row and extra column in the dpArray. It will work because the maximum we will go out of bound is by +1

        //Here we are using an array. So what happens is we have put -infinity in the array by default. We will store the corresponding values in the same indices as in the cost array. For eg: the minCost value of cost[i][j] will be stored in dpArray[i][j]
        int diagonalAns, rightAns, downAns;
        if (dp[i + 1][j + 1] == Integer.MIN_VALUE) {
            diagonalAns = minCostRecursive(minCost, i + 1, j + 1);
            dp[i + 1][j + 1] = diagonalAns;
        } else {
            diagonalAns = dp[i + 1][j + 1];
        }
        if (dp[i][j + 1] == Integer.MIN_VALUE) {
            rightAns = minCostRecursive(minCost, i, j + 1);
        } else {
            rightAns = dp[i][j + 1];
        }
        if (dp[i + 1][j] == Integer.MIN_VALUE) {
            downAns = minCostRecursive(minCost, i + 1, j);
        } else {
            downAns = dp[i + 1][j];
        }

        return minCost[i][j] + Math.min(rightAns, Math.min(diagonalAns, downAns));
    }
//  Sir has given a different answer with a different approach. Watch that in the lecture videos
//    Apparently, I have used the top-down approach lol without realising
    public static int minCostDP(int[][] cost, int i, int j) {

        int[][] dp = new int[cost.length + 1][cost[0].length + 1];
//        for (int k = 0; k <cost.length + 1 ; k++) {
//            for (int l = 0; l < cost[0].length + 1; l++) {
//                dp[k][l] = Integer.MAX_VALUE;
//            }
//        }
        dp[0][0] = cost[0][0];
        for (int j1 = 1; j1 < cost[0].length; j1++) {     //filling the first row
            dp[0][j1] = cost[0][j1] + dp[0][j1 - 1];
        }
        for (int j1 = 1; j1 < cost.length; j1++) {        //filling the first column
            dp[j1][0] = cost[j1][0] + dp[j1 - 1][0];
        }
        //filling rest of the cells
        for (int ii = 1; ii < cost.length; ii++) {
            for (int jj = 1; jj < cost[0].length; jj++) {
                dp[ii][jj] = cost[ii][jj] + Math.min(dp[ii][jj - 1], Math.min(dp[ii - 1][jj], dp[ii - 1][jj - 1]));
            }
        }
        return dp[cost.length - 1][cost[0].length - 1];
    }

    public static void main(String[] args) {
        int[][] cost = {{9, 6, 0, 12, 90, 1}, {2, 7, 8, 5, 78, 6}, {1, 6, 0, 5, 10, -4}, {9, 6, 2, -10, 7, 4}, {10, -2, 0, 5, 5, 7}};
        int ans = minCostRecursive(cost, 0, 0);
        System.out.println(ans);

        int[][] dpArr = new int[cost.length + 1][cost[0].length + 1];
        for (int i = 0; i < cost.length; i++) {
            for (int j = 0; j < cost[0].length; j++) {
                dpArr[i][j] = Integer.MIN_VALUE;
            }

        }
        int ans2 = minCostMemorization(cost, 0, 0, dpArr);
        System.out.println(ans2);
        int ans3 = minCostDP(cost, 0, 0);
        System.out.println(ans3);
    }
}
