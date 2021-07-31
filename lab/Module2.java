import java.util.Optional;

public class Module2 {

    static enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

    public static void main(String[] args) {
        System.out.println(traditional(DayOfWeek.FRIDAY));
        System.out.println(traditional(DayOfWeek.SATURDAY));
        System.out.println();
        System.out.println(switchExpressions(DayOfWeek.FRIDAY));
        System.out.println(switchExpressions(DayOfWeek.SATURDAY));
        System.out.println();
        System.out.println(switchExpressionsWithYield(DayOfWeek.FRIDAY));
        System.out.println(switchExpressionsWithYield(DayOfWeek.SATURDAY));
        System.out.println();
        System.out.println(switchExpressionsWithYield(DayOfWeek.FRIDAY));
        System.out.println(switchExpressionsWithYield(DayOfWeek.SATURDAY));
        System.out.println();
        System.out.println(patternMatching(DayOfWeek.FRIDAY));
        System.out.println(patternMatching("friday"));
        System.out.println();
        System.out.println(patternMatchingInverted(DayOfWeek.FRIDAY));
        System.out.println(patternMatchingInverted("friday"));
    }

    static int traditional(DayOfWeek dayOfWeek) {
        int result;
        switch (dayOfWeek) {
            case SATURDAY:
            case SUNDAY:
                result = 1;
                break;
            default:
                result = dayOfWeek.toString().length();
        }
        return result;

    }

    static int switchExpressions(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case SATURDAY, SUNDAY -> 1;
            default -> dayOfWeek.toString().length();
        };
    }

    static int traditionalWithYield(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case SATURDAY:
            case SUNDAY:
                yield 1;
            default:
                yield dayOfWeek.toString().length();
        };
    }

    static int switchExpressionsWithYield(DayOfWeek dayOfWeek) {
        return switch (dayOfWeek) {
            case SATURDAY, SUNDAY -> { yield 1; }
            default -> { yield dayOfWeek.toString().length(); }
        };
    }

    static int patternMatching(Object obj) {
        if (obj instanceof DayOfWeek d) {
            return switchExpressions(d);
        }
        return -1;
    }

    static int patternMatchingInverted(Object obj) {
        if (! (obj instanceof DayOfWeek d)) {
            return -1;
        }
        return switchExpressions(d);
    }
}
