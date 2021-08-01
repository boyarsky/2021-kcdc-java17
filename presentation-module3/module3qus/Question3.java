package module3qus;

public class Question3 {

    record BBQ(String type) {
        BBQ {
            type = type.toUpperCase();
        }
    }

    public static void main(String[] args) {
        BBQ bbq = new BBQ("chicken");
        System.out.println(bbq.type());
    }
}
