package string.comparingString;

public class IndexOfExample {
    public static void main(String[] args) {
        String message = "Java is powerful";

        int index1 = message.indexOf("Java");      // 0
        int index2 = message.indexOf("powerful");  // 8
        int index3 = message.indexOf("Python");    // -1 (not found)
        int index4 = message.indexOf('i');         // 5 (index of first 'i')

        System.out.println("Index of 'Java': " + index1);
        System.out.println("Index of 'powerful': " + index2);
        System.out.println("Index of 'Python': " + index3);
        System.out.println("Index of 'i': " + index4);
    }
}
