package com.DSA.Hashmaps;

import java.util.Collection;
import java.util.HashMap;   //importing HashMap
import java.util.Set;

public class MapUse {
    public static void main(String[] args) {
//        First one is key, second is value
        HashMap<String, Integer> map = new HashMap<>();
//        insertion
        map.put("abc", 1);
        map.put("def", 2);
        map.put("ghi", 3);
        map.put("jkl", 4);
//        Checking whether a key/value is present in the map
        if (map.containsKey("abc"))
            System.out.println("Has abc");
        if (map.containsValue(2))
            System.out.println("Has 2");

//        Get value using a key
        int value;
        if (map.containsKey("abc")) {   //to avoid null point exception
            value = map.get("abc");
            System.out.println("The value stored in abc is: " + value);
        }
//        get() function returns null when the key is not present, so we get null point exception because we are basically trying to store value at null in the variable value.
        System.out.println("The size of the map is: " + map.size());
//         Removing
        value = map.remove("abc");      //removes and return the value
        System.out.println("Key abc and its value removed");
        System.out.println("The size of the map is: " + map.size());

//        Iterate using keySet function. We use data type set for this. keySet returns all the keys in the map

        Set<String> keys = map.keySet();
        for (String str : keys)
            System.out.println(str);


        Collection<Integer> values = map.values();
        for (Integer a : values)
            System.out.println(a);
    }
}
