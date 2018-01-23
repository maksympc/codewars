package com.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeDecompTest {

    @Test
    public void testPrimeDecompOne() {
        int lst = 7775460;
        assertEquals(
                "(2**2)(3**3)(5)(7)(11**2)(17)",
                PrimeDecomp.factors(lst));
    }
    @Test
    public void testPrimeDecompTwo() {
        int lst = 7919;
        assertEquals(
                "(7919)",
                PrimeDecomp.factors(lst));
    }
    @Test
    public void testPrimeDecompThree() {
        int lst = 17*17*93*677;
        assertEquals(
                "(3)(17**2)(31)(677)",
                PrimeDecomp.factors(lst));
    }
    @Test
    public void testPrimeDecompFour() {
        int lst = 933555431;
        assertEquals(
                "(7537)(123863)",
                PrimeDecomp.factors(lst));
    }
    @Test
    public void testPrimeDecompFive() {
        int lst = 342217392;
        assertEquals(
                "(2**4)(3)(11)(43)(15073)",
                PrimeDecomp.factors(lst));
    }
}