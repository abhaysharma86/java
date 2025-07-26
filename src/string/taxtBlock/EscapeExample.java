package string.taxtBlock;

public class EscapeExample {
    public static void main(String[] args) {

        // Text blocks can still use escape sequences like \" for quotes
        String quote = """
                He said, \"Java is awesome!\"
                Let's learn it.
                """;

        System.out.println(quote);
    }
}
