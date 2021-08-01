package module4qus;

import java.util.stream.Stream;

public class Question2 {

    public static void main(String[] args) {
        Stream.iterate(1, i-> i< 10, i-> i++)
                .takeWhile(i -> i < 5)
                .forEach(System.out::println);

    }
}
