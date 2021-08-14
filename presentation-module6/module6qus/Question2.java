package module6qus;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Question2 {

    public static void main(String[] args) throws IOException  {
        Path clock = Path.of("time/device/../clock");
        Path phone = Paths.get("time/phone");
        System.out.println(clock.relativize(phone));
    }
}
