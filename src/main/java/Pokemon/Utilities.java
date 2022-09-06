package Pokemon;
import io.restassured.path.json.JsonPath;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Utilities {

    public static JsonPath rawtoJSON(String response) {
        JsonPath js1 = new JsonPath(response);

        return js1;

    }


}
