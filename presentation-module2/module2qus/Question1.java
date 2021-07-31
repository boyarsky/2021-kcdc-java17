package module2qus;

public class Question1 {

    public static void main(String[] args) {

        char ch = 'b';

        int count = 0;
        switch (ch) {
            case 'a' -> count++;
            case 'b' -> count+=2;
            case 'c' -> count+=3;
         }

         System.out.println(count);


    }
}
