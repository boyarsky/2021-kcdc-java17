package sealed;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class InstanceOf {

    static sealed class BoolWrapper permits TrueWrapper, FalseWrapper {
    }

    static final class TrueWrapper extends BoolWrapper {
    }

    static final class FalseWrapper extends BoolWrapper {
    }

    public static void main(String[] args) {
        Map<?, ?> map = new HashMap<>();
        String string = "";
        BoolWrapper trueWrapper = new TrueWrapper();

        System.out.println(map instanceof List);
      //  System.out.println("" instanceof List);
      //  System.out.println(trueWrapper instanceof List);
    }
}
