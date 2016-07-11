package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate1ByArray {
    public boolean containsDuplicate(int[] numbers) {
        return (numbers != null)
                && (numbers.length > 1)
                && new MergeSortUntilFindDuplicates().sort(numbers);
    }

    class MergeSortUntilFindDuplicates {
        private int[] numbers;
        private int[] helper;

        private int number;

        public boolean sort(int[] values) {
            numbers = values;
            number = values.length;
            helper = new int[number];
            return mergeSort(0, number - 1);
        }

        private boolean mergeSort(int low, int high) {
            // check if low is smaller then high, if not then the array is sorted
            if (low < high) {
                // Get the index of the element which is in the middle
                int middle = low + (high - low) / 2;
                // Sort the left side of the array
                if (mergeSort(low, middle)) {
                    return true;
                }
                // Sort the right side of the array
                if (mergeSort(middle + 1, high)) {
                    return true;
                }
                // Combine them both
                return merge(low, middle, high);
            }
            return false;
        }

        private boolean merge(int low, int middle, int high) {
            // Copy both parts into the helper array
            System.arraycopy(numbers, low, helper, low, high + 1 - low);

            int i = low;
            int j = middle + 1;
            int k = low;
            // Copy the smallest values from either the left or the right side back to the original array
            while (i <= middle && j <= high) {
                if (helper[i] == helper[j]) {
                    return true;
                }

                if (helper[i] < helper[j]) {
                    numbers[k] = helper[i];
                    i++;
                } else {
                    numbers[k] = helper[j];
                    j++;
                }
                k++;
            }
            // Copy the rest of the left side of the array into the target array
            while (i <= middle) {
                numbers[k] = helper[i];
                k++;
                i++;
            }
            return false;
        }
    }
}
