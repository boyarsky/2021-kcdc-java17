package textblocks;

public class Indenting {

    public static void main(String[] args) {
        String option1 = "   a\n   b\n   c\n";
        String option2 = "a\nb\nc\n".indent(3);
        String option3 = """
                a
                b
                c
                """.indent(3);
        String option4 = """
                   a
                   b
                   c
                """;

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
        System.out.println(option4);
    }
}
