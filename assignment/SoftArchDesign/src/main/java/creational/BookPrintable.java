package creational;

import java.io.PrintStream;
import java.util.Collection;

public interface BookPrintable {
    void print(Collection<Book> bookList, PrintStream printStream);
}
