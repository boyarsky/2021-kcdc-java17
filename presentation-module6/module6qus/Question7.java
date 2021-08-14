package module6qus;

import java.io.Console;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Question7 {

    public static void main(String[] args) throws IOException {
        Console console = System.console();
        char[] secret = console.readPassword();
        System.out.println(secret);
    }
}
