package string.concat;

public class EmptyAndNullString {

    /*
     * In Java, an empty string ("") and a null string (null) are not the same.
     *
     *  An empty string is a valid String object that contains zero characters.
     *    It is initialized and can safely be used. Its length is 0.
     *
     * A null string means the reference variable doesn't point to any object in memory.
     *    It is uninitialized and calling any method (like length()) on it will throw a NullPointerException.
     */

    public static void main(String[] args) {
        String emptyString = "";       // Valid String object with 0 length
        String nullString = null;     // Null reference, no object in memory

        // Safe: calling length() on an empty string
        System.out.println("Length of emptyString: " + emptyString.length()); // Output: 0

        // Unsafe: calling length() on a null reference will throw a NullPointerException
        // System.out.println("Length of nullString: " + nullString.length());

        // Safer way: check for null before calling methods
        if (nullString != null) {
            System.out.println("Length of nullString: " + nullString.length());
        } else {
            System.out.println("nullString is null, cannot call length().");
        }
    }
}
