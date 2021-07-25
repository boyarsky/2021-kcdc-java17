public class Module1 {

    public static void main(String[] args) {
        String step1 = """
                -------------------------------
                |         |         |         |
                -------------------------------
                |         |         |         |
                -------------------------------
                |         |         |         |
                -------------------------------
                """;

        String step2 = """
                "My Board"
                -------------------------------
                |         |         |         |
                -------------------------------
                |         |         |         |
                -------------------------------
                |         |         |         |
                -------------------------------
                """;

        String step3 = """
                "My Board"
                -------------------------------
                |         |         |         |
                -------------------------------
                |         |         |         |
                -------------------------------
                |         |         |         |
                -------------------------------
               The rules of tic tac toe are interesting \
               because kids play it and so do computers    \s""";

        System.out.println(step1);
        System.out.println(step2);
        System.out.println(step3);

        System.out.println(step3.length());
        System.out.println(step3.strip().length());
        System.out.println(step3.stripIndent().length());
        System.out.println(step3.stripLeading().length());
        System.out.println(step3.stripTrailing().length());
    }
}
