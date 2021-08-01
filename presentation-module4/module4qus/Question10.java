package module4qus;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question10 {

    public static void main(String[] args) {
      var x = Stream.of("a", "bb", "ccc")
                      .collect(Collectors.toMap(String::length, Function.identity()));
      System.out.println(x);
    }
}
