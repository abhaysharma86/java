package stream;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNon_RepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbcdde";

        Character character = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet().stream().filter(c -> c.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst().get();

        System.out.println(character);

        char[] charArray = str.toCharArray();
        List<Character> list = new String(charArray).chars().mapToObj(c -> (char) c).toList();
        Set<Character> collect = list.stream().filter(n -> Collections.frequency(list, n) == 1).collect(Collectors.toSet());
        System.out.println(collect);

        List<Character> list1 = str.chars()
                .mapToObj(n -> (char) n)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(n -> n.getValue() == 1)
                .map(n -> n.getKey()).toList();
        System.out.println(list1);


    }
}
