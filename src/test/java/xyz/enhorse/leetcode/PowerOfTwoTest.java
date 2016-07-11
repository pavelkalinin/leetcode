package xyz.enhorse.leetcode;

import junit.framework.TestCase;

/**
 *
 */
public class PowerOfTwoTest extends TestCase {

    public void testBigNegative() throws Exception {
        assertFalse(new PowerOfTwo().isPowerOfTwo(-2147483648));
    }
}