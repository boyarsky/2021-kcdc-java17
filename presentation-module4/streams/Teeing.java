package streams;

import java.util.List;
import java.util.stream.Collectors;

public class Teeing {

    public static void main(String[] args) {
        record Separations(String spaceSeparated, String commaSeparated) {}

        var list = List.of("x", "y", "z");
        Separations result = list.stream()
                .collect(Collectors.teeing(Collectors.joining(" "),
                        Collectors.joining(","),
                        (s, c) -> new Separations(s, c)));

        System.out.println(result);

    }
}
