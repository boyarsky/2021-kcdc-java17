package formatting;

public class OldVsNewFormat {

    public static void main(String[] args) {
        String firstName = "Jeanne";
        String lastName = "Boyarsky";
        String str = String.format("Hi %s %s!", firstName, lastName);
        System.out.println(str);
        System.out.println("Hi %s %s!".formatted(firstName, lastName));

    }
}
