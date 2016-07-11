package xyz.enhorse.leetcode;

import junit.framework.TestCase;

/**
 * 23.11.2015.
 */
public class RomanToIntegerTest extends TestCase {

    public void test1() throws Exception {
        assertEquals(1, new RomanToInteger().romanToInt("I"));
    }

    public void test10() throws Exception {
        assertEquals(10, new RomanToInteger().romanToInt("X"));
    }

    public void test5() throws Exception {
        assertEquals(5, new RomanToInteger().romanToInt("V"));
    }

    public void test15() throws Exception {
        assertEquals(15, new RomanToInteger().romanToInt("XV"));
    }

    public void test3() throws Exception {
        assertEquals(3, new RomanToInteger().romanToInt("III"));
    }

    public void test1234() throws Exception {
        assertEquals(1234, new RomanToInteger().romanToInt("MCCXXXIV"));
    }


    public void test2345() throws Exception {
        assertEquals(2345, new RomanToInteger().romanToInt("MMCCCXLV"));
    }

    public void test100() throws Exception {
        assertEquals(100, new RomanToInteger().romanToInt("C"));
    }

    public void test500() throws Exception {
        assertEquals(500, new RomanToInteger().romanToInt("D"));
    }

    public void test1000() throws Exception {
        assertEquals(1000, new RomanToInteger().romanToInt("M"));
    }

    public void test3999() throws Exception {
        assertEquals(3999, new RomanToInteger().romanToInt("MMMCMXCIX"));
    }

    public void testEmpty() throws Exception {
        assertEquals(0, new RomanToInteger().romanToInt(""));
    }

    public void testNull() throws Exception {
        assertEquals(0, new RomanToInteger().romanToInt(null));
    }
}