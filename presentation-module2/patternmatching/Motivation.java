package patternmatching;

public class Motivation {
    public static void main(String[] args) {

        Number num = 5.0;

        if (num instanceof Integer) {
            Integer numAsInt = (Integer) num;
            System.out.println(numAsInt);
        }
        if (num instanceof Double) {
            Double numAsDouble = (Double) num;
            System.out.println(numAsDouble.intValue());
        }

        if (num instanceof Integer numAsInt) {
            System.out.println(numAsInt);
        }
        if (num instanceof Double numAsDouble) {
            System.out.println(numAsDouble.intValue());
        }
    }
}
