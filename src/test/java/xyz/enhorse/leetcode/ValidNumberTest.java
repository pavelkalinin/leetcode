package xyz.enhorse.leetcode;

import junit.framework.TestCase;

/**
 * 10.11.2015.
 */
public class ValidNumberTest extends TestCase {

    public void testNull() throws Exception {
        assertFalse(new ValidNumber().isNumber(null));
    }

    public void testEmpty() throws Exception {
        assertFalse(new ValidNumber().isNumber(""));
    }

    public void testOnlySpaces() throws Exception {
        assertFalse(new ValidNumber().isNumber("  "));
    }

    public void testStartWithDotAndE() throws Exception {
        assertFalse(new ValidNumber().isNumber(".e1"));
    }

    public void testAllDigits() throws Exception {
        assertTrue(new ValidNumber().isNumber("12345"));
    }

    public void testDigitsSurroundedBySpace() throws Exception {
        assertTrue(new ValidNumber().isNumber(" 12345 "));
    }

    public void testSpaceInMiddle() throws Exception {
        assertFalse(new ValidNumber().isNumber("1 1"));
    }

    public void testDigitsWithOneDot() throws Exception {
        assertTrue(new ValidNumber().isNumber("12345.0"));
    }

    public void testDigitsWithOneE() throws Exception {
        assertTrue(new ValidNumber().isNumber("12345e0"));
    }

    public void testDigitsWithCapitalizedE() throws Exception {
        assertFalse(new ValidNumber().isNumber("12345E2"));
    }

    public void testDigitsWithTwoE() throws Exception {
        assertFalse(new ValidNumber().isNumber("12345e0e"));
    }

    public void testDigitsWithTwoDots() throws Exception {
        assertFalse(new ValidNumber().isNumber("12345.0.0"));
    }

    public void testDigitsWithStartingE() throws Exception {
        assertFalse(new ValidNumber().isNumber("e12345"));
    }

    public void testDigitsWithEndingE() throws Exception {
        assertFalse(new ValidNumber().isNumber("12345e"));
    }

    public void testDigitsWithLetterAfterE() throws Exception {
        assertFalse(new ValidNumber().isNumber("12345ea"));
    }

    public void testDigitsWithInvalidMinus() throws Exception {
        assertFalse(new ValidNumber().isNumber("1-2"));
    }

    public void testSignAtEnd() throws Exception {
        assertFalse(new ValidNumber().isNumber("4e+"));
    }

    public void testEndsWithDotAfterE() throws Exception {
        assertFalse(new ValidNumber().isNumber("1e."));
    }

    public void testFull() throws Exception {
        assertTrue(new ValidNumber().isNumber("-123.45e+02"));
    }

    public void testOnlyDot() throws Exception {
        assertFalse(new ValidNumber().isNumber("."));
    }

    public void testDotAtEnd() throws Exception {
        assertTrue(new ValidNumber().isNumber("3."));
    }

    public void testStartingDotAndDigit() throws Exception {
        assertTrue(new ValidNumber().isNumber(".1"));
    }

    public void testDotAfterSign() throws Exception {
        assertFalse(new ValidNumber().isNumber("-."));
    }

    public void testSignAfterDot() throws Exception {
        assertFalse(new ValidNumber().isNumber(".-"));
    }

    public void testDotAfterE() throws Exception {
        assertFalse(new ValidNumber().isNumber(".e"));
    }

    public void testEAfterDot() throws Exception {
        assertFalse(new ValidNumber().isNumber("e."));
    }

    public void testTwoDots() throws Exception {
        assertFalse(new ValidNumber().isNumber(".."));
    }

    public void testTwoSigns() throws Exception {
        assertFalse(new ValidNumber().isNumber("-+"));
    }

    public void testTwoE() throws Exception {
        assertFalse(new ValidNumber().isNumber("ee"));
    }

    public void testEInRationalPower() throws Exception {
        assertFalse(new ValidNumber().isNumber("6e6.5"));
    }

    public void testEAfterSign() throws Exception {
        assertFalse(new ValidNumber().isNumber("-e58"));
    }
}