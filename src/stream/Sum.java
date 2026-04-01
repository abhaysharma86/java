package stream;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<Integer> list = List.of(8, 3, 5, 1, 9, 2);

        int sum = list.stream().mapToInt(n -> n).sum();
        System.out.println(sum);
        
    }



}
