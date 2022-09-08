package Pokemon;

import io.restassured.path.json.JsonPath;

public class pikachuActualData extends Utilities{
    JsonPath js = Utilities.rawtoJSON(Payloads.pikachuPayload());
    String Staticc = js.get("abilities.ability[0].name");
    String ExpctStaitcUrl = "https://pokeapi.co/api/v2/ability/31/";
    String ActualStaitcUrl = js.get("abilities.ability[0].url");
    boolean StaticHidden = js.get("abilities.is_hidden[0]");
    boolean ExpectedinHidden = true;
    Integer ActualStaitcSlot = js.getInt("abilities.slot[0]");
    Integer ExpectedStaitcSlot = 3;

    //2nd move

    String lightning_rod = js.get("abilities.ability[1].name");
    String Expctlightning_rodUrl = "https://pokeapi.co/api/v2/ability/31/";
    String Actuallightning_rodUrl = js.get("abilities.ability[1].url");
    boolean ActualLightning_rodHidden = js.get("abilities.is_hidden[1]");
    boolean Expectedlightning_rodisHidden = false;
    Integer Actuallightning_rodSlot = js.getInt("abilities.slot[1]");
    Integer Expectedlightning_rodSlot = 1;

}
