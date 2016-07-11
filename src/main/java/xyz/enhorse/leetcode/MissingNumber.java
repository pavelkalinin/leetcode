package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {
    public int missingNumber(int[] numbers) {
        if (numbers == null) {
            return 0;
        }

        long sum = numbers.length * (numbers.length + 1) / 2;
        for (int number : numbers) {
            sum -= number;
        }
        return (int) sum;
    }
}
