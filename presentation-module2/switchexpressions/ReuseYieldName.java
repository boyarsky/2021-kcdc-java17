package switchexpressions;

public class ReuseYieldName {

    public static void main(String[] args) {
        new ReuseYieldName().confusing();
    }

    private void confusing() {
        this.yield();
    }

    private void yield() {
        String store = "Legoland";

        String output = switch(store) {
            case "Legoland" -> {
                yield "Carlsbad";
            }
            default -> "other";
        };
        System.out.println(output);
    }
}
