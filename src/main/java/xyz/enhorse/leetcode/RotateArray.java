package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {
    public void rotate(int array[], int distance) {
        if ((array != null) && willBeChanged(array.length, distance)) {
            int l = array.length;
            int r = distance % l;
            reverse(array, 0, l - r - 1);
            reverse(array, l - r, l - 1);
            reverse(array, 0, l - 1);
        }
    }

    public void reverse(int[] array, int l, int r) {
        while (l < r) {
            int tmp = array[l];
            array[l++] = array[r];
            array[r--] = tmp;
        }
    }

    private boolean willBeChanged(int arrayLength, int distance) {
        return (arrayLength > 1) && (distance > 0) && (distance % arrayLength > 0);
    }
}
