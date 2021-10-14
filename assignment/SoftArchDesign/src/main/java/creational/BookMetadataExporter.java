package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.PrintStream;

public abstract class BookMetadataExporter extends BookCollection {

    public void export(PrintStream stream) throws IOException, ParserConfigurationException {
        // Please implement this method. You may create additional methods as you see fit.
        BookMetadataFormatter formatter = getFormatter();
        this.books.forEach(book -> formatter.append(book));
        final String formatted = formatter.getMetadataString();
        stream.println(formatted);
    }

    // give subclass responsibility to decide which formatter they should use
    abstract protected BookMetadataFormatter getFormatter() throws IOException, ParserConfigurationException;

}
