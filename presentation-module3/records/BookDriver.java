package records;

import java.util.ArrayList;
import java.util.List;

public class BookDriver {

    public static void main(String[] args) {
        List<String> chapters = new ArrayList<>();
        chapters.add("1");

        Book book = new Book("Breaking and entering", 289, chapters);

        System.out.println(book.title());
        System.out.println(book.toString());

        chapters.add("2");
        book.chapters().add("3");
        System.out.println(book.chapters());
    }
}
