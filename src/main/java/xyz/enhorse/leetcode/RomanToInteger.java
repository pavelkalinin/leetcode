package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {

    public int romanToInt(String string) {
        if (string == null || string.length() == 0) {
            return 0;
        }

        int[] conversationTable = new int[26];
        conversationTable['I' - 'A'] = 1;
        conversationTable['V' - 'A'] = 5;
        conversationTable['X' - 'A'] = 10;
        conversationTable['L' - 'A'] = 50;
        conversationTable['C' - 'A'] = 100;
        conversationTable['D' - 'A'] = 500;
        conversationTable['M' - 'A'] = 1000;

        char[] symbols = string.toCharArray();
        int sum = 0;
        for (char symbol : symbols) {
            int cur = conversationTable[symbol - 'A'];
            sum += cur - 2 * (sum % cur);
        }
        return sum;
    }
}

