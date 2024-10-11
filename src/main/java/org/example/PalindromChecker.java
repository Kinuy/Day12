package org.example;

public class PalindromChecker {

    public static boolean isPalindrome(String input) {
        // Convert the string to lowercase to ensure case-insensitive comparison
        input = input.toLowerCase();

        // Initialize pointers at the start and end of the string
        int left = 0;
        int right = input.length() - 1;

        // Loop through the string, comparing characters from both ends
        while (left < right) {
            // If characters do not match, it's not a palindrome
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            // Move the pointers towards the center
            left++;
            right--;
        }

        // If all characters match, the string is a palindrome
        return true;
    }

    public static void main(String[] args) {
        // Example usage
        String word = "Anna";
        if (isPalindrome(word)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }

}
