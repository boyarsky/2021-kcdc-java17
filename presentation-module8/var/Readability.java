package var;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Readability {

    private static final String CSV_DATA = "data.csv";

    public static void main(String[] args) throws Exception {
        original(new SeleniumStub());
        withVar(new SeleniumStub());

        var csvPath = createAndGetFile(CSV_DATA);
        try (var csvWriter = Files.newBufferedWriter(csvPath);
             var csvPrinter = new CSVPrinter(csvWriter, CSVFormat.DEFAULT)) {
        }

        Map<Integer, String> productMap1 = new HashMap<Integer, String>();
        Map<Integer, String> productMap2 = new HashMap<>();
        var productMap3 = new HashMap<Integer, String>();

        var name = "Jeanne";
        var other = name + 2;

        var list = List.of(1, 2, 3);
        for (var num : list) {}



    }

    private static Path createAndGetFile(String csvData) {
        return Path.of(csvData);
    }

    private static void withVar(SeleniumStub thead) {
        var headers = thead.findElements(By.tagName("th"));
        var headerRow = new VolunteerDashboardRow(headers);
    }

    private static void original(SeleniumStub thead) {
        List<WebElement> headers = thead.findElements(By.tagName("th"));
        VolunteerDashboardRow headerRow = new VolunteerDashboardRow(headers);
    }

    private static class WebElement {

    }

    private static class CSVPrinter implements AutoCloseable {

        public CSVPrinter(BufferedWriter csvWriter, Object aDefault) {
        }

        @Override
        public void close() throws Exception {

        }
    }

    private static class CSVFormat {

        public static final Object DEFAULT = "";
    }

    private static class VolunteerDashboardRow {

        public VolunteerDashboardRow(List<WebElement> headers) {
        }
    }

    private static class By {

        public static Object tagName(String th) {
            return null;
        }
    }

    private static class SeleniumStub {

        public List<WebElement> findElements(Object th) {
            return Collections.emptyList();
        }
    }

}
