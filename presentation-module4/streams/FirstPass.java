package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class FirstPass {

    record Build(boolean isPassed, int getNum) {

    }

   public OptionalInt firstPass(List<Build> builds) {
      List<Integer> result = new ArrayList<>();
      for (Build build : builds) {
          if (build.isPassed()) {
              return OptionalInt.of(build.getNum());
          }
      }
      return OptionalInt.empty();
   }

    public OptionalInt firstPassAsStream(List<Build> builds) {
       return builds.stream()
               .dropWhile(b -> ! b.isPassed())
               .mapToInt(Build::getNum)
               .findFirst();
   }
}
