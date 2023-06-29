package com.DSA.Hashmaps;
import java.util.ArrayList;

public class Map<K, V> {
    //    We are using an arrayList as bucket array. It will store the head of the linked lists.Each class has its hashcode. We didn't use array because it can't be generic
    ArrayList<MapNode<K, V>> buckets;
    int size;
    int numBuckets;

    public Map() {      //Constructor
        numBuckets = 20;       //let's
        buckets = new ArrayList<>();
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
            //we have to initialise it with null so that we can put values at all the indices. If we hadn't done this, we couldn't put value at x if x-1 is not occupied.
        }

    }

    private int getBucketIndex(K key) {        //hash function
        int hashCode = key.hashCode();     //hashcode function is inbuilt in the Object class. We can create our own too if we want
        return hashCode % 10;     //compressing and returning
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);   //head of LL
        while (head != null) {
            if (head.key.equals(key)) {   // == operator compares their addresses only, hence .equals() function is recommended as it checks the content
                head.value = value;
                return;

            }
            head = head.next;
        }
        head = buckets.get(bucketIndex);
        MapNode<K, V> newElementNode = new MapNode<>(key, value);
        newElementNode.next = head;
        buckets.set(bucketIndex, newElementNode);
        size++;
        double loadFactor = (1.0 * size) / numBuckets;      //so that we don't get integer
        if (loadFactor > 0.7)
            rehash();       //rehashing to ensure favourable load factor

    }

    private void rehash() {
        ArrayList<MapNode<K, V>> temp = buckets;
        buckets = new ArrayList<>();
        for (int i = 0; i < 2 * numBuckets; i++) {
            buckets.add(null);
        }
        size = 0;
        numBuckets *= 2;
        for (int i = 0; i < temp.size(); i++) {
            MapNode<K, V> head = temp.get(i);
            while (head != null) {
                K key = head.key ;
                V value= head.value;
                put(key, value);    //will take care of size too
                head = head.next;
            }
        }
    }

    public double getLoadFactor(){
        return (1.0*size)/numBuckets;
    }

    public V getValue(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);   //head of LL
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V removeKey(K key) {
        int bucketIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(bucketIndex);
        MapNode<K, V> previous = null;
        while (head != null) {
            if (head.key.equals(key)) {
                size--;
                if (previous == null) {
                    buckets.set(bucketIndex, head.next); //if found at head
                } else {
                    previous.next = head.next;
                }
                return head.value;
            }
            previous = head;
            head = head.next;
        }
        return null;
    }

    public int size() {
        return size;
    }
}
