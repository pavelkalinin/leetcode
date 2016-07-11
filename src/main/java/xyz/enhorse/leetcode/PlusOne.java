package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if ((digits == null) || (digits.length == 0)) {
            return new int[]{1};
        }

        int indexOfIsNotNine = digits.length - 1;
        while ((indexOfIsNotNine >= 0) && (digits[indexOfIsNotNine] == 9)) {
            digits[indexOfIsNotNine] = 0;
            indexOfIsNotNine--;
        }

        if (indexOfIsNotNine >= 0) {
            digits[indexOfIsNotNine]++;
            return digits;
        }

        int[] result = new int[digits.length + 1];
        result[0]++;
        return result;
    }
}
