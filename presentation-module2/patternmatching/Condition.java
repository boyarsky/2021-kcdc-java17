package patternmatching;

public class Condition {
    public static void main(String[] args) {

        Number num = 6.0;

        if (num instanceof Double d1 && d1.intValue() % 2 == 0) {
            System.out.println(d1.intValue());
        }

       // if (num instanceof Double d2 || d2.intValue() % 2 == 0) {
         //   System.out.println(d2.intValue());
      //  }
    }
}
