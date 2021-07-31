package module2qus;

public class Question2 {

    public static void main(String[] args) {

        char ch = 'b';

        int value = switch (ch) {
            case 'a' -> 1;
            case 'b' -> 2;
            case 'c' -> 3;
            default -> 4;
         };

         System.out.println(value);


    }
}
