package stream;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Second_Smallest_Number {
    public static void main(String[] args) {
        List<Integer> list = List.of(8,3,5,1,9,2);
        Optional<Integer> first = list.stream().sorted()
                .skip(1)
                .findFirst();
        first.ifPresent(System.out::println);

    }
}
