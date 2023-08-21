package com.home.datastructure.tries;

public class Trie {

    public static class TrieNode {
        private final Character data;
        private final TrieNode[] children = new TrieNode[26];
        private boolean isTerminal = false;

        public TrieNode(char data) {
            this.data = data;
        }

        public TrieNode[] getChildren() {
            return children;
        }

        public Character getData() {
            return data;
        }

        public TrieNode getChildAt(int index) {
            return children[index];
        }

        public boolean isTerminal() {
            return isTerminal;
        }
    }

    private final TrieNode root;

    public Trie() {
        root = new TrieNode('\0');
    }

    public TrieNode getRoot() {
        return root;
    }

    public void insert(String word) {
        if (null != word && word.length() > 0) {
            insertWord(word.toLowerCase(), root);
            return;
        }
        throw new IllegalArgumentException("Word length should be greater than 0");
    }

    private void insertWord(String word, TrieNode root) {
        if (word.length() == 0) {
            root.isTerminal = true;
            return;
        }

        int index = word.charAt(0) - 'a';
        if (root.children[index] == null) {
            root.children[index] = new TrieNode(word.charAt(0));
        }
        insertWord(word.substring(1), root.children[index]);
    }

    public boolean search(String word) {
        if (null != word && word.length() > 0) {
            return searchWord(word.toLowerCase(), root);
        }
        return false;
    }

    private boolean searchWord(String word, TrieNode root) {
        if (word.length() == 0) {
            return root.isTerminal;
        }

        int index = word.charAt(0) - 'a';
        if (root.children[index] == null) {
            return false;
        }

        if (root.children[index].data != word.charAt(0)) {
            return false;
        }
        return searchWord(word.substring(1), root.children[index]);
    }

    public void delete(String word) {
        if (null != word && word.length() > 0) {
            if(deleteWord(word.toLowerCase(), root))
                System.out.printf("Word %s deleted%n", word);
            else
                System.out.printf("Word %s not found!%n", word);
            return;
        }
        throw new IllegalArgumentException("Word length should be greater than 0");
    }

    private boolean deleteWord(String word, TrieNode root) {
        if (word.length() == 0) {
            if(root.isTerminal) {
                root.isTerminal = false;
                return true;
            }
            return false;
        }

        int index = word.charAt(0) - 'a';
        if (root.children[index] == null) {
            return false;
        }

        if (root.children[index].data != word.charAt(0)) {
            return false;
        }
        return deleteWord(word.substring(1), root.children[index]);
    }

    public boolean startWith(String prefix) {
        if (null != prefix && prefix.length() > 0) {
            return startWithPrefix(prefix.toLowerCase(), root);
        }
        return false;
    }

    private boolean startWithPrefix(String prefix, TrieNode root) {
        if (prefix.length() == 0) {
            return true;
        }

        int index = prefix.charAt(0) - 'a';
        if (root.children[index] == null) {
            return false;
        }

        if (root.children[index].data != prefix.charAt(0)) {
            return false;
        }
        return searchWord(prefix.substring(1), root.children[index]);
    }
}
