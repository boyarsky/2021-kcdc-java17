package module5qus;

import java.text.MessageFormat;

public class Question10 {

    public static void main(String[] args) {
        String format = "{1} < {0}";
        System.out.println(MessageFormat.format(format, 3, 5));

    }
}
