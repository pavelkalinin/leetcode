package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {
    public int singleNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            result ^= numbers[i];
        return result;
    }
}
