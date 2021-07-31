package module1qus;

public class Question10 {

    public static void main(String[] args) {
        String sql = """
                  select \"name\"
                  from mytable \
                  where value = '\"\""'
                """;
        System.out.println(sql);

    }
}
