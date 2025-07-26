package string.comparingString;

public class FormatExample3 {
    public static void main(String[] args) {
        String result = String.format("|%-10s|%10s|", "Left", "Right");
        System.out.println(result);  // Output: |Left      |     Right|
    }
}
