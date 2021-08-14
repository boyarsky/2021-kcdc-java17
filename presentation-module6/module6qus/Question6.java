package module6qus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Question6 {

    public static void main(String[] args) throws IOException {
        Files.lines(Path.of("lamp"))
                .filter(String::isEmpty)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
