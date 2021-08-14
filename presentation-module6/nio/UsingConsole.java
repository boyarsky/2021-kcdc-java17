package nio;

import java.io.*;

public class UsingConsole {

    public static void main(String[] args) throws IOException  {
        Console c = System.console();
        String line = c.readLine("Name?");
        String formatting = c.readLine("%s?", "Name");
        char[] password = c.readPassword();
        char[] pwd = c.readPassword("%s?", "Secrets");

        c.printf("%d", 1);
        c.format("%b", true);

    }

}
