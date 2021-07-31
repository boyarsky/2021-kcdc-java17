package module2qus;

import java.util.Objects;

public class Question8 {

    static class Sword {
        int length;

        public boolean equals(Object o) {
            if (o instanceof Sword sword) {
                return length == sword.length;
            }
            return false;
        }

        // assume hashCode properly implemented

    }

    public static void main(String[] args) {
        Sword s1 = new Sword();
        Sword s2 = new Sword();
        s2.length = 3;

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s2));
        System.out.println(s1.equals(null));
    }
}
