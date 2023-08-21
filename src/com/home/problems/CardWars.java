package com.home.problems;

import java.util.HashMap;
import java.util.Map;

public class CardWars {
    public static void main(String[] args) {
        Map<Character, Integer> cards = new HashMap<>();
        cards.put('A', 62);
        cards.put('K', 61);
        cards.put('Q', 60);
        cards.put('J', 59);
        cards.put('T', 58);

        String s1 = "23A84Q";
        String s2 = "K2Q25J";

        int playerOneWins = 0;
        for (int i = 0; i < s1.length(); i++) {
            char p1 = s1.charAt(i);
            char p2 = s2.charAt(i);
            int p1Val = p1;
            int p2Val = p2;

            if (p1 >= 58) {
                p1Val = cards.get(p1);
            }

            if (p2 >= 58) {
                p2Val = cards.get(p2);
            }

            if (p1Val > p2Val) {
                playerOneWins++;
            }
        }
        System.out.println(playerOneWins);
    }
}
