package xyz.enhorse.leetcode;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

/**
 * 09.11.2015.
 */
public class PlusOneTest extends TestCase {

    public void testFiveAtEnd() throws Exception {
        int[] actual = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 6};
        assertArrayEquals(expected, new PlusOne().plusOne(actual));
    }

    public void testAllNines() throws Exception {
        int[] actual = {9, 9, 9, 9, 9};
        int[] expected = {1, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, new PlusOne().plusOne(actual));
    }

    public void testNineAtEnd() throws Exception {
        int[] actual = {1, 2, 3, 4, 9};
        int[] expected = {1, 2, 3, 5, 0};
        assertArrayEquals(expected, new PlusOne().plusOne(actual));
    }

    public void testNinesFromMiddle() throws Exception {
        int[] actual = {1, 2, 9, 9, 9};
        int[] expected = {1, 3, 0, 0, 0};
        assertArrayEquals(expected, new PlusOne().plusOne(actual));
    }

    public void testNinesExceptFirst() throws Exception {
        int[] actual = {1, 9, 9, 9, 9};
        int[] expected = {2, 0, 0, 0, 0};
        assertArrayEquals(expected, new PlusOne().plusOne(actual));
    }

    public void testAllZeroes() throws Exception {
        int[] actual = {0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 1};
        assertArrayEquals(expected, new PlusOne().plusOne(actual));
    }

    public void testNull() throws Exception {
        int[] expected = {1};
        assertArrayEquals(expected, new PlusOne().plusOne(null));
    }

    public void testZeroLength() throws Exception {
        int[] actual = {};
        int[] expected = {1};
        assertArrayEquals(expected, new PlusOne().plusOne(actual));
    }
}