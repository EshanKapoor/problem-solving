package com.home.problems;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Permutation01 {
    public static void main(String[] args) {
        System.out.println(solve(18, 20));
    }

    static int solve(int n, int m) {
        int result = -1;
        BigInteger answer = null;
        if ((n >= 1 && n <= 1000) && (m >= 1 && m <= 1000)) {
            System.out.println(n);
            System.out.println(m);

            BigInteger numerator = factorial(n + m - 1);

            BigInteger denominator1 = factorial(n);

            BigInteger denominator2 = factorial(m - 1);

            answer = numerator.divide((denominator1.multiply(denominator2)));
            double d = Math.pow(10, 9) + 7;
            String divisor = Double.toString(d);
            answer = answer.mod(new BigDecimal(divisor).toBigInteger());
        }
        if (answer != null) {
            result = answer.intValue();
        }
        return result;
    }

    private static BigInteger factorial(int f) {
        if (f == 0) {
            return new BigInteger("1");
        }
        return BigInteger.valueOf(f).multiply(factorial(f - 1));
    }
}
