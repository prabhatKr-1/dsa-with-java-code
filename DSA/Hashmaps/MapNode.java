package com.DSA.Hashmaps;

public class MapNode<K, V> {
    K key;
    V value;
    MapNode<K, V> next;
    public MapNode(K k, V v){
        key = k;
        value = v;
    }

}
