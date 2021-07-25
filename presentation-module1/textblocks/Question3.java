package textblocks;

public class Question3 {

    public static void main(String[] args) {
        String sql = """
                select *    \s
                from mytable     \s
                where weather = 'snow';
""";

        System.out.println(sql);
    }
}
