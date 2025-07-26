package string.comparingString;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatDateExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String formatted = String.format("Today is: %s", now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
        System.out.println(formatted);
    }
}
