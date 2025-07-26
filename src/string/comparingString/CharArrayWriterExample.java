package string.comparingString;

import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterExample {
    public static void main(String[] args) throws IOException {

        // Create a CharArrayWriter
        CharArrayWriter writer = new CharArrayWriter();

        // Write individual characters
        writer.write('H');
        writer.write('e');
        writer.write('l');
        writer.write('l');
        writer.write('o');

        // Write a string
        writer.write(" World");

        // Convert to character array
        char[] charArray = writer.toCharArray();
        System.out.println("CharArray: " + new String(charArray)); // Output: Hello World

        // Convert to String
        String result = writer.toString();
        System.out.println("String: " + result); // Output: Hello World

        // Reset the writer (clears the buffer)
        writer.reset();
        writer.write("New Content");
        System.out.println("After reset: " + writer.toString()); // Output: New Content

        writer.close(); // Optional (no real effect in CharArrayWriter)
    }
}
