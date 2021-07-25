package textblocks;

public class Transforming {

    public static void main(String[] args) {
        String option1 = "chiefs".transform(s -> s.toUpperCase());
        String option2 = """
                chiefs
                """.transform(s -> s.toUpperCase());

        System.out.println(option1);
        System.out.println(option2);
    }
}
