package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/power-of-three/
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        double x = Math.log(n) / Math.log(3);
        return Math.abs(x - Math.rint(x)) <= 0.00000000000001;
    }
}
