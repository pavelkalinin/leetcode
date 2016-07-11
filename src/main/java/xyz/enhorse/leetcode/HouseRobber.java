package xyz.enhorse.leetcode;

/**
 * https://leetcode.com/problems/house-robber/
 */
public class HouseRobber {
    public int rob(int[] houses) {
        int result = 0;
        int neighbour1 = 0;
        int neighbour2 = 0;

        for (int v : houses) {
            result = Math.max(neighbour1, neighbour2 + v);
            neighbour2 = neighbour1;
            neighbour1 = result;
        }

        return result;
    }
}
