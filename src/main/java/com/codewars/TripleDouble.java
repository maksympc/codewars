package com.codewars;

/**
 * Write a function
 * <p>
 * TripleDouble(long num1, long num2)
 * which takes in numbers num1 and num2 and returns 1 if there is a straight triple of a number at any place in num1 and also a straight double of the same number in num2.
 * For example:
 * TripleDouble(451999277, 41177722899) == 1 // num1 has straight triple 999s and
 * // num2 has straight double 99s
 * <p>
 * TripleDouble(1222345, 12345) == 0 // num1 has straight triple 2s but num2 has only a single 2
 * <p>
 * TripleDouble(12345, 12345) == 0
 * <p>
 * TripleDouble(666789, 12345667) == 1
 * If this isn't the case, return 0
 */
public class TripleDouble {

    public static int TripleDouble(long num1, long num2) {
        String[] n1 = String.valueOf(num1).split("");
        String[] n2 = String.valueOf(num2).split("");

        int counter = 1;
        for (int i = 0; i < n1.length - 1; i++) {
            if (n1[i].equals(n1[i + 1])) {
                counter++;
                if (counter == 3) {
                    for (int j = 0; j < n2.length - 1; j++) {
                        if (n2[j].equals(n2[j + 1]) && n2[j].equals(n1[i])) {
                            return 1;
                        }
                    }
                }
            } else {
                counter = 1;
            }
        }
        return 0;
    }
}
