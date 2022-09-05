package Pokemon;
import io.restassured.path.json.JsonPath;

public class ReuseMethods {

    public static JsonPath rawtoJSON(String response) {
        JsonPath js1 = new JsonPath(response);

        return js1;



    }


}
