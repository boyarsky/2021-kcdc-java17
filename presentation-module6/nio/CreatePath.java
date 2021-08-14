package nio;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePath {

    public static void main(String[] args) {
        Path path1 = Paths.get("files","kcdc.txt");
        Path path2 = Paths.get("files/kcdc.txt");
        Path path3 = Path.of("files/kcdc.txt");
        Path path4 = new File("files/kcdc.txt").toPath();

        System.out.println(path1.toAbsolutePath());
        System.out.println(path2.toAbsolutePath());
        System.out.println(path3.toAbsolutePath());
        System.out.println(path4.toAbsolutePath());
    }
}
