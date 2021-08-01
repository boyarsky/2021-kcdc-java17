public class Module3 {


    // must be an interface rather than a class because Weekday is a record and cannot subclass
    sealed interface AnyDay permits Weekday, Weekend {}

    non-sealed class Weekend implements AnyDay {

    }

    record Weekday(String dayOfWeek) implements AnyDay {

        Weekday {
            if ("Saturday".equals(dayOfWeek) || "Sunday".equals(dayOfWeek)) {
                throw new IllegalArgumentException("weekends not allowed");
            }
        }

        @Override
        public String dayOfWeek() {
            return "Day: " + dayOfWeek;
        }
    }

    public static void main(String[] args) {
        Weekday weekday = new Weekday("Monday");
        System.out.println(weekday.dayOfWeek());
        System.out.println(weekday.toString());

       // new Weekday("Sunday");
    }

}
