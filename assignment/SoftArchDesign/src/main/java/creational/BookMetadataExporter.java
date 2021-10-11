package creational;

import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) {
        // Please implement this method. You may create additional methods as you see fit.
        BookPrintable printer = getPrinter();
        printer.print(this.books,stream);
    }

    // BookPrintable Product
    abstract protected BookPrintable getPrinter();

}
