package com.home.datastructure.hashtable;

public class RunHashTable {
    public static void main(String[] args) {
        HashTable<Integer, String> hashTable = new HashTable<>();
        hashTable.put(2, "Eshan");
        hashTable.put(21, "Kapoor");
        System.out.println(hashTable);
    }
}
