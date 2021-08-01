package module4qus;

import java.util.stream.Stream;

public class Question9 {

    public static void main(String[] args) {
      var x = Stream.of("a", "b", "c")
              .filter(c -> c != "b");
      System.out.println(x);
    }
}
