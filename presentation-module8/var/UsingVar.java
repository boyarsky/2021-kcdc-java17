package var;

import java.util.List;

public class UsingVar {

    public static void main(String[] args) {
        basics();
        sameType();
        mutable();
    }

    private static void basics() {
        String name1 = "Jeanne";
        var name2 = "Jeanne";

        List list1 = List.of(1, 2, 3);
        var list2 = List.of(1, 2, 3);
    }

    private static void sameType() {
        String name = "Jeanne";
        //  name = 1;  // DOES NOT COMPILE
    }

    private static void mutable() {
        String name = "Jeanne";
        name = "Boyarsky";
    }
}
