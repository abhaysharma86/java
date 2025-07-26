package string.comparingString;

public class StringValueOfExample {

    public static void main(String[] args) {

        // Primitive types
        int num = 123;
        double price = 99.99;
        boolean status = true;
        char grade = 'A';

        // Convert each value to String using String.valueOf()
        String s1 = String.valueOf(num);     // Converts int to "123"
        String s2 = String.valueOf(price);   // Converts double to "99.99"
        String s3 = String.valueOf(status);  // Converts boolean to "true"
        String s4 = String.valueOf(grade);   // Converts char to "A"

        // Print the string values
        System.out.println("String from int: " + s1);
        System.out.println("String from double: " + s2);
        System.out.println("String from boolean: " + s3);
        System.out.println("String from char: " + s4);

        // Special case: null object
        String nullString = String.valueOf((Object) null); // Returns the string "null"
        System.out.println("String from null object: " + nullString);
    }
}
