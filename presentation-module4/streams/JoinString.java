package streams;

import java.util.List;
import java.util.stream.Collectors;

public class JoinString {

   public String join(List<Integer> list) {
       String result = "";
       for (Integer num : list) {
           if (! result.isBlank()) {
               result += " ";
           }
           result += num;
        }
       return result;
   }

   public String joinStream(List<Integer> list) {
       return list.stream()
               .map(Object::toString)
               .collect(Collectors.joining(" "));
   }
}
