package module4qus;

import java.util.stream.Stream;

public class Question5 {

    public static void main(String[] args) {
        long count = Stream.ofNullable(null).count();
        System.out.println(count);


    }
}
