package com.codewars;

/**
 * Given a positive number n > 1 find the prime factor decomposition of n. The result will be a string with the following form :
 * <p>
 * "(p1**n1)(p2**n2)...(pk**nk)"
 * with the p(i) in increasing order and n(i) empty if n(i) is 1.
 * <p>
 * Example: n = 86240 should return "(2**5)(5)(7**2)(11)"
 */
public class PrimeDecomp {

    public static String factors(int n) {
        StringBuilder result = new StringBuilder("");
        int currentDegree = 0;
        String value = "";
        int number = n;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (number % i == 0) {
                while (number % i == 0) {
                    currentDegree++;
                    number /= i;
                    if (currentDegree == 1)
                        value = "(" + i + ")";
                    else
                        value = "(" + i + "**" + currentDegree + ")";
                }
                currentDegree = 0;
                result.append(value);
            }
        }
        if (result.toString().equals("")) {
            result.append("(").append(n).append(")");
        }
        return result.toString();
    }

}