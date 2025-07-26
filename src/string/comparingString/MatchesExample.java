package string.comparingString;

public class MatchesExample {
    public static void main(String[] args) {
        String text1 = "abc123";
        String text2 = "12345";

        // Check if it contains only digits
        boolean onlyDigits = text2.matches("[0-9]+");  // true

        // Check if it starts with letters and ends with digits
        boolean patternMatch = text1.matches("[a-zA-Z]+[0-9]+");  // true

        // Case-sensitive match
        boolean exactMatch = "Hello".matches("Hello");  // true
        boolean caseMismatch = "Hello".matches("hello"); // false

        System.out.println(onlyDigits);     // true
        System.out.println(patternMatch);   // true
        System.out.println(exactMatch);     // true
        System.out.println(caseMismatch);   // false
    }
}
