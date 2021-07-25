package textblocks;

public class Escaping {

    public static void main(String[] args) {
        String textBlock = """
                better \"""
                but can do \"\"\"
                """;

        System.out.println(textBlock);
    }
}
