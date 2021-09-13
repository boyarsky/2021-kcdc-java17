import java.io.IOException;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ResourceBundle;

public class Module5 {

    public static void main(String... args) throws IOException {
        Locale.setDefault(Locale.JAPANESE);
        ResourceBundle rb = ResourceBundle.getBundle("kcdc", Locale.ENGLISH);

        String location = rb.getString("location");
        String daysFormat = rb.getString("numDays");

        String result = "%s days in %s".formatted(MessageFormat.format(daysFormat, 3), location);
        System.out.println(result);

        LocalDate date = LocalDate.now();
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MMMM dd yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date.format(fmt1));
        System.out.println(date.format(fmt2));
        System.out.println(date.format(fmt3));

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("yyyy-mm-dd");
       // System.out.println(date.format(fmt4));

        for (int i=0; i<= 100; i++) {
            System.out.println("%3d".formatted(i));
        }

        int num = 5_000_000;
        System.out.println("%d".formatted(num));
        System.out.println("%010d".formatted(num));
        System.out.println("%+d".formatted(num));
        System.out.println(NumberFormat.getCompactNumberInstance().format(num));
        System.out.println(NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG).format(num));

    }
}
