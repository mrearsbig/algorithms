/* 
* Problem: Palindrome Number
* Platform: LeetCode
* Difficulty: Easy
* Link: https://leetcode.com/problems/palindrome-number/
*
* Problem Description:
* Given an integer x, return true if x is a palindrome, and false otherwise.
*
* Approach: Convert the number to a string and check if it reads the same forwards and backwards.
* Time Complexity: O(n), where n is the number of digits in the integer.
* Space Complexity: O(n), due to the string representation of the number.
*
* Alternative Approach: Reverse the integer and compare it to the original number.
* Time Complexity: O(n), where n is the number of digits in the integer.
* Space Complexity: O(1), as we are using only a few variables to store the reversed number and the original number.
*/

public class PalindromeNumber {
    // -----------------------------------
    // Method using string conversion
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // -----------------------------------
    public boolean isPalindrome(int x) {
        // Negative numbers are never palindromes
        if (x < 0) return false;

        // Convert number to string for easy character comparison
        String numberString = Integer.toString(x);

        int left = 0;                       // Left pointer
        int right = numberString.length() - 1;    // Right pointer

        while (left < right) {
            // If characters don't match, it's not a palindrome
            if (numberString.charAt(left) != numberString.charAt(right)) return false;

            left++;
            right--;
        }

        return true;
    }

    // -----------------------------------
    // Method using integer reversal
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // -----------------------------------
    public boolean isPalindromeOptimal(int x) {
        // Negative numbers are never palindromes
        if (x < 0) return false;

        int copy = x;      // Copy of the original number
        int reverse = 0;   // Reverse number

        while (copy != 0) {
            // Extract last digit and build reverse number
            reverse = reverse * 10 + copy % 10;
            copy = copy / 10;
        }

        // Return true if it's palindrome, false otherwise
        return x == reverse;
    }
}
