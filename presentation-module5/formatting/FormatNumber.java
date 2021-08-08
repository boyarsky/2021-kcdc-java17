package formatting;

public class FormatNumber {

    public static void main(String[] args) {

        System.out.println("%,d".formatted(1234));
        System.out.println("%+d".formatted(1234));
        System.out.println("% d".formatted(1234));
        System.out.println("%,(d".formatted(-1234));
        System.out.println("%,f".formatted(1.23456789));

    }
}
