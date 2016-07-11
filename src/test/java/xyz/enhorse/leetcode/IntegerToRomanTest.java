package xyz.enhorse.leetcode;

import junit.framework.TestCase;

/**
 * 25.11.2015.
 */
public class IntegerToRomanTest extends TestCase {

    public void test1() throws Exception {
        assertEquals("I", new IntegerToRoman().intToRoman(1));
    }

    public void test3999() throws Exception {
        assertEquals("MMMCMXCIX", new IntegerToRoman().intToRoman(3999));
    }

    public void test1234() throws Exception {
        assertEquals("MCCXXXIV", new IntegerToRoman().intToRoman(1234));
    }

    public void test22() throws Exception {
        assertEquals("XXII", new IntegerToRoman().intToRoman(22));
    }

    public void test56() throws Exception {
        assertEquals("LVI", new IntegerToRoman().intToRoman(56));
    }

    public void test6() throws Exception {
        assertEquals("VI", new IntegerToRoman().intToRoman(6));
    }

    public void test9() throws Exception {
        assertEquals("IX", new IntegerToRoman().intToRoman(9));
    }

    public void test0() throws Exception {
        assertEquals("", new IntegerToRoman().intToRoman(0));
    }

    public void testNegative() throws Exception {
        assertEquals("", new IntegerToRoman().intToRoman(-1));
    }
}