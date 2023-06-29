//Remove the duplicate elements. This can be done using maps.
//We will create a map with <Integer,Boolean>, integer will have the element and boolean will tell us whether that element is already present or not.
package com.DSA.Hashmaps;

import java.util.ArrayList;
import java.util.HashMap;

public class removeDuplicates {
    public static ArrayList<Integer> removeDuplicate(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                list.add(arr[i]);
                map.put(arr[i],true);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] ques = {1, 4, 6, 1, 8, 6, 9, 7, 4, 6, 74};
        ArrayList<Integer> output = removeDuplicate(ques)  ;
        for(Integer a: output)
            System.out.print(a+" ");

    }
}
