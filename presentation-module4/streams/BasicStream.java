package streams;

import java.util.List;
import java.util.stream.Collectors;

public class BasicStream {

    public static void main(String[] args) {

        List<String> list = List.of("abc");

        List<Integer> result =

        list.stream()
                .map(String::strip)
                .filter(s -> ! s.isBlank())
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
