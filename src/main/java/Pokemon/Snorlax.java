package Pokemon;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Snorlax extends SnorlaxActualData{

//    String response = given().get("https://pokeapi.co/api/v2/pokemon/snorlax").
//            then().log().all().assertThat().statusCode(200)
//            .extract().response().asString();
    @Test(priority = 1)
    public void GetSnorlaxThick_Fat() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/snorlax";
        JsonPath js = Utilities.rawtoJSON(Payloads.SNorlaxAbilties());
        System.out.println("Snorlax move:  "+ Thickfat);
        Assert.assertEquals(Thickfat,"thick-fat");
        // Validate the response
        System.out.println("If no issues in assertion then: Snorlax Move :Thick-fat is True");
        // validate url for thick-fat
        System.out.println("Actual Thick-fat url:  " + Actualthick_fatURL);
        Assert.assertEquals(Actualthick_fatURL,Expectthick_fatURL);
        System.out.println("Actual thick-fat url = expected Url - Test Passed");
        // validate is hidden or not booleon
        System.out.println(Snorlaxhidden);
        // Validate the response
        Assert.assertEquals("false", Snorlaxhidden);
        System.out.println("snorlax thick-fat ishidden = " +Snorlaxhidden +
                " Assertion matches expected thus test has passed");
        System.out.println(abilitySlot);
        Integer Actualthickfat_slot = 2;
        // Validate the response
        Assert.assertEquals(abilitySlot,Actualthickfat_slot);
        System.out.println("No issues= assertion passed thick-fat slot num is True:  "+ Actualthickfat_slot);

    }
    @Test(priority = 0)
    public void GetSnorlaxGluttony() {
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/snorlax";
        JsonPath js = Utilities.rawtoJSON(Payloads.SNorlaxAbilties());
        System.out.println("Snorlax move:  "+ Immunity);
        Assert.assertEquals(Immunity,"immunity");
        // Validate the response
        System.out.println("If no issues in assertion then: Snorlax Move :immunity is True");
        // validate url for immunity
        System.out.println("Actual immunity url:  " + ActualImmunityUrl);
        Assert.assertEquals(ActualImmunityUrl,ExpctImmunityUrl);
        System.out.println("Actual immunity url = expected Url - Test Passed");
        // validate is hidden or not booleon
        System.out.println(ImmunityHidden);
        // Validate the response
        Assert.assertEquals("false", ImmunityHidden);
        System.out.println("snorlax immunity ishidden = " +ImmunityHidden +
                " Assertion matches expected thus test has passed");
        System.out.println(abilitySlot0);
        Integer ActualImmunitySlot = 1;
        // Validate the response
            Assert.assertEquals(abilitySlot0,  ActualImmunitySlot);
        System.out.println("No issues= assertion passed immunity slot num is True:  "+ abilitySlot0);
    }
}
