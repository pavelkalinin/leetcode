package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {
    public int maxSubArray(int[] numbers) {
        int max = numbers[0];
        int tmp = max;
        for (int i = 1; i < numbers.length; i++) {
            tmp = (tmp > 0)
                    ? tmp + numbers[i]
                    : numbers[i];
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }
}
