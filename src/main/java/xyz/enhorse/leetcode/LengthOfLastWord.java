package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null) {
            return 0;
        }
        s = s.trim();
        int index = s.lastIndexOf(" ");
        index = (index > 0)
                ? index + 1
                : 0;
        return s.length() - index;
    }
}
