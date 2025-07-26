package string.comparingString;

public class EndsWithExample {
    public static void main(String[] args) {
        String fileName = "report.pdf";

        boolean a = fileName.endsWith(".pdf");    // true
        boolean b = fileName.endsWith(".doc");    // false
        boolean c = fileName.endsWith("t.pdf");   // true

        System.out.println(a); // true
        System.out.println(b); // false
        System.out.println(c); // true
    }
}
