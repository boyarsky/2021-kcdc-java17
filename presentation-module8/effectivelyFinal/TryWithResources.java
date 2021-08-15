package effectivelyFinal;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TryWithResources {

    public static void main(String[] args) throws IOException {
        original();
        withVar();
        beforeTry();
    }

    private static void original() throws IOException {
        Path path = Paths.get("file");
        try (BufferedReader reader =
                     Files.newBufferedReader(path)) {
            // read file
        }
    }

    private static void withVar() throws IOException {
        var path = Paths.get("file");
        try (var reader = Files.newBufferedReader(path)) {
            // read file
        }
    }

    private static void beforeTry() throws IOException {
        var path = Paths.get("file");
        var reader = Files.newBufferedReader(path);
        try (reader) {
            // read file
        }
    }


}
