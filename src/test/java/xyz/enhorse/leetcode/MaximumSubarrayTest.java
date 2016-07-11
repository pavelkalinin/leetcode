package xyz.enhorse.leetcode;

import junit.framework.TestCase;

/**
 * 15.12.2015.
 */
public class MaximumSubarrayTest extends TestCase {

    public void testExample() throws Exception {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        assertEquals(6, new MaximumSubarray().maxSubArray(array));
    }

    public void testOnePositiveElement() throws Exception {
        int[] array = {1};
        assertEquals(1, new MaximumSubarray().maxSubArray(array));
    }

    public void testOneZeroElement() throws Exception {
        int[] array = {0};
        assertEquals(0, new MaximumSubarray().maxSubArray(array));
    }

    public void testOneNegativeElement() throws Exception {
        int[] array = {-1};
        assertEquals(-1, new MaximumSubarray().maxSubArray(array));
    }
}