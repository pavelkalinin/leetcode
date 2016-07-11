package xyz.enhorse.leetcode;


/**
 * https://leetcode.com/problems/integer-to-roman/
 */
public class IntegerToRoman {

    public String intToRoman(int number) {
        StringBuilder result = new StringBuilder();

        if (number > 0) {
            final String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
            final int[] arabic = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

            int i = 0;
            while (number > 0) {
                while (arabic[i] <= number) {
                    result.append(roman[i]);
                    number -= arabic[i];
                }
                i++;
            }
        }

        return result.toString();
    }
}
