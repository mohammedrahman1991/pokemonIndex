package Pokemon;

import io.restassured.path.json.JsonPath;

public class CharizardActualData extends Utilities{
    JsonPath js = Utilities.rawtoJSON(Payloads.charizardPayload());
    String blaze= js.get("abilities.ability[0].name");
    String ExpctblazeUrl = "https://pokeapi.co/api/v2/ability/66/";
    String ActualblazeUrl = js.get("abilities.ability[0].url");
    boolean blazeHidden = js.get("abilities.is_hidden[0]");
    boolean ExpectedblazeinHidden = false;
    Integer ActualblazeSlot = js.getInt("abilities.slot[0]");
    Integer ExpectedblazeSlot = 1;

    //2nd move

    String solar_power = js.get("abilities.ability[1].name");
    String Expctsolar_powerUrl = "https://pokeapi.co/api/v2/ability/94/";
    String Actualsolar_powerUrl = js.get("abilities.ability[1].url");
    boolean Actualsolar_powerHidden = js.get("abilities.is_hidden[1]");
    boolean Expectedsolar_powerisHidden = true;
    Integer Actualsolar_powerSlot = js.getInt("abilities.slot[1]");
    Integer Expectedsolar_powerSlot = 3;

}


