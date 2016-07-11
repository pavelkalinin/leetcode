package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/valid-number/
 */
public class ValidNumber {
    public boolean isNumber(String string) {
        if ((string == null)) {
            return false;
        }

        string = string.trim();
        return string.length() != 0
                && string.matches("[+-]?(([0-9]*\\.?[0-9]+)|([0-9]+\\.?[0-9]*))([e][+-]?[0-9]+)?");
    }
}
