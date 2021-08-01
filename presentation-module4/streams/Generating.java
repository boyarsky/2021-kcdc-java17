package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Generating {

   public String tenStars() {
       return Stream.generate(() -> "*")
               .limit(10)
               .collect(Collectors.joining());
   }
}
