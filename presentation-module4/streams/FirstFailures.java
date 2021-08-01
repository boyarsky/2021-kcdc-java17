package streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FirstFailures {

    record Build(boolean isPassed, int getNum) {

    }

   public List<Integer> firstFailures(List<Build> builds) {
      List<Integer> result = new ArrayList<>();
      for (Build build : builds) {
          if (!build.isPassed()) {
              result.add(build.getNum());
          } else {
              return result;
          }
      }
      return Collections.emptyList();
   }

    public List<Integer> firstFailuresAsStream(List<Build> builds) {
       return builds.stream()
               .takeWhile(b -> ! b.isPassed())
               .map(Build::getNum)
               .collect(Collectors.toList());
   }
}
