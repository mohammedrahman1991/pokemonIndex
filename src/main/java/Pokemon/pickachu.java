package Pokemon;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pickachu extends pikachuActualData {

    @Test(priority = 0)
    public void PikachuStatic() {
        System.out.println("-----------------------");
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/snorlax";
        JsonPath js = Utilities.rawtoJSON(Payloads.pikachuPayload());
        System.out.println("Pikachu move:  "+ Staticc);
        Assert.assertEquals(Staticc,"static");
        // Validate the response
        System.out.println("If no issues in assertion then: Pikachu Move :Static is True");
        // validate url for static
        System.out.println("Actual static url:  " + ActualStaitcUrl);
        if (ActualStaitcUrl != ExpctStaitcUrl){
            System.out.println("Test failed #1; URLs do not match");
        }
        else{
            System.out.println("Test passed URL match");
        }
        // validate is hidden or not booleon
        System.out.println("this is actual ishidden value for static: "+StaticHidden);
        System.out.println("this is expected ishidden value from chart: "+ExpectedinHidden);
        // Validate the response
        if (StaticHidden == ExpectedinHidden){
            System.out.println("Test passed for isHidden value");
        }
        else {
            System.out.println("Test #2 failed IsHidden value does not match");
        }
        System.out.println("This is expected slot of move int value: "+ExpectedStaitcSlot);
        System.out.println("This is Actual slot of move int value: "+ActualStaitcSlot);
        // Validate the response
        if (ActualStaitcSlot != ExpectedStaitcSlot) {
            System.out.println("Test #3: failed, slot value mismatch: " + ActualStaitcSlot);
        }
        else {
            System.out.println("Test passed for slot verification");
        }
    }
}
