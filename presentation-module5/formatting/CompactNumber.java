package formatting;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumber {

    public static void main(String[] args) {

        NumberFormat defaultFormat = NumberFormat.getCompactNumberInstance();
        NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.SHORT);
        NumberFormat longFormat = NumberFormat.getCompactNumberInstance(
                Locale.US, NumberFormat.Style.LONG);

        System.out.println(defaultFormat.format(1_000_000));
        System.out.println(shortFormat.format(1_000_000));
        System.out.println(longFormat.format(1_000_000));

    }
}
