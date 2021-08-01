package streams;

import java.util.List;
import java.util.Optional;

public class Reducing {

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(0, (x,y) -> x + y);
    }

    public Optional<Integer> min(List<Integer> list) {
        return list.stream()
                .reduce((x, y) -> x < y ? x : y);
    }
}
