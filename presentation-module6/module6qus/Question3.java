package module6qus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question3 {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("file");

        System.out.println(Files.mismatch(path, path));
    }
}
