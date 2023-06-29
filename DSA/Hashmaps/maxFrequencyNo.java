package com.DSA.Hashmaps;

import java.util.HashMap;
import java.util.Set;

//Return the no with maximum frequency in a given array. If two or more nos have same frequency, return the no that occurred first.
public class maxFrequencyNo {
    static int mostFrequent(int[] arr) {
        int value;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, 0);
        }
        for (int j : arr) {
            value = map.get(j);
            value++;
            map.put(j, value);
        }
        Set<Integer> keys = map.keySet();
        int mostFrequent = arr[0];
        for (int ele : keys) {
            if (map.get(ele) > map.get(mostFrequent))
                mostFrequent = ele;
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] input = {1,4,5,1,5};
        int mostFrequent = mostFrequent(input);
        System.out.println("The most frequent no is: " + mostFrequent);
        double end = System.currentTimeMillis();
    }
}
