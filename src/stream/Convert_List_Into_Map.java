package stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Convert_List_Into_Map {
    public static void main(String[] args) {
        List<String> list = List.of("A","B","C");

        Map<String, Integer> collect = list.stream().collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(collect);


    }
}
