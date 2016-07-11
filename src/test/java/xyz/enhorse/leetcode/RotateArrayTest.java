package xyz.enhorse.leetcode;

import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 * 25.11.2015.
 */
public class RotateArrayTest extends TestCase {

    public void testEmptyArray() throws Exception {
        int k = 3;
        int[] array = {};
        int[] expected = {};

        new RotateArray().rotate(array, k);

        assertArrayEquals(expected, array);
    }

    public void testNullArray() throws Exception {
        int k = 3;
        int[] array = null;

        new RotateArray().rotate(array, k);

        assertArrayEquals(null, array);
    }

    public void test0step() throws Exception {
        int k = 0;
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        new RotateArray().rotate(array, k);

        assertArrayEquals(array, array);
    }

    public void testNegativeStep() throws Exception {
        int k = -1;
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        new RotateArray().rotate(array, k);

        assertArrayEquals(array, array);
    }

    public void testArray1Length() throws Exception {
        int k = 100;
        int[] array = {1};

        new RotateArray().rotate(array, k);

        assertArrayEquals(array, array);
    }

    public void testArrayOfMultipleLength() throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = array.length * 2;

        new RotateArray().rotate(array, k);

        assertArrayEquals(array, array);
    }

    public void testArrayOf2With1Step() throws Exception {
        int[] array = {1, 2};
        int[] expected = {2, 1};
        int k = 1;

        new RotateArray().rotate(array, k);

        assertArrayEquals(expected, array);
    }

    public void testEvenStep() throws Exception {
        int[] array = {1,2,3,4,5,6};
        int[] expected = {5,6,1,2,3,4};
        int k = 2;

        new RotateArray().rotate(array, k);

        assertArrayEquals(expected, array);
    }


    public void testOddStep() throws Exception {
        int k = 3;
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {5, 6, 7, 1, 2, 3, 4};

        new RotateArray().rotate(array, k);

        assertArrayEquals(expected, array);
    }
}