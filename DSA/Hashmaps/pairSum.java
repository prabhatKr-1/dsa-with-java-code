package com.DSA.Hashmaps;

import java.util.HashMap;

public class pairSum {

    public static void printPairNum(int[] arr) {
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int freq;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                freq = map.get(arr[i]);
                map.put(arr[i], ++freq);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(-1 * arr[i]) && map.get(arr[i]) != 0) {
                pairs = pairs + map.get(arr[i]) * map.get(-1 * arr[i]);
                map.put(arr[i], 0);
                map.put(-1 * arr[i], 0);
            }
        }
        System.out.println(pairs);
    }

    public static void main(String[] args) {
        int[] input = {2, 1, -2, 2, 3};
        printPairNum(input);
    }
}
