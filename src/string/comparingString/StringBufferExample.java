package string.comparingString;

public class StringBufferExample {
    public static void main(String[] args) {

        // Create a new StringBuffer with initial value
        StringBuffer sb = new StringBuffer("Hello");

        // Append text at the end
        sb.append(" World");
        System.out.println("append: " + sb); // Hello World

        // Insert text at a specific position
        sb.insert(6, "Java ");
        System.out.println("insert: " + sb); // Hello Java World

        // Replace part of the string from index 6 to 10 with new text
        sb.replace(6, 10, "Awesome");
        System.out.println("replace: " + sb); // Hello Awesome World

        // Delete part of the string from index 6 to 14
        sb.delete(6, 14);
        System.out.println("delete: " + sb); // Hello World

        // Delete character at index 5
        sb.deleteCharAt(5);
        System.out.println("deleteCharAt: " + sb); // HelloWorld

        // Reverse the entire string
        sb.reverse();
        System.out.println("reverse: " + sb); // dlroWolleH

        // Restore original string by reversing again
        sb.reverse();

        // Set character at specific index
        sb.setCharAt(0, 'Y');
        System.out.println("setCharAt: " + sb); // YelloWorld

        // Get character at a given index
        char ch = sb.charAt(1);
        System.out.println("charAt(1): " + ch); // e

        // Get substring from index 0 to 5
        String sub = sb.substring(0, 5);
        System.out.println("substring(0, 5): " + sub); // Yello

        // Length of current content
        int length = sb.length();
        System.out.println("length: " + length); // 10

        // Current capacity (default is 16, grows automatically)
        int cap = sb.capacity();
        System.out.println("capacity: " + cap);

        // Ensure minimum capacity
        sb.ensureCapacity(50);
        System.out.println("capacity after ensure: " + sb.capacity());
    }
}
