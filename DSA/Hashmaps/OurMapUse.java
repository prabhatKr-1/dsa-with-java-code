package com.DSA.Hashmaps;

public class OurMapUse {
    public static void main(String[] args) {
        Map<String,Integer> map = new Map<>();
        map.put("abc", 1);
        map.put("def", 2);
        map.put("ghi", 3);
        map.put("jk", 4);
        System.out.println(map.size);
        System.out.println(map.getLoadFactor());
        map.removeKey("abc");
        System.out.println(map.size);
        System.out.println(map.getValue("def"));
    }
}
