package records;

import java.util.List;

public record Book (String title, int numPages, List<String> chapters) {

    public Book {
        chapters = List.copyOf(chapters);
    }

    @Override
    public String title() {
        return '"' + title + '"';
    }

    public boolean isLong() {
        return numPages > 300;
    }
}
