package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEven_Odd {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 1, 9, 3, 7, 2, 4);

        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);
    }
}
