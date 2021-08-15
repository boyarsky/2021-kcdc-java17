package var;

import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Lambdas {

    public static void main(String[] args) {

        Predicate<String> pred1 = p -> true;
        Predicate<String> pred2 = (String p) -> true;
        Predicate<String> pred3 = (var p) -> true;

        BiPredicate<Map<Integer, String>, List<String>> func =
                (@NotNull var map, var list) -> true;


        BiPredicate<Map<Integer, String>, Boolean> bi1 = (var map, var list) -> true;


        //    BiPredicate<Map<Integer, String>, Boolean> bi2 =(var map, list) -> true;
        //  BiPredicate<Map<Integer, String>, Boolean> bi3 =(var map, List list) -> true;


    }

    private static @interface NotNull {
    }
}
