package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesApis {

    public static void main(String[] args) throws IOException  {
        Path kcdc = Path.of("files/kcdc.txt");
        Path kc = Path.of("files/kc.txt");

        System.out.println(Files.mismatch(kcdc, kc));
        System.out.println(Files.mismatch(kcdc, kcdc));

    }
}
