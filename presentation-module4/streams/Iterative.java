package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterative {

   public String counting() {
       return Stream.iterate(1, i -> i+1)
               .limit(10)
               .map(Object::toString)
               .collect(Collectors.joining(" "));
   }

    public String countingWithLimit() {
        return Stream.iterate(1, i -> i <=10, i -> i+1)
                .map(Object::toString)
                .collect(Collectors.joining(" "));
    }
}
