package module8qus;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question5 {

    public static void main(String[] args) throws IOException {
        var path = Paths.get("file");
        var reader = Files.newBufferedReader(path);
       // reader = Files.newBufferedReader(path);
        try(reader) {
            // read file
        }

    }
}
