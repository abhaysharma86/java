package string.comparingString;

public class FormatExample1 {
    public static void main(String[] args) {
        String name = "Abhay";
        String message = String.format("Hello, %s!", name);
        System.out.println(message);  // Output: Hello, Abhay!
    }
}
