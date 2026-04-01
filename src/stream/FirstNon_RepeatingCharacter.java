package stream;


import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
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

    }
}
