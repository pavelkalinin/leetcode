package xyz.enhorse.leetcode;

import junit.framework.TestCase;

/**
 * 10.11.2015.
 */
public class ContainsDuplicate1ByArrayTest extends TestCase {

    public void testWithout() throws Exception {
        assertFalse(new ContainsDuplicate1ByArray().containsDuplicate(new int[]{110, 51588884, 2, 14, 220000}));
    }

    public void testWith() throws Exception {
        assertTrue(new ContainsDuplicate1ByArray().containsDuplicate(new int[] {110, 515, 2, 14, 220000, 110}));
    }

    public void testAlreadySortedWithout() throws Exception {
        assertFalse(new ContainsDuplicate1ByArray().containsDuplicate(new int[]{-10, -20, 2, 14000, 220000}));
    }

    public void testAlreadySortedWith() throws Exception {
        assertTrue(new ContainsDuplicate1ByArray().containsDuplicate(new int[]{-10, -20, 2, 2, 14000, 220000}));
    }

    public void testNull() throws Exception {
        assertFalse(new ContainsDuplicate1ByArray().containsDuplicate(null));
    }

    public void testOneNumber() throws Exception {
        assertFalse(new ContainsDuplicate1ByArray().containsDuplicate(new int[] {110}));
    }

    public void testNegativesWithout() throws Exception {
        assertFalse(new ContainsDuplicate1ByArray().containsDuplicate(new int[]{-110, -78, -11111111, -2}));
    }

    public void testMixedWithout() throws Exception {
        assertFalse(new ContainsDuplicate1ByArray().containsDuplicate(new int[] {1, 5, -2, -4, 0}));
    }


}