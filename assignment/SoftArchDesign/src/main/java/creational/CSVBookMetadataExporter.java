package creational;

import java.io.IOException;

public class CSVBookMetadataExporter extends BookMetadataExporter {

    @Override
    protected BookMetadataFormatter getFormatter() throws IOException {
        return new CSVBookMetadataFormatter();
    }
}
