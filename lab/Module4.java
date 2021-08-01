import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Module4 {

    static record Page(Set<String> set, long count) {
    }

    public static void main(String... args) throws IOException {
        System.out.println(makeStream("test").count());
        System.out.println(makeStream(null).count());
        System.out.println();
        blastOff();
        System.out.println();
        odds();
        System.out.println();
        beforeSixCharacterWord("a", "wolf", "went", "to", "the", "supermarket");
        System.out.println();
        firstSixCharacterWordAndThreeMore("i", "heard", "supermarket", "sweep", "is", "a", "fun", "game");
        System.out.println();
        System.out.println(getPageOfData('a', "apple", "apple", "strawberry", "chocolate"));
    }

    public static Stream<String> makeStream(String str) {
        return Stream.ofNullable(str);
    }

    public static void blastOff() {
        Stream.iterate(10, i -> i >= 0, i -> i - 1)
                .forEach(System.out::println);
        System.out.println("Blast off!");
    }

    public static void odds() {
        Stream.iterate(1, i -> i + 2)
                .skip(39)
                .limit(1)
                .forEach(System.out::println);
    }

    public static void beforeSixCharacterWord(String... args) throws IOException {
        Path path = Paths.get("sentences.txt");
        Arrays.stream(args)
                .takeWhile(word -> word.length() < 6)
                .forEach(System.out::println);

    }

    public static void firstSixCharacterWordAndThreeMore(String... args) throws IOException {
        Arrays.stream(args)
                .dropWhile(word -> word.length() < 6)
                .limit(4)
                .forEach(System.out::println);

    }

    private static Page getPageOfData(char target, String... args) {
        return Arrays.stream(args)
                .collect(Collectors.groupingBy(s -> s.charAt(0)))
                .get(target)
                .stream()
                .collect(Collectors.teeing(
                        Collectors.toSet(),
                        Collectors.counting(),
                        (s, c) -> new Page(s, c)));
    }

}
