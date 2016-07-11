package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {

    public void moveZeroes(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return;
        }

        int current = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[current++] = numbers[i];
            }
        }
        while (current < numbers.length) {
            numbers[current++] = 0;
        }
    }
}
