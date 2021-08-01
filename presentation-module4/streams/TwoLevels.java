package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoLevels {

    public Map<Integer, Long> grouping(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
    }

    public Map<Boolean, Long> partitioning(List<String> list) {
        return list.stream()
                .collect(Collectors.partitioningBy(String::isEmpty, Collectors.counting()));
    }
}
