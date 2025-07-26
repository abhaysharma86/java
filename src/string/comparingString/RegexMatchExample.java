package string.comparingString;

public class RegexMatchExample {
    public static void main(String[] args) {
        String str1 = "Hello world!";
        String str2 = "worldwide news";
        String str3 = "Say hello";

        // Check if the string contains the word "world"
        boolean b1 = str1.matches(".*world.*");  // true
        boolean b2 = str2.matches(".*world.*");  // true
        boolean b3 = str3.matches(".*world.*");  // false

        System.out.println(b1);  // true
        System.out.println(b2);  // true
        System.out.println(b3);  // false
    }
}
