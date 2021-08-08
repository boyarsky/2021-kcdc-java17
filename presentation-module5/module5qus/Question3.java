package module5qus;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;

public class Question3 {

    public static void main(String[] args) {
        NumberFormat fmt = CompactNumberFormat.getCompactNumberInstance();
       // CompactNumberFormat fmt = new CompactNumberFormat();
        System.out.println(fmt.format(2000) + " %.2f".formatted(3.14));

    }
}
