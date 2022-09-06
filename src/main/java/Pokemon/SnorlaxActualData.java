package Pokemon;

import io.restassured.path.json.JsonPath;

public class SnorlaxActualData extends Utilities{
    JsonPath js = Utilities.rawtoJSON(Payloads.SNorlaxAbilties());
    String Thickfat= js.get("abilities.ability[1].name");
    String Expectthick_fatURL = "https://pokeapi.co/api/v2/ability/47/";
    String Actualthick_fatURL = js.get("abilities.ability[1].url");
    String Snorlaxhidden = js.get("abilities.is_hidden[1]").toString();
    Integer abilitySlot = js.getInt("abilities.slot[1]");
}
