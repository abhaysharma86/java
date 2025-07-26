package string.comparingString;

public class ContainsExample {
    public static void main(String[] args) {
        String msg = "Spring Boot is popular";

        boolean check1 = msg.contains("Boot");    // true
        boolean check2 = msg.contains("spring");  // false (case-sensitive)
        boolean check3 = msg.contains("pop");     // true (substring match)

        System.out.println("Contains 'Boot'? " + check1);
        System.out.println("Contains 'spring'? " + check2);
        System.out.println("Contains 'pop'? " + check3);
    }
}
