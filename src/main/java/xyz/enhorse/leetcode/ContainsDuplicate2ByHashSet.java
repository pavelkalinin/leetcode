package xyz.enhorse.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate2ByHashSet {
    public boolean containsDuplicate(int[] numbers) {
        return (numbers != null)
                && (numbers.length > 1)
                && checkByHashSet(numbers);
    }

    private boolean checkByHashSet(final int[] numbers) {
        boolean result = false;
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            if (uniqueNumbers.contains(number)) {
                result = true;
                break;
            }
            uniqueNumbers.add(number);
        }
        return result;
    }
}
