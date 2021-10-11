package creational;

public class JSONBookMetadataExporter extends BookMetadataExporter {
    @Override
    protected BookPrintable getPrinter() {
        return new JSONPrinter();
    }
}
