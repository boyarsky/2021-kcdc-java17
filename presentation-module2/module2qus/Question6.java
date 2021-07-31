package module2qus;

public class Question6 {

    public static void main(String[] args) {

        Object robot = "694";

        if (robot instanceof String s) {
            System.out.print("x");
        }
        if (robot instanceof Integer s) {
            System.out.print("y");
        }
        System.out.println(robot);

    }
}
