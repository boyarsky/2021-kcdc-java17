package nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class ReadDir {

    public static void main(String[] args) throws IOException  {
        new ReadDir().readCombinedValues();
    }

    public String readCombinedValues() throws IOException{
        Path path = Path.of("files");
        return Files.list(path)
                .map(this::readAsString)
                .collect(Collectors.joining(","));

    }

    private String readAsString(Path path) {
        try {
            return Files.readString(path);
        } catch(IOException e) {
            throw new UncheckedIOException(e);
        }
    }

}
