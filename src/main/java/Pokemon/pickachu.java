package Pokemon;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class pickachu extends pikachuActualData {

    @Test(priority = 0)
    public void PikachuStatic() {
        System.out.println("-----------------------");
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/pikachu";
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

        Boolean isStaticUrl = ActualStaitcUrl == ExpctStaitcUrl;
        Boolean isStaticSlot = ActualStaitcSlot == ExpectedStaitcSlot;
            Boolean isStaticiHidden = StaticHidden == ExpectedinHidden;
            Assert.assertTrue(isStaticUrl || isStaticSlot ||isStaticiHidden," isStaticUrl: "+isStaticUrl+" isStaticSlot: " +isStaticSlot + " isStaticisHidden: "+ isStaticiHidden);
            }


    @Test(priority = 1)
    public void PikachuLightning_rod() {
        System.out.println("-----------------------");
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/pikachu";
        JsonPath js = Utilities.rawtoJSON(Payloads.pikachuPayload());
        System.out.println("Pikachu move:  "+ lightning_rod);
        Assert.assertEquals(lightning_rod,"lightning-rod");
        // Validate the response
        System.out.println("If no issues in assertion then: Pikachu Move :lightning-rod is True");
        // validate url for static
        System.out.println("Actual lightning-rod url:  " + Actuallightning_rodUrl);
        if (Actuallightning_rodUrl != Expctlightning_rodUrl){
            System.out.println("Test failed #1; URLs do not match");
        }
        else if(Actuallightning_rodUrl== Expctlightning_rodUrl){
            System.out.println("Test passed URL match");
        }
        else {
            System.out.println("Error in code");
        }
        // validate is hidden or not booleon
        System.out.println("this is actual ishidden value for static: "+ActualLightning_rodHidden);
        System.out.println("this is expected ishidden value from chart: "+Expectedlightning_rodisHidden);
        // Validate the response
        if (ActualLightning_rodHidden == Expectedlightning_rodisHidden){
            System.out.println("Test passed for isHidden value");
        }
        else {
            System.out.println("Test #2 failed IsHidden value does not match");
        }
        System.out.println("This is expected slot of move int value: "+Expectedlightning_rodSlot);
        System.out.println("This is Actual slot of move int value: "+Actuallightning_rodSlot);
        // Validate the response
        if (Actuallightning_rodSlot != Expectedlightning_rodSlot){
            System.out.println("Test #3: failed, slot value mismatch: " + Actuallightning_rodSlot
                    + " does not equal:" + Expectedlightning_rodSlot);
        }
        else {
            System.out.println("Test passed for slot verification");
        }
    }


}
