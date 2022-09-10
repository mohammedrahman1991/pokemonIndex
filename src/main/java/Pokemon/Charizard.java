package Pokemon;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

public class  Charizard extends CharizardActualData{

    @Test(priority = 0)
    public void CharizardBlaze() {
        System.out.println("-----------------------");
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/charizard";
        System.out.println("Charizard move:  "+ blaze);
        Assert.assertEquals(blaze,"blaze");
        // Validate the response
        System.out.println("If no issues in assertion then: Charizard Move :blaze is True");
        // validate url for blaze
        System.out.println("Actual blaze  " + ActualblazeUrl);
        if (ActualblazeUrl != ExpctblazeUrl){
            System.out.println("Test failed #1; URLs do not match");
        }
        else{
            System.out.println("Test passed URL match");
        }
        // validate is hidden or not booleon
        System.out.println("this is actual ishidden value for blaze: "+blazeHidden);
        System.out.println("this is expected ishidden value from chart: "+ExpectedblazeinHidden);
        // Validate the response
        if (blazeHidden == ExpectedblazeinHidden){
            System.out.println("Test passed for isHidden value");
        }
        else {
            System.out.println("Test #2 failed IsHidden value does not match");
        }
        System.out.println("This is expected slot of move int value: "+ExpectedblazeSlot);
        System.out.println("This is Actual slot of move int value: "+ActualblazeSlot);
        // Validate the response
        if (ActualblazeSlot != ExpectedblazeSlot) {
            System.out.println("Test #3: failed, slot value mismatch: " + ActualblazeSlot);
        }
        else {
            System.out.println("Test passed for slot verification");
        }
    }
    @Test(priority = 1)
    public void CharizardSolarPower() {
        System.out.println("-----------------------");
        RestAssured.baseURI = "https://pokeapi.co/api/v2/pokemon/charizard";
        System.out.println("Charizard move:  "+ solar_power);
        Assert.assertEquals(solar_power,"solar-power");
        // Validate the response
        System.out.println("If no issues in assertion then: Charizard Move :"+solar_power+" is True");
        // validate url for solar_power
        System.out.println("Actual solar_power url:  " + Actualsolar_powerUrl);
        System.out.println("Expected solar_power URL: "+Expctsolar_powerUrl);
        Assert.assertEquals(Actualsolar_powerUrl,Expctsolar_powerUrl);
        System.out.println("Test passed #1; URLs do match");
//        if (Actualsolar_powerUrl == Expctsolar_powerUrl){
//            System.out.println("Test failed #1; URLs do not match");
//        }
////        else if(Actualsolar_powerUrl== Expctsolar_powerUrl){
////            System.out.println("Test passed URL match");
////        }
//        else {
//            System.out.println("Error in code");
        // }
        // validate is hidden or not booleon
        System.out.println("this is actual ishidden value for solar_power: "+Actualsolar_powerHidden);
        System.out.println("this is expected ishidden value from chart of solar_power : "+Expectedsolar_powerisHidden);
        // Validate the response
        if (Actualsolar_powerHidden == Expectedsolar_powerisHidden){
            System.out.println("Test passed for isHidden value");
        }
        else {
            System.out.println("Test #2 failed IsHidden value does not match");
        }
        System.out.println("This is expected slot of move int value: "+Expectedsolar_powerSlot);
        System.out.println("This is Actual slot of move int value: "+Actualsolar_powerSlot);
        // Validate the response
        if (Actualsolar_powerSlot != Expectedsolar_powerSlot){
            System.out.println("Test #3: failed, slot value mismatch: " + Actualsolar_powerSlot
                    + " does not equal:" + Expectedsolar_powerSlot);
        }
        else {
            System.out.println("Test passed for slot verification");
        }

        Boolean isSolar_PowerUrl = Actualsolar_powerUrl == Expctsolar_powerUrl;
        Boolean isSoar_PowerSlot = Actualsolar_powerSlot== Expectedsolar_powerSlot;
        Boolean isSolar_PowerHidden = Actualsolar_powerHidden == Expectedsolar_powerisHidden;
        Assert.assertTrue(isSolar_PowerUrl  || isSoar_PowerSlot  ||isSolar_PowerHidden ," isStaticUrl: "+isSolar_PowerUrl+" isStaticSlot: " +isSoar_PowerSlot  + " isStaticisHidden: "+ isSolar_PowerHidden );
    }

}


