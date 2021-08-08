package localization;

import java.text.NumberFormat;
import java.util.Locale;

public class Formatting {

    public static void main(String[] args) {
        NumberFormat shortFormat = NumberFormat.getCompactNumberInstance(
                Locale.CANADA_FRENCH, NumberFormat.Style.SHORT);
        NumberFormat longFormat = NumberFormat.getCompactNumberInstance(
                Locale.CANADA_FRENCH, NumberFormat.Style.LONG);
        System.out.println(shortFormat.format(3_000));
        System.out.println(longFormat.format(3_000));
    }
}
