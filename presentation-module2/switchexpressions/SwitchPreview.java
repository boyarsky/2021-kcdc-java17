package switchexpressions;

public class SwitchPreview {
    // commented out so don't need preview enabled to compile
/*
    public static void main(String[] args) {

        printOddOrEven(1);
        printOddOrEven(2);
        printOddOrEven("string");

        System.out.println(toInt(1));
        System.out.println(toInt(2.0));
        System.out.println(toInt("3"));
        System.out.println(toInt(5L));

    }

    static void printOddOrEven(Object obj) {
        switch (obj) {
            case Integer i && i % 2 == 1 -> System.out.println("odd");
            case Integer i && i % 2 == 0 -> System.out.println("even");
            default -> System.out.println("not an int");
        };
    }

    static int toInt(Object obj) {
        return switch (obj) {
            case Integer i -> i;
            case Double d -> d.intValue();
            case String s -> Integer.parseInt(s);
            default -> throw new IllegalArgumentException("unknown type");
        };
    }*/
}
