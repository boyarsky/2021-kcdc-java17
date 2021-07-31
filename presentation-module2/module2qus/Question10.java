package module2qus;

public class Question10 {

    static class Sword {
        int length = 8;

        public void printLength(Object x) {
            if (x instanceof Integer length) {
                length = 2;
            }
            System.out.println(length);
        }

    }

    public static void main(String[] args) {
        new Sword().printLength(3);
    }

}
