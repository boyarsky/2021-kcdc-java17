package module1qus;

public class Question8 {

    public static void main(String[] args) {
        String sql = """
                  select "name"
                  from mytable;
                """;
        System.out.println(sql.length());
        System.out.println(sql.strip().length());
    }
}
