package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_Frequency_Of_Elements {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange");

        Map<String, Long> collect =
                list.stream().collect(Collectors.groupingBy(s->s, Collectors.counting()));

        System.out.println(collect);
    }
}
