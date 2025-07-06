package string.concat;

public class ConcatExample {

    /*
     * A single string literal can be formed by combining multiple string literals.
     * You can concatenate two or more strings using the '+' operator, as shown below.
     * No other arithmetic operators can be applied to string literals or objects.
     *
     * You can also combine strings using the concat() method, which is a built-in method of the String class.
     */

    public static void main(String[] args) {

        // Concatenating string literals using '+' operator
        // This is resolved at compile-time and stored in the String pool
        String hello = "Hello" + " " + "World";

        // Using concat() method to combine strings
        // The result is a new String object stored in the heap (not reused unless interned)
        String concatString = "Hello ".concat("World");

        // Example using variables and concat method
        String hey = "Hello";
        String hi = "World!";
        String hw = hey.concat(" ").concat(hi);

        // Output
        System.out.println("Using '+' operator: " + hello); // Using '+' operator: Hello World
        System.out.println("Using concat(): " + concatString); // Using concat(): Hello World
        System.out.println("Using concat() with variables: " + hw); // Using concat() with variables: Hello World!
    }
}
