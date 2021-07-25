package textblocks;

public class UsingTextBlocks {

    public static void main(String[] args) {
        String old = "kcdc,Kansas City,\"session,workshop\"\n"
                + "meetup,Various,lecture\n";

        String textBlock = """
                kcdc,Kansas City,"session,workshop"
                meetup,Various,lecture
                """;

        System.out.println(old);
        System.out.println(textBlock);
        System.out.println(old == textBlock);
    }
}
