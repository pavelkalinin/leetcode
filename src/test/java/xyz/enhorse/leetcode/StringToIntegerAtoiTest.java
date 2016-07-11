package xyz.enhorse.leetcode;

import junit.framework.TestCase;

import static xyz.enhorse.leetcode.StringToIntegerAtoi.myAtoi;

/**
 * 06.11.2015.
 */
public class StringToIntegerAtoiTest extends TestCase {

    public void testSimple() throws Exception {
        assertEquals(12345, myAtoi("12345"));
    }

    public void testInputWithLeadZero() throws Exception {
        assertEquals(10, myAtoi("010"));
    }

    public void testWithMinus() throws Exception {
        assertEquals(-12345, myAtoi("-12345"));
    }

    public void testWithPlus() throws Exception {
        assertEquals(+12345, myAtoi("12345"));
    }

    public void testMaxValue() throws Exception {
        assertEquals(Integer.MAX_VALUE, myAtoi(String.valueOf(Integer.MAX_VALUE)));
    }

    public void testMinValue() throws Exception {
        assertEquals(Integer.MIN_VALUE, myAtoi(String.valueOf(Integer.MIN_VALUE)));
    }

    public void testEmptyInput() throws Exception {
        assertEquals(0, myAtoi(""));
    }

    public void testNullInput() throws Exception {
        assertEquals(0, myAtoi(null));
    }

    public void testPlusMinusInput() throws Exception {
        assertEquals(0, myAtoi("+-123"));
    }

    public void testAlphabetInput() throws Exception {
        assertEquals(0, myAtoi("abc"));
    }

    public void testInputWithStartSpaces() throws Exception {
        assertEquals(123, myAtoi("  123"));
    }

    public void testInputWithEndSpaces() throws Exception {
        assertEquals(123, myAtoi("123  "));
    }

    public void testMixedInput() throws Exception {
        assertEquals(123, myAtoi("123a333"));
    }

    public void testPositiveOverflow() throws Exception {
        assertEquals(2147483647, myAtoi("2147483648"));
    }

    public void testNegativeOverflow() throws Exception {
        assertEquals(-2147483648, myAtoi("-2147483649"));
    }

    public void testSingleDigit() throws Exception {
        assertEquals(5, myAtoi("5"));
    }

    public void testDigitAndLetter() throws Exception {
        assertEquals(1, myAtoi("1a"));
    }
}