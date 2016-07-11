package xyz.enhorse.leetcode;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

/**
 * 09.11.2015.
 */
public class MoveZeroesTest extends TestCase {

    public void testNoneZeroes() throws Exception {
        int[] actual = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    public void testAllZeroes() throws Exception {
        int[] actual = new int[] {0, 0, 0, 0, 0};
        int[] expected = new int[] {0, 0, 0, 0, 0};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    public void testOneZeroAtStart() throws Exception {
        int[] actual = new int[] {0, 2, 3, 4, 5};
        int[] expected = new int[] {2, 3, 4, 5, 0};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    public void testOneZeroAtEnd() throws Exception {
        int[] actual = new int[] {1, 2, 3, 4, 0};
        int[] expected = new int[] {1, 2, 3, 4, 0};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    public void testOneZeroAtMiddle() throws Exception {
        int[] actual = new int[] {1, 2, 0, 4, 5};
        int[] expected = new int[] {1, 2, 4, 5, 0};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    public void testOneZeroAtStartAndAlternate() throws Exception {
        int[] actual = new int[] {0, 1, 0, 2, 0};
        int[] expected = new int[] {1, 2, 0, 0, 0};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    public void testManyZerosAlternate() throws Exception {
        int[] actual = new int[] {1, 0, 2, 0, 5};
        int[] expected = new int[] {1, 2, 5, 0, 0};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    public void testTwoZerosAtStartInRow() throws Exception {
        int[] actual = new int[] {0, 0, 1, 3, 5};
        int[] expected = new int[] {1, 3, 5, 0, 0};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    public void testTwoZerosInRow() throws Exception {
        int[] actual = new int[] {1, 0, 0, 3, 5};
        int[] expected = new int[] {1, 3, 5, 0, 0};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    public void testZeroLength() throws Exception {
        int[] actual = new int[] {};
        int[] expected = new int[] {};
        new MoveZeroes().moveZeroes(actual);
        assertArrayEquals(expected, actual);
    }

    public void testNull() throws Exception {
        new MoveZeroes().moveZeroes(null);
        assertEquals(null, null);
    }
}