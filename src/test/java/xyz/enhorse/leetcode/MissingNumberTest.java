package xyz.enhorse.leetcode;

import junit.framework.TestCase;

/**
 * 11.11.2015.
 */
public class MissingNumberTest extends TestCase {

    public void testMissingNumberFirst() throws Exception {
        assertEquals(0, new MissingNumber().missingNumber(new int[] {1, 2, 3}));
    }

    public void testMissingNumberMiddle() throws Exception {
        assertEquals(2, new MissingNumber().missingNumber(new int[] {0, 1, 3, 4}));
    }

    public void testMissingNumberLast() throws Exception {
        assertEquals(5, new MissingNumber().missingNumber(new int[] {0, 1, 2, 3, 4}));
    }

    public void testMissingBigArray() throws Exception {
        int[] array = new int[Integer.MAX_VALUE / 8 + 1];
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i;
        }
        assertEquals(0, new MissingNumber().missingNumber(array));
    }
}