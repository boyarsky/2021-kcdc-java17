package streams;

public class UsingStrings {

   public long countLinesWithQuestionMark(String text) {
      return text.lines()
              .filter(s -> s.contains("?"))
              .count();
   }

    public long countQuestionMark(String text) {
        return text.chars()
                .filter(c -> c == '?')
                .count();
    }
}
