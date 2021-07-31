package patternmatching;

public class ReuseVariable {
    public static void main(String[] args) {

        Number num = 5;


        if (num instanceof Integer numAsInt) {
            numAsInt = 6;
            System.out.println(numAsInt);
        }

    }
}
