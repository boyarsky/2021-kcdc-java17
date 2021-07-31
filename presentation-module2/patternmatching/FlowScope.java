package patternmatching;

public class FlowScope {
    public static void main(String[] args) {

        separate();
        outOfScope();
        terminatingEarly();
        combined();
    }

    private static void separate() {
        Number num = 6.0;

        if (num instanceof Double n)
            System.out.println(n.intValue());

        if (num instanceof Integer n)
            System.out.println(n);

    }

    private static void outOfScope() {
        Number num = 6.0;

        if (num instanceof Double n)
            System.out.println(n.intValue());

      //  System.out.println(n.intValue());

    }

    private static void terminatingEarly() {
        Number num = 6.0;

        if (!(num instanceof Double n)) {
            return;
        }
        System.out.println(n.intValue());
    }

    private static void combined() {
        Number num = 6.0;

        if (!(num instanceof Double n)) {
            return;
        }
        System.out.println(n.intValue());

      //  if (num instanceof Double n)
        //    System.out.println(n.intValue());
    }

}
