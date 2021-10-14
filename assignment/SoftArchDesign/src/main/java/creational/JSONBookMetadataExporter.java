package creational;

import java.io.IOException;

public class JSONBookMetadataExporter extends BookMetadataExporter {

    @Override
    protected BookMetadataFormatter getFormatter() throws IOException {
        return new JSONBookMetadataFormatter();
    }
}
