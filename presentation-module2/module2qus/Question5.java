package module2qus;

public class Question5 {

    public static void main(String[] args) {

        char ch = 'b';

        switch (ch) {
            case 'a' -> System.out.println(1);
            case 'b' -> System.out.println(2);
            case 'c' -> { System.out.println(3); }
        };

    }
}
