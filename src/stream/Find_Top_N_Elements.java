package stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Top_N_Elements {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 1, 9, 3, 7);
        list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList()).forEach(System.out::println);

    }
}
