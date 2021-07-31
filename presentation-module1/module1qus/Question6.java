package module1qus;

public class Question6 {

    public static void main(String[] args) {
        String sql = """
                select * \
                from mytable;""".stripIndent();
        System.out.print(sql);
    }
}
