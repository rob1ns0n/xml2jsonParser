package hello.transform;

import org.json.JSONObject;
import org.json.XML;

import java.io.InputStream;


public class Json2xml {


    static public String transform(InputStream inputStream) {
        String xml = "";
        try {
            String json = Util.convert(inputStream);

            /*json = "{\"Customer\": {" +
                    "\"address\": {" +
                    "\"street\": \"NANTERRE CT\"," +
                    "\"postcode\": 77471" +
                    "}," +
                    "\"name\": \"Mary\"," +
                    "\"age\": 37" +
                    "}}";*/

            JSONObject jsonObj = new JSONObject(json);
            xml = XML.toString(jsonObj);

            System.out.println(xml);

        } catch (Exception e) {
            // TODO: manage this exception
        }
        return (xml);

    }


}
