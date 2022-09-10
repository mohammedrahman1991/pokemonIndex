package Pokemon;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Snorlax extends SnorlaxActualData{

    private Object Boolean;

    //    String response = given().get("https://pokeapi.co/api/v2/pokemon/snorlax").
//            then().log().all().assertThat().statusCode(200)
//            .extract().response().asString();
    @Test(priority = 1)
    public void GetSnorlaxThick_Fat() {
        System.out.println("-----------------------");
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/snorlax";
        JsonPath js = Utilities.rawtoJSON(Payloads.SNorlaxAbilties());
        System.out.println("Snorlax move:  "+ Thickfat);
        Assert.assertEquals(Thickfat,"thick-fat");
        // Validate the response
        System.out.println("If no issues in assertion then: Snorlax Move :Thick-fat is True");
        // validate url for thick-fat
        System.out.println("Actual Thick-fat url:  " + Actualthick_fatURL);
        Assert.assertEquals(Actualthick_fatURL,Expectthick_fatURL);
        System.out.println("Actual thick-fat url = "+Expectthick_fatURL+ " #1: Test Passed");
        // validate is hidden or not booleon
        System.out.println("Actual THICKFAT ISHIDDEN value: "+ActualTHIC_FATisHidden);
        // Validate the response
        Assert.assertEquals(ActualTHIC_FATisHidden, ExpectedisThic_fatsHidden);
        System.out.println(" #2: Test passed: "+ActualTHIC_FATisHidden+" == "+ ExpectedisThic_fatsHidden);
        System.out.println("Expected slot value: "+ExpedabilitySlot);

        // Validate the response
        Assert.assertEquals(ExpedabilitySlot,Actualthickfat_slot);
        System.out.println("#3: Test passed No" +
                " issues= assertion passed thick-fat slot num is True:  "+ Actualthickfat_slot);

        Boolean IsThic_fatURL = Actualthick_fatURL.equals(Expectthick_fatURL);
        Boolean isThic_fatlot = Actualthickfat_slot.equals(ExpedabilitySlot);
        Boolean isThic_fatsHidden = ActualTHIC_FATisHidden  == ExpectedisThic_fatsHidden;
        Assert.assertTrue(IsThic_fatURL  &&  isThic_fatlot && isThic_fatsHidden," IsThic_fatURL: "+IsThic_fatURL+"" +
                " isThic_fatlot: " +isThic_fatlot+ " isThic_fatsHidden: "+ isThic_fatsHidden );
    }
    @Test(priority = 0)
    public void GetSnorlaxImmunity() {
        System.out.println("-----------------------");
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
        System.out.println("Expected isHidden Immunity value: "+ExpectedImmunityHidden);
        // Validate the response
        Assert.assertEquals(ActualImmunityHidden, ExpectedImmunityHidden);
        System.out.println("snorlax immunity ishidden = " +ActualImmunityHidden +
                " Assertion matches expected thus test has passed");
        System.out.println("Actual immuinty move slot num: "+ActualImmunitySlot);
        // Validate the response
        System.out.println(" expected immunity slot num: "+ ExpectedImmunitySlot);
        if (ExpectedImmunitySlot.equals(ActualImmunitySlot)){
            System.out.println("Slot does  match Test passed");
        }
        else{
            System.out.println("Test failed slots dont match");
        }
        Boolean isImmunityUrl= ActualImmunityUrl.equals(ExpctImmunityUrl);
        Boolean isLrImmunitySlot = ActualImmunitySlot.equals(ExpectedImmunitySlot);
        Boolean isImmunityisHidden = ActualImmunityHidden == ExpectedImmunityHidden;
        Assert.assertTrue(isImmunityUrl && isLrImmunitySlot  && isImmunityisHidden," isImmunityUrl "+ isImmunityUrl +" isLrImmunitySlot  " +isLrImmunitySlot  + " isImmunityisHidden: "+ isImmunityisHidden);
//        Assert.assertEquals(ActualImmunitySlot,ExpectedImmunitySlot);
    }
    // test for snorlax glutony
    @Test(priority = 2)
    public void GetSnorlaxGluttony() {
        System.out.println("-----------------------");
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/snorlax";
        JsonPath js = Utilities.rawtoJSON(Payloads.SNorlaxAbilties());
        System.out.println("Snorlax move:  "+ Gluttony);
        Assert.assertEquals(Gluttony,"gluttony");
        // Validate the response
        System.out.println("If no issues in assertion then: Snorlax Move :gluttony is True");
        // validate url for immunity
//        try {
//            Assert.assertEquals(Actual_GluttonyURL, Expect_GluttonyURL);
//        } catch (AssertionError e) {
//            System.out.println("Found assertion error in URL, but continue code " +
//                    "so we can test other aspects of program");
//        }

        if (Actual_GluttonyURL.equals(Expect_GluttonyURL)){
            System.out.println("GluttonyURL is fine");
        }
        else {
            System.out.println("This assertion fails" +
                    " this is report: Actual gluttony url:  " + Actual_GluttonyURL + "but expected: " + Expect_GluttonyURL);
        }
        // validate is hidden or not booleon
//        Boolean = Gluttonyhidden = true;
        System.out.println(" glutony ishidden value: " + ActualGluttonyhidden);
        // Validate the response
        Assert.assertEquals(ActualGluttonyhidden, ExpectedGlutonyIsHidden);
        System.out.println("snorlax Gluttony is hidden = " +ActualGluttonyhidden+
                " Assertion matches expected thus test has passed");
        System.out.println( "This is actual slot number: " + ActualGluttonySlot);
        System.out.println( "This is expected slot number: " + ExpctGluttonySlot );
        // Validate the response
        if (ActualGluttonySlot.equals(ExpctGluttonySlot)){
            System.out.println("GluttonySLOT is fine; test passed");
        }
        else {System.out.println("This assertion / Test fails because " +
                " this is report: Actual gluttony Slot [: " + ActualGluttonySlot + " ] but expected [: " + ExpctGluttonySlot + " ]");
        }
        //Assert all
        Boolean isIGlutonyUrl= Actual_GluttonyURL.equals(Expect_GluttonyURL);
        Boolean isGluttonySlot = ActualGluttonySlot.equals(ExpctGluttonySlot);
        Boolean isGlutonyisHidden = ActualGluttonyhidden == ExpectedGlutonyIsHidden;
        Assert.assertTrue(isIGlutonyUrl && isGluttonySlot  && isGlutonyisHidden," isIGlutonnyUrl "
                + isIGlutonyUrl +" isGluttonySlot  " +isGluttonySlot  + " isImmunityisHidden: "+ isGlutonyisHidden);
    }

}
