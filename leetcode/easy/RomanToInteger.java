/*
* Problem: 13. Roman to Integer
* Platform: LeetCode
* Difficulty: Easy
* Link: https://leetcode.com/problems/roman-to-integer/
*
* Problem Description:
* Given a roman numeral, convert it to an integer.
*
* Approach: Use a mapping of Roman numerals to their integer values and iterate through the string, adding or subtracting values based on the order of the numerals.
* Time Complexity: O(n), where n is the length of the input string.
* Space Complexity: O(1), as the mapping of Roman numerals is constant in size.
*/

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    // -----------------------------------
    // Method to convert Roman numeral to integer
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------
    public int romanToInt(String s) {
        // Map roman numerals to their integer values
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            // Check if there is a next value to compare
            if (i < s.length() - 1) {
                int next = map.get(s.charAt(i + 1));

                // If current >= next, add it; otherwise subtract (e.g. IV = 4)
                if (current >= next) {
                    result += current;
                } else {
                    result += next - current;
                    i++; // Skip next character, already processed
                }
            } else {
                result += current; // Last character, just add it
            }
        }

        return result;
    }

    // -----------------------------------
    // Optimized method to convert Roman numeral to integer
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------
    public int romanToIntOptimal(String s) {
        // Map roman numerals to their integer values
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            // If current < next value, subtract (e.g. I before V = -1)
            // Otherwise add normally
            if (i < s.length() - 1 && current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }

        return result;
    }
}
