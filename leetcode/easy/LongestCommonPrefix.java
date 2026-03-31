/*
* Problem: Longest Common Prefix
* Plaatform: LeetCode
* Difficulty: Easy
* Link: https://leetcode.com/problems/longest-common-prefix/
*
* Problem Description:
* Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
*
* Approach: Compare characters of the first string with the corresponding characters of the other strings until a mismatch is found.
* Time Complexity: O(n * m), where n is the number of strings and m is the length of the longest common prefix.
* Space Complexity: O(1), as we are using only a few variables to store the result and the first string.
*/

public class LongestCommonPrefix {
    // -----------------------------------
    // Method using character comparison
    // Time Complexity: O(n * m)
    // Space Complexity: O(1)
    // -----------------------------------
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];  // Take the first string as prefix
        StringBuilder result = new StringBuilder();  // StringBuilder is used for efficient string concatenation

        for (int i = 0; i < prefix.length(); i++) {
            boolean match = true;

            for (int j = 1; j < strs.length; j++) {
                // If index exceeds string length or characters don't match
                if (i >= strs[j].length() || strs[j].charAt(i) != prefix.charAt(i)) {
                    match = false;
                    break;
                }
            }

            if (!match) break;

            result.append(prefix.charAt(i));
        }

        return result.toString();
    }

    // -----------------------------------
    // Optimized method using indexOf
    // Time Complexity: O(n * m)
    // Space Complexity: O(1)
    // -----------------------------------
    public String longestCommonPrefixOptimized(String[] strs) {
        String prefix = strs[0];  // Take the first string as prefix

        for (int i = 1; i < strs.length; i++) {
            // Shrink prefix until it's found at index 0 of current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
