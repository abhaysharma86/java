package string.comparingString;

import java.util.List;

public class JoinExample3 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        String joinedNames = String.join(" | ", names);
        System.out.println(joinedNames); // Output: Alice | Bob | Charlie
    }
}
