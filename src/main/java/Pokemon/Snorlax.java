package Pokemon;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static io.restassured.RestAssured.given;

public class Snorlax {
    @Test
    public void GetSnorlaxAbilities() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/snorlax";
        String response = given().get("https://pokeapi.co/api/v2/pokemon/snorlax").
                then().log().all().assertThat().statusCode(200)
                .extract().response().asString();
        JsonPath js = ReuseMethods.rawtoJSON(Payloads.SNorlaxAbilties());
        String Thickfat= js.get("abilities.ability[1].name");
        System.out.println("Snorlax move:  "+ Thickfat);

        // Validate the response
        Assert.assertEquals(Thickfat,"thick-fat");
        System.out.println("If no issues in assertion then: Snorlax Move :Thick-fat is True");
//        for (String ability: Abilities) {
//        }
//
//        }
//        String Slot = js.get("abilities[1].slot");
//        System.out.println(Slot);
    }
}
