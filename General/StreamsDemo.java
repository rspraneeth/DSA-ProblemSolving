package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 4, 2, 2, 46, 63, 13, 5));
        Stream<Integer> l1 = l.stream().filter(i -> i % 2 == 0);
        l1.forEach(System.out::println);
        
    }
}
