package nio;

import java.io.IOException;
import java.nio.file.Path;

public class HelpfulNullPointer {

    public static void main(String[] args) throws IOException  {
        Path path = null;
        // lots of code here
        System.out.println(path.toAbsolutePath());
    }
}
