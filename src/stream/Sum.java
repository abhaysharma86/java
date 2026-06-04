package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sum {
    public static void main(String[] args) {
        List<Integer> list = List.of(0, 1, 2);

        int sum = list.stream().mapToInt(n -> n).sum();
        System.out.println(sum);


        Map<Integer, Long> collect = list.stream()
                .filter(n -> n / 2 != 0)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        Set<Integer> collect1 = list.stream().filter(n -> Collections.frequency(list, n) > 1).collect(Collectors.toSet());
        System.out.println(collect1);

        Set<Integer> re = new HashSet<>();
        for (int i : list) {
            if (Collections.frequency(list, i) > 1) {
                re.add(i);
            }
        }
        System.out.println(re);

    }


}
