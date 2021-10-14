package creational;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class JSONBookMetadataFormatter implements BookMetadataFormatter {

    private JSONArray rootValues;
    private JSONObject rootObject;

    public JSONBookMetadataFormatter() throws IOException {
        reset();
    }

    @Override
    public BookMetadataFormatter reset() {
        // Please implement this method. You may create additional methods as you see fit.
        rootValues = new JSONArray();
        rootObject = new JSONObject();
        rootObject.put("Books", rootValues);
        return null;
    }

    @Override
    public BookMetadataFormatter append(Book b) {
        // Please implement this method. You may create additional methods as you see fit.
        rootValues.add(JSONBookMetadataFormatter.getMetadataJSON(b));
        return this;
    }

    @Override
    public String getMetadataString() {
        // Please implement this method. You may create additional methods as you see fit.
        return rootObject.toString();
    }

    // just utility function for avoid duplicate code
    public static JSONObject getMetadataJSON(Book b){
        final JSONObject j = new JSONObject();
        final List<String> l = Arrays.asList(b.getAuthors());
        final JSONArray a = new JSONArray();
        l.forEach(s -> {a.add(s);});
        j.put(Book.Metadata.ISBN.value,b.getISBN());
        j.put(Book.Metadata.AUTHORS.value,a);
        j.put(Book.Metadata.TITLE.value,b.getTitle());
        j.put(Book.Metadata.PUBLISHER.value,b.getPublisher());
        return j;
    }
}
