package string.length;

public class FindStringLength {

    public static void main(String[] args) {
        // Create two string variables
        String str1 = "Hello";
        String str2 = "Java";

        // Combine both strings with a space in between
        String combined = str1 + " " + str2; // Result: "Hello Java"

        // Get the length (number of characters) of each string
        int length1 = str1.length();        // "Hello" has 5 characters
        int length2 = str2.length();        // "Java" has 4 characters
        int combinedLength = combined.length(); // "Hello Java" has 10 characters (5 + 1 space + 4)

        // Print lengths of str1, str2, and combined string
        System.out.println(length1);        // Output: 5
        System.out.println(length2);        // Output: 4
        System.out.println(combinedLength); // Output: 10

        // Example: getting length of empty and non-empty strings
        int len1 = "".length();             // Empty string has 0 characters
        int len2 = "Hello".length();        // "Hello" has 5 characters

        // Print both lengths
        System.out.println(len1);           // Output: 0
        System.out.println(len2);           // Output: 5

    }

}
