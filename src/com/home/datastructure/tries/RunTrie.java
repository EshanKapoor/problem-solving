package com.home.datastructure.tries;

public class RunTrie {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("BATT");
        System.out.println(trie.search("BAT"));
        trie.delete("BATT");
        trie.delete("BAT");
    }
}
