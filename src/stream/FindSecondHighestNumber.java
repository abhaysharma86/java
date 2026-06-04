package stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
        List<Integer> list = List.of(10,20,30,40,50);

        Optional<Integer> first = list.stream()
                .sorted(Collections.reverseOrder())
                .skip(1).findFirst();

        System.out.println(first);


        list.stream().sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(1)
                .forEach(System.out::println);

    }
}
