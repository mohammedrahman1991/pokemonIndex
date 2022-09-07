package Pokemon;

import io.restassured.path.json.JsonPath;

public class SnorlaxActualData extends Utilities{
    JsonPath js = Utilities.rawtoJSON(Payloads.SNorlaxAbilties());
    // immunity assertions
    String Immunity = js.get("abilities.ability[0].name");
    String ExpctImmunityUrl = "https://pokeapi.co/api/v2/ability/17/";
    String ActualImmunityUrl = js.get("abilities.ability[0].url");
    String ImmunityHidden = js.get("abilities.is_hidden[0]").toString();
    Integer ActualImmunitySlot = js.getInt("abilities.slot[0]");
    Integer ExpectedImmunitySlot = 3;



    // thick fat assertions

    String Thickfat= js.get("abilities.ability[1].name");
    String Expectthick_fatURL = "https://pokeapi.co/api/v2/ability/47/";
    String Actualthick_fatURL = js.get("abilities.ability[1].url");
    String Snorlaxhidden = js.get("abilities.is_hidden[1]").toString();
    Integer abilitySlot = js.getInt("abilities.slot[1]");



    // gluttony assertions
    String Gluttony = js.get("abilities.ability[2].name");
    String Expect_GluttonyURL= "https://pokeapi.co/api/v2/ability/17/";
    String Actual_GluttonyURL = js.get("abilities.ability[2].url");
    boolean Gluttonyhidden = js.get("abilities.is_hidden[2]");
    Integer ActualGluttonySlot = js.getInt("abilities.slot[2]");
    Integer ExpctGluttonySlot = 1;
}
