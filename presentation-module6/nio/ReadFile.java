package nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class ReadFile {

    public static void main(String[] args) throws IOException  {
        Path path = Path.of("files/kcdc.txt");
        String str = Files.readString(path);
        List<String> list = Files.readAllLines(path);
        String strOld = new String(Files.readAllBytes(path), Charset.defaultCharset());
        System.out.println(str);
        list.forEach(System.out::println);
        System.out.println(strOld);

        Files.lines(path).forEach(System.out::println);

        try (Stream<String> stream = Files.lines(path)) {
            stream.forEach(System.out::println);
        }

        resource();
        originally();
    }

    private static void resource() throws IOException {
        File file = new File("files/kcdc.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    private static void originally() throws IOException {
        File file = new File("files/kcdc.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
