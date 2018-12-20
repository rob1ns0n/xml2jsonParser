package hello.transform;


import org.json.JSONObject;
import org.json.XML;

import java.io.InputStream;

public class Xml2json {

    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    public static String TEST_XML_STRING =
            "<?xml version=\"1.0\" ?><test attrib=\"moretest\">Turn this to JSON</test>";

    static public String transform(InputStream inputStream) {
        String jsonPrettyPrintString = "";
        try {
            String xml = Util.convert(inputStream);
            JSONObject xmlJSONObj = XML.toJSONObject(xml);
            jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);

        } catch (Exception e) {
            // TODO: manage this exception
        }
        return (jsonPrettyPrintString);

    }

}
