package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReverseStringUsingStream {
    public static void main(String[] args) {
        String str = "Hello World";
        String collect = Arrays.stream(str.split(" ")).map(m -> new StringBuilder(m).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(collect);

    }
}
