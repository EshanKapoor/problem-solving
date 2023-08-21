package com.home.datastructure.hashtable;

import java.util.Arrays;
import java.util.LinkedList;

public class HashTable<K, V> {
    private class Entry<K, V> {
        private K key;
        private V val;

        public Entry(K key, V val) {
            this.key = key;
            this.val = val;
        }

        @Override
        public String toString() {
            return key + "=" + val;
        }
    }

    private LinkedList<Entry<K, V>>[] entries;
    private final int INITIAL_CAPACITY = 16;

    public HashTable() {
        this.entries = new LinkedList[INITIAL_CAPACITY];
    }

    public HashTable(int capacity) {
        this.entries = new LinkedList[capacity];
    }

    public V put(K key, V val) {
        int index = indexFor(key);
        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        for (Entry<K, V> e : entries[index]) {
            if (key.equals(e.key)) {
                e.val = val;
                break;
            }
        }
        entries[index].addLast(new Entry<>(key, val));
        return val;
    }

    private int indexFor(K key) {
        return key.hashCode() % entries.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(entries);
    }
}
