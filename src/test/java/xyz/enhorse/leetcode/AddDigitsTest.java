package xyz.enhorse.leetcode;

import junit.framework.TestCase;

/**
 * 15.12.2015.
 */
public class AddDigitsTest extends TestCase {

    public void test0() throws Exception {
        assertEquals(0, new AddDigits().addDigits(0));
    }

    public void test9() throws Exception {
        assertEquals(9, new AddDigits().addDigits(9));
    }

    public void test10() throws Exception {
        assertEquals(1, new AddDigits().addDigits(10));
    }

    public void test100() throws Exception {
        assertEquals(1, new AddDigits().addDigits(100));
    }

    public void test999() throws Exception {
        assertEquals(9, new AddDigits().addDigits(999));
    }

    public void test123456789() throws Exception {
        assertEquals(9, new AddDigits().addDigits(123456789));
    }
}