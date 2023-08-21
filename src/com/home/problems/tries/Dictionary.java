package com.home.problems.tries;

import com.home.datastructure.tries.Trie;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {

    private static List<List<String>> phoneDirectory(List<String> contactList, String queryStr) {
        Trie trie = new Trie();
        List<List<String>> suggestions = new ArrayList<>();

        //insert contacts
        for (String contact : contactList) {
            trie.insert(contact);
        }

        //get suggestions
        String prefix = "";
        Trie.TrieNode root = trie.getRoot();
        for (char ch : queryStr.toCharArray()) {
            prefix += ch;
            Trie.TrieNode child = root.getChildAt(ch - 'a');
            if (child == null || child.getData() != ch) {
                break;
            } else {
                List<String> searches = new ArrayList<>();
                printSuggestions(searches, child, prefix);
                suggestions.add(searches);
                root = child;
            }
        }
        return suggestions;
    }

    private static void printSuggestions(List<String> searches, Trie.TrieNode curr, String prefix) {
        if (curr.isTerminal()) {
            searches.add(prefix);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (curr.getChildAt(ch - 'a') != null) {
                prefix += ch;
                printSuggestions(searches, curr.getChildAt(ch - 'a'), prefix);
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        List<List<String>> lists = phoneDirectory(List.of("cod", "coding", "codding", "code", "coly"), "coding");
        System.out.println(lists);
    }
}
