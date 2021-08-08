package localization;

import java.util.Locale;

public class CreatingLocale {

    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        Locale constant = Locale.JAPANESE;
        Locale lang = new Locale("en");
        Locale country = new Locale("en", "US");
        Locale invalid = new Locale("US");
    }
}
