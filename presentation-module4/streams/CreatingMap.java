package streams;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CreatingMap {

    public Map<String, Integer> mapByName(List<String> list) {
        return list.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));
    }

    public Map<Integer, String> mapBySize(List<String> list) {
        return list.stream()
                .collect(Collectors.toMap(String::length, Function.identity(), (a, b) -> a));
    }
}
