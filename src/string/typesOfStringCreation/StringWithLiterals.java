package string.typesOfStringCreation;

public class StringWithLiterals {


    /*
    * String can be created using string literals or by using the new operator: You can create a string
    * by a sequence of character in double quotes, like this : String str = "Hello"; or you can create a string
    * using the new operator, like this: String str = new String("Hello");
    * */

    /*
    * when we create a string suing the literals like show below, the string will store inside a space called "String pool"
    * */


    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str);

    }

    /*
    * String pool is a special area of heap memory that stores a pool of unique string literals in java.
    * When you create a string literal in your java code, the JVM checks if the string already exists in the
    * string poll. if it does, then the existing string is returned from the pool instead of creating a new sting object.
    * This is called string "interning".
    * */

}
