package string.comparingString;

public class BufferBuilderExample {
    public static void main(String[] args) {

        // Using StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World"); // Appends string
        System.out.println("append: " + sb); // Hello World

        sb.insert(6, "Java "); // Inserts at index
        System.out.println("insert: " + sb); // Hello Java World

        sb.replace(6, 10, "Awesome"); // Replace Java → Awesome
        System.out.println("replace: " + sb); // Hello Awesome World

        sb.delete(6, 14); // Delete Awesome
        System.out.println("delete: " + sb); // Hello World

        sb.deleteCharAt(5); // Removes space
        System.out.println("deleteCharAt: " + sb); // HelloWorld

        sb.reverse(); // Reverses the buffer
        System.out.println("reverse: " + sb); // dlroWolleH

        sb.reverse(); // Restore back
        sb.setCharAt(0, 'Y'); // Change char at index 0
        System.out.println("setCharAt: " + sb); // YelloWorld

        System.out.println("charAt(1): " + sb.charAt(1)); // e
        System.out.println("substring(0, 5): " + sb.substring(0, 5)); // Yello
        System.out.println("length: " + sb.length()); // 10
        System.out.println("capacity: " + sb.capacity()); // 16 (default) or more

        sb.ensureCapacity(50); // Ensures capacity is at least 50
        System.out.println("capacity after ensure: " + sb.capacity());

        // StringBuilder (works same way)
        StringBuilder builder = new StringBuilder("Monocept");
        builder.append(" Solutions");
        System.out.println("Builder: " + builder); // Monocept Solutions
    }
}
