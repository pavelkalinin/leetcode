package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/add-digits/
 */
public class AddDigits {
    public int addDigits(int number) {
        return (number < 10)
                ? number
                : 1 + ((number - 1) % 9);
    }
}
