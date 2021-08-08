package formatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class FormatDate {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2021, Month.SEPTEMBER, 14);
        LocalTime time = LocalTime.of(13, 23);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MM-dd")));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MMM/dd/yyyy")));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy")));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("h 'o''clock'")));
    }
}
