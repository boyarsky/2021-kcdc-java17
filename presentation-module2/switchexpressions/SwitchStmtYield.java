package switchexpressions;

import java.util.Random;

public class SwitchStmtYield {

    public static void main(String[] args) {
        yielding();
    }

    private static void yielding() {
        enum Position { TOP, BOTTOM };
        Position pos = Position.TOP;

        int stmt = switch(pos) {
            case TOP: yield 1;
            case BOTTOM: yield 0;
        };

        int expr = switch(pos) {
            case TOP -> 1;
            case BOTTOM -> 0;
        };


        System.out.println(stmt);
        System.out.println(expr);
    }
}
