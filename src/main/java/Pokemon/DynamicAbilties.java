package Pokemon;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class DynamicAbilties {
    @Test(dataProvider ="ReplaceMoves")
    public void addBook(String moves1, String moves2){
        String response = Payloads.AbilityParalysis(moves1,moves2).toString();
        JsonPath js = Utilities.rawtoJSON(response);
        String firstmove = js.get("moves[0].name");
        String Secondmove = js.get("moves[1].name");
        System.out.println("@@@@@@@@@@ First move added @@@@@@@@@");
        System.out.println(firstmove);
        System.out.println("@@@@@@@@@@ Second move added @@@@@@@@@");
        System.out.println(Secondmove);
    }

    @DataProvider(name="ReplaceMoves")
    public Object[][] getData(){

        //array is a collection of elementals
        // multi dimensional array = it is a collection of arrays]
        //so we can create object and initializze it
        return new Object[][] {{"Thunder-Punch", "BodySlam"}, {"Blink", "Ghost"},{"Clapped","Sleep"}};
    }

}
