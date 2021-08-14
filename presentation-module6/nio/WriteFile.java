package nio;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Stream;

public class WriteFile {

    public static void main(String[] args) throws IOException  {
        Path path = Path.of("kcdc.txt");
        Files.writeString(path, "hello");
        Files.write(path, List.of("hello"));
        Files.write(path, "hello".getBytes(Charset.defaultCharset()));

        Files.writeString(path, "hello", StandardOpenOption.APPEND);

        printWriter();
        bufferedWriter();
        bufferedStream();
    }

    private static void printWriter() throws IOException {
        File file = new File("kcdc.txt");
        try (PrintWriter writer = new PrintWriter(new FileWriter(file))) {
            writer.println("Hello\n");
        }
    }

    private static void bufferedWriter() throws IOException {
        File file = new File("kcdc.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Hello\n");
        }
    }

    private static void bufferedStream() throws IOException {
        File file = new File("kcdc.txt");
        try (BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file))) {
            stream.write("Hello\n".getBytes(Charset.defaultCharset()));
        }
    }
}
