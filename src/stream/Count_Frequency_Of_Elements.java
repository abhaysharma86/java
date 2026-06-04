package stream;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Count_Frequency_Of_Elements {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange");

        Map<String, Long> collect =
                list.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));


        Set<String> collect1 = list.stream().filter(n -> Collections.frequency(list, n) > 1).collect(Collectors.toSet());
        System.out.println(collect1);

        System.out.println(collect);
    }
}
