package streams;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public List<String> flatten() {
        var first = List.of("a", "b");
        List<String> second = List.of();
        var listOfLists = List.of(first, second);

        return listOfLists.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }
}
