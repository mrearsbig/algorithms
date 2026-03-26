import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Two Sum
 * Platform: LeetCode
 * Difficulty: Easy
 * Link: https://leetcode.com/problems/two-sum/
 *
 * Problem Description:
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers that add up to target.
 *
 * Approach: HashMap for O(n) lookup
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

public class TwoSum {
    // -----------------------------------
    // Brute-force method for reference
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // -----------------------------------
    public int[] twoSumBruteForce(int[] nums, int target) {
        // Brute-force approach: O(n^2) time complexity
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Sum the two elements of the array
                int sum = nums[i] + nums[j];

                // Return the indices if the sum equals the target
                if (sum == target) {
                    return new int[]{i, j};
                }

            }
        }
        // No solution found, return an empty array
        return new int[]{};
    }

    // -----------------------------------
    // Optimized method using HashMap
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------
    public int[] twoSum(int[] nums, int target) {
        // HashMap to store the value and its corresponding index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        // No solution found, return an empty array
        return new int[]{};
    }
}
