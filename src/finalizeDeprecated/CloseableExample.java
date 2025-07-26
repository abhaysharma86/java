package finalizeDeprecated;

import java.io.*;

public class CloseableExample {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("sample.txt"))) {
            String line = reader.readLine();
            System.out.println("First line: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
