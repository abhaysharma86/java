package string.comparingString;

public class SubstringExample {
    public static void main(String[] args) {
        String message = "Hello, Java World";

        // Extract from index 7 to end
        String part1 = message.substring(7);           // "Java World"

        // Extract from index 7 to 11 (excluding 11)
        String part2 = message.substring(7, 11);       // "Java"

        System.out.println(part1);
        System.out.println(part2);
    }
}
