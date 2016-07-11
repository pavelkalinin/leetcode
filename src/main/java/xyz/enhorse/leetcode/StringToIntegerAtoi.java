package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/string-to-integer-atoi/
 */
public class StringToIntegerAtoi {
    private static final int OVERFLOW_BOUND = Integer.MAX_VALUE / 10;

    public static int myAtoi(String s) {
        int result = 0;

        if (s == null) {
            return result;
        }

        char[] input = trimStartSpaces(s.toCharArray());
        if ((input.length == 0) || (!checkFirstSymbol(input))) {
            return result;
        }

        int sign = defineSign(input);
        removeSign(input);

        for (char ch : input) {
            if (isDigit(ch)) {
                int digit = ch - '0';
                if (!causeOverflow(result, digit)) {
                    result = result * 10 + digit;
                } else {
                    result = sign < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    break;
                }
            } else {
                break;
            }
        }
        return sign * result;
    }

    private static void removeSign(char[] string) {
        boolean signIsPresent = (string[0] == '-') || (string[0] == '+');
        if (signIsPresent) {
            System.arraycopy(string, 1, string, 0, string.length - 1);
            string[string.length - 1] = 0;
        }
    }

    private static int defineSign(final char[] string) {
        return string[0] == '-' ? -1 : 1;
    }

    private static boolean checkFirstSymbol(final char[] string) {
        return (string[0] == '-') || (string[0] == '+') || (isDigit(string[0]));
    }

    private static boolean causeOverflow(final int current, final int digit) {
        return (((digit > 7) && current == OVERFLOW_BOUND)) || (current > OVERFLOW_BOUND);
    }

    private static char[] trimStartSpaces(final char[] string) {
        if (string.length == 0) {
            return string;
        }
        int index = 0;
        while (string[index] == ' ') {
            index++;
        }
        if (index == 0) {
            return string;
        }
        char[] result = new char[string.length - index];
        System.arraycopy(string, index, result, 0, result.length);
        return result;
    }

    private static boolean isDigit(final char ch) {
        int value = ch - '0';
        return (value > -1) && (value < 10);
    }
}


