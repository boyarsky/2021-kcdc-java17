package module3qus;

public class Question5 {

    public record BBQ(String type) implements Comparable<BBQ> {

        public int compareTo(BBQ bbq) {
            return type.compareTo(bbq.type);
        }
    }

    public static void main(String[] args) {
        BBQ beef = new BBQ("beef");
        BBQ pork = new BBQ("pork");
        System.out.println(pork.compareTo(beef));
    }
}
