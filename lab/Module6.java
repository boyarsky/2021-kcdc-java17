import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.stream.Stream;

public class Module6 {

    private Path path1;
    private Path path2;
    private Path path3;
    private Path path4;
    private Path path5;

    public static void main(String... args) throws IOException {
        Module6 mod = new Module6();
        mod.createPaths();
        mod.deleteIfExists();
        mod.writeFiles();
        mod.printFiles();
        mod.mismatch();
        mod.walk();
    }

    private void createPaths() {
        path1 = Paths.get("out/file1.txt");
        path2 = Path.of("out/file2.txt");
        path3 = path1.resolve("../file3.txt").normalize().toAbsolutePath();
        path4 = Path.of("dir").relativize(Path.of("dir/out/file4.txt"));
        path5 = Path.of("out/dir/../file5.txt").normalize();

        System.out.println(path1.toAbsolutePath().normalize());
        System.out.println(path2.toAbsolutePath().normalize());
        System.out.println(path3.toAbsolutePath().normalize());
        System.out.println(path4.toAbsolutePath().normalize());
        System.out.println(path5.toAbsolutePath().normalize());
    }

    private void deleteIfExists() {
        try {
            Files.deleteIfExists(path1);
            Files.deleteIfExists(path2);
            Files.deleteIfExists(path3);
            Files.deleteIfExists(path4);
            Files.deleteIfExists(path5);
        } catch(IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private void writeFiles() throws IOException {
        Files.writeString(path1, "hello file 1");
        Files.write(path2, List.of("hello file 2"));
        Files.write(path3, "hello file 3".getBytes(Charset.defaultCharset()));

        try (BufferedWriter writer = Files.newBufferedWriter(path4)) {
            writer.write("hello file 4");
        }

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(path5))) {
            writer.println("hello file 5");
        }
    }

    private void printFiles() throws IOException {
        System.out.println(Files.readString(path1));
        Files.readAllLines(path2).forEach(System.out::println);
        System.out.println(new String(Files.readAllBytes(path3)));

        try (Stream<String> stream = Files.lines(path4)) {
            stream.forEach(System.out::println);
        }

        try (BufferedReader reader = Files.newBufferedReader(path5)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    private void mismatch() throws IOException {
        System.out.println(Files.mismatch(path1, path2));
    }

    private void walk() throws IOException {
        try (Stream<Path> stream = Files.walk(path1.getParent())) {
            stream.forEach(System.out::println);
        }
    }
}
