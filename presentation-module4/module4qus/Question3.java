package module4qus;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question3 {

    public static void main(String[] args) {
        var map = Stream.generate(() -> 1)
                .limit(5)
                .collect(Collectors.partitioningBy(x -> x % 2 ==0));
        System.out.println(map);

    }
}
