package Pokemon;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.BeforeTest;

import static io.restassured.RestAssured.given;


public class Utilities {

    @BeforeTest(enabled = false)
    public void ApiLocation(){
        String response = given().get("https://pokeapi.co/api/v2/pokemon/snorlax").
            then().log().all().assertThat().statusCode(200)
            .extract().response().asString();
    }

    public static JsonPath rawtoJSON(String response) {
        JsonPath js1 = new JsonPath(response);

        return js1;

    }


}
