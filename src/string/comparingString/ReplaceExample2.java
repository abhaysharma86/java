package string.comparingString;

public class ReplaceExample2 {
    public static void main(String[] args) {
        String sentence = "I love Java. Java is powerful.";

        // Replace "Java" with "Python"
        String result = sentence.replace("Java", "Python");

        System.out.println(result); // "I love Python. Python is powerful."
    }
}
