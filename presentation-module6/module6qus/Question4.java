package module6qus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Question4 {

    public static void main(String[] args) throws IOException {
        Path path1 = Path.of("file1");
        Path path2 = Path.of("file2");

        System.out.println(Files.mismatch(path1, path2));
    }
}
