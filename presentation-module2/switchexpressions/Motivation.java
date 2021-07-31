package switchexpressions;

public class Motivation {

    public static void main(String[] args) {
        original();
        System.out.println();
        switchExpression();
        System.out.println();
        refactored();
    }

    private static void original() {
        String store = "Hallmark";

        switch(store) {
            case "Hallmark", "H&R" : System.out.println("KC");
            case "Crayola" : System.out.println("PA");
            default: System.out.println("anywhere");
        }
    }

    private static void switchExpression() {
        String store = "Hallmark";

        switch(store) {
            case "Hallmark" -> System.out.println("KC");
            case "Crayola" -> System.out.println("PA");
            default -> System.out.println("anywhere");
        }
    }

    private static void refactored() {
        String store = "Hallmark";

        String output = switch(store) {
            case "Hallmark" -> "KC";
            case "Crayola" -> "PA";
            default -> "anywhere";
        };
        System.out.println(output);
    }
}
