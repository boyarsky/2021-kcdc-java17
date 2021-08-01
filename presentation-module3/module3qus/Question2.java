package module3qus;

public class Question2 {

    public record BBQ(String type) {
        public BBQ {
            type = type.toUpperCase();
        }
    }

    public static void main(String[] args) {
        BBQ bbq = new BBQ("chicken");
        System.out.println(bbq.type());
    }
}
