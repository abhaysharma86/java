package string.comparingString;

public class StartsWithExample {
    public static void main(String[] args) {
        String message = "Java Programming";

        boolean a = message.startsWith("Java");     // true
        boolean b = message.startsWith("java");     // false (case-sensitive)
        boolean c = message.startsWith("J");        // true

        System.out.println(a); // true
        System.out.println(b); // false
        System.out.println(c); // true
    }
}
