package string.comparingString;

public class CharacterIndex {
    public static void main(String[] args) {

        // Accessing character by index
        String java = "JAVA";
        char j = java.charAt(0); // returns 'J' — character at index 0

        // Checking for empty string
        String myString = "";
        boolean empty = myString.isEmpty(); // true — the string has no characters

        // Another way to check if a string is empty
        boolean equals = "".equals(myString); // true — comparing with an empty string

        // Yet another way to check for empty string
        boolean b = myString.length() == 0; // true — length is 0

        // Changing case
        String originalString = "Java";

        String upperCase = originalString.toUpperCase(); // "JAVA"
        String lowerCase = originalString.toLowerCase(); // "java"

        // You can print them to verify
        System.out.println("Char at index 0: " + j);
        System.out.println("Is empty: " + empty);
        System.out.println("Equals empty string: " + equals);
        System.out.println("Length == 0: " + b);
        System.out.println("To Upper Case: " + upperCase);
        System.out.println("To Lower Case: " + lowerCase);
    }
}
