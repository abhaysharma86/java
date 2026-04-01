package stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseStringUsingStream {
    public static void main(String[] args) {
        String str = "Hello World";
        String collect = Arrays.stream(str.split(" ")).map(m -> new StringBuilder(m).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(collect);

        Map<String, Long> collect1 = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect1);
    }
}
