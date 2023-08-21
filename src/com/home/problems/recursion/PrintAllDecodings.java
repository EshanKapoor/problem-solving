package com.home.problems.recursion;

public class PrintAllDecodings {
    public static void main(String[] args) {
        String s = "10";
        if(s.length() == 0 || s.length() == 1 && s.charAt(0) == '0') {
            System.out.println(0);
            return;
        }

        int result = countDecodings(s, "");
        System.out.println(result);
    }

    private static int countDecodings(String ip, String op) {
        if(ip.length() == 0)
            return 1;

        if(ip.charAt(0) == '0') {
            return 0;
        }

        if(ip.length() >= 2 && (ip.charAt(0) <= '2' && ip.charAt(1) < '7')) {
            return countDecodings(ip.substring(2), op + ip.substring(0,2))
                    + countDecodings(ip.substring(1), op + ip.substring(0,1)) ;
        }

        return countDecodings(ip.substring(1), op + ip.substring(0,1));
    }

}
