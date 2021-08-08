package localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class ReadingResourceBundle {

    public static void main(String[] args) {
        Locale french = new Locale("fr", "FR");
        ResourceBundle rb = ResourceBundle.getBundle("Zoo", french);
        System.out.println(rb.getString("open"));
    }
}
