package module5qus;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Question4 {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2021, Month.SEPTEMBER, 14, 6, 15, 44);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("M HH");
        System.out.println(dateTime.format(fmt));

    }
}
