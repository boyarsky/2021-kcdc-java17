package localization;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class UsingMessageFormat {

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("Zoo");
        String format = rb.getString("hello");
        System.out.println(MessageFormat.format(format, "Jeanne"));
    }
}
