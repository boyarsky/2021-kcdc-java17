package switchexpressions;

import java.util.Random;

public class Yield {

    public static void main(String[] args) {
        yielding();
    }

    private static void yielding() {
        String store = "Legoland2";

        String output = switch(store) {
            case "Hallmark" -> "KC";
            case "Legoland" -> {
                int random = new Random().nextInt();
                String city = random % 2 == 0 ? "KC" : "Carlsbad";
                yield city;
            }
            default -> throw new IllegalArgumentException("Unknown");
        };
        System.out.println(output);
    }
}
