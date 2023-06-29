package com.DSA.Hashmaps;

import java.util.HashMap;

//Two arrays are given, print all their intersections. Intersection means when a no is present in both the arrays
public class arrayIntersection {
    public static void printIntersection(int[] first, int[] second) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < first.length; i++) {
            if (map.containsKey(first[i])) {
                int freq = map.get(first[i]);
                map.put(first[i], freq + 1);
            } else {
                map.put(first[i], 1);
            }
        }
        for (int i = 0; i < second.length; i++) {
            if (map.containsKey(second[i])) {
                int freq = map.get(second[i]);
                if (freq > 0) {
                    System.out.print(second[i] + " ");
                    map.put(second[i], freq - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 2};
        int[] second = {2, 6, 1, 2};
        printIntersection(first, second);

    }
}
