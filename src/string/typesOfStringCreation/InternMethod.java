package string.typesOfStringCreation;

public class InternMethod {

    /*
     * In Java, when you create a string using double quotes (""), it is stored in a special area called the "String Pool".
     * When you use the 'new' keyword, Java creates a new object in the heap memory — even if the content is the same.
     *
     * The intern() method helps save memory.
     * It tells Java: "If a string with this content already exists in the pool, then use that one instead."
     */

    public static void main(String[] args) {

        // This string is created using a string literal, so it goes into the string pool
        String hello = "hello"; // stored in string pool

        // This string is created using 'new', so it's a new object in heap memory
        String obj = new String("hello"); // stored in heap (separate object)

        // Comparing memory addresses using '=='
        System.out.println("hello == obj: " + (hello == obj)); // false — different memory

        /*
         * Although 'hello' and 'obj' have the same text,
         * they are in different locations in memory (pool vs. heap),
         * so '==' returns false.
         */


        // Now we use intern() to move the string to the string pool
        String obj1 = new String("hello").intern();

        // Now both 'hello' and 'obj1' point to the same object in the string pool
        System.out.println("hello == obj1: " + (hello == obj1)); // true

        /*
         * When we call intern(), Java checks:
         * "Is there already a string 'hello' in the pool?"
         * Yes → So it returns the reference of the existing 'hello'.
         *
         * Now both 'hello' and 'obj1' refer to the same object, so '==' returns true.
         */
    }
}
