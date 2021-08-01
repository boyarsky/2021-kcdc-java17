package module3qus;

public class Question1 {

    public record BBQ(String type) {}

    public static void main(String[] args) {
        BBQ bbq = new BBQ("chicken");
     //   System.out.println(bbq.setType("pork"));
      //  System.out.println(bbq.getType());
        System.out.println(bbq.equals(bbq));
    }
}
