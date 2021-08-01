package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndPartitioning {

    public Map<Integer, List<String>> grouping(List<String> list) {
        return list.stream()
                .collect(Collectors.groupingBy(String::length));
    }

    public Map<Boolean, List<String>> partitioning(List<String> list) {
        return list.stream()
                .collect(Collectors.partitioningBy(String::isEmpty));
    }
}
