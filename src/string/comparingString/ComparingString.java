package string.comparingString;

public class ComparingString {

    /*
     * When working with strings in Java, you might need to compare them
     * either to check if they are equal or to sort them in a specific order.
     * Here's how you can do that:
     */

    public static void main(String[] args) {

        /* ---------- Comparing for Equality ---------- */

        /*
         * To check if two strings have the same content, use the equals() method.
         * Note: Using '==' checks for reference equality (memory address), not content.
         */

        String str1 = new String("Hey");
        String str2 = new String("Hello");
        String str3 = new String("Hey");

        boolean b1 = str1.equals(str2); // false — "Hey" is not equal to "Hello"
        boolean b2 = str1.equals(str3); // true — both have same content "Hey"

        b1 = str1.equals("Hey");        // true — content matches
        b2 = "Hey".equals(str1);        // true — safe way to avoid NullPointerException
        b1 = "Hey".equals("Hello");     // false — content is different

        /*
         * If you want to compare strings ignoring case (e.g., "HEY" vs "hey"), use equalsIgnoreCase().
         */

        boolean hey = str1.equalsIgnoreCase("HEY"); // true

        /*
         * Use equals() when case matters.
         * Use equalsIgnoreCase() when case does NOT matter.
         */

        /* ---------- Lexicographical Comparison ---------- */

        /*
         * compareTo() compares strings lexicographically (dictionary order).
         * It returns:
         *  - 0 if both strings are equal
         *  - a negative number if the first string comes before the second
         *  - a positive number if the first string comes after the second
         */

        int comparison1 = "java".compareTo("java");     // 0  → both are equal
        int comparison2 = "java".compareTo("python");   // -6 → 'j' comes before 'p'
        int comparison3 = "python".compareTo("java");   // 6  → 'p' comes after 'j'
    }
}
