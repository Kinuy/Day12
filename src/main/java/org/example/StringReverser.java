package org.example;


public class StringReverser {

    public static String reverseString(String input) {
        // Create a new StringBuilder initialized with the input string
        StringBuilder reversed = new StringBuilder(input);

        // Reverse the content using the built-in reverse() method
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        // Example usage
        String original = "Hello";
        String reversed = reverseString(original);

        System.out.println("Original: " + original);  // Output: Hello
        System.out.println("Reversed: " + reversed);  // Output: olleH
    }
}
