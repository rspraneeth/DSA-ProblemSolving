package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(Arrays.asList(4, 50, 6, 7, 4, 28, 2, 46, 63, 13, 5));
        Stream<Integer> l1 = l.stream().filter(i -> i % 2 == 0);
        l1.forEach(System.out::println);
        var li = l.stream().filter(i-> i>=10 && i<=50).toList();
        System.out.println(li);
        
    }
}
