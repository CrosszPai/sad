package creational;

import java.io.PrintStream;
import java.util.Collection;

public class JSONPrinter implements BookPrintable {

    @Override
    public void print(Collection<Book> bookList, PrintStream out) {
        bookList.forEach(book -> out.println(JSONBookMetadataFormatter.getMetadataJSON(book)));
    }
}
