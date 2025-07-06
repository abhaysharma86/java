package string.typesOfStringCreation;

public class Example1 {

    public static void main(String[] args) {

        // Strings created using literals are stored in the String Pool (inside heap memory).
        // These will reuse the same memory address if the content is identical.

        String hello = "hello"; // stored in string pool, e.g., address 1010293
        String hi = "hello";    // reused from pool, same address as 'hello'
        String hey = "hey";     // stored separately in pool, e.g., address 1010300

        // Reference comparison using '=='
        System.out.println("hello == hi: " + (hello == hi)); // true

        /*
         * Why is (hello == hi) true?
         * Because both 'hello' and 'hi' refer to the same object in the string pool.
         * The '==' operator compares memory addresses (references), not content.
         * Example: hello -> 1010293, hi -> 1010293 → both point to same memory, so result is true.
         */


        // Strings created using 'new' keyword are stored in the heap separately, even if content is same.
        String obj = new String("hello");  // new object in heap, e.g., address 6010293
        String obj1 = new String("hello"); // different object in heap, e.g., 6010297
        String obj2 = new String("hey");   // another object in heap

        // Comparing pool string with heap string using '=='
        System.out.println("hello == obj1: " + (hello == obj1)); // false
        System.out.println("hey == obj2: " + (hey == obj2));     // false

        /*
         * Although the contents are the same, '==' is false because they are different objects in memory.
         * 'hello' → string pool; 'obj1' → heap. So their references are not equal.
         */


        // Comparing actual string content using equals()
        System.out.println("hello.equals(obj1): " + hello.equals(obj1)); // true
        System.out.println("hey.equals(obj2): " + hey.equals(obj2));     // true

        /*
         * equals() compares the actual string values, not memory addresses.
         * So even if the references are different, as long as the contents match, equals() returns true.
         */
    }
}
