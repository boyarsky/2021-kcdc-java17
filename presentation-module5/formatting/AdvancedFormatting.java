package formatting;

public class AdvancedFormatting {

    public static void main(String[] args) {

        System.out.println("%3.3f".formatted(1.2345));
        System.out.println("%05.1f".formatted(1.2345));
        System.out.println("%03.1f".formatted(1.2345));
        System.out.println("%1$d %1$d".formatted(6));
        System.out.println("%1$d+%1$d=%2$d".formatted(1,2));
    }
}
