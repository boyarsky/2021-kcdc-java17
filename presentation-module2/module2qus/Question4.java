package module2qus;

public class Question4 {

    public static void main(String[] args) {

        char ch = 'b';

        Object value = switch (ch) {
            case 'a' -> 1;
            case 'b' -> 2L;
            case 'c' -> 3.0;
            default -> 4;
        };

        System.out.println(value);

    }
}
