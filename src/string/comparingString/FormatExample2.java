package string.comparingString;

public class FormatExample2 {
    public static void main(String[] args) {
        int age = 25;
        double price = 123.456;

        String output = String.format("Age: %d, Price: %.2f", age, price);
        System.out.println(output);  // Output: Age: 25, Price: 123.46
    }
}
