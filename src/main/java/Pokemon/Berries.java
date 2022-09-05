package Pokemon;

import io.restassured.path.json.JsonPath;

public class Berries {
    public static void main(String[] args) {
        JsonPath js = new JsonPath((Payloads.Berries()));
        int countResults = js.getInt("results.size()");
        System.out.println("Prints the TOTAL number of berries in this payload: ");
        System.out.println(countResults);
        //get next set of data from payload
        System.out.println("We will print berry name from payload: ");
        String BerryName = js.get("results[0].name");
        System.out.println(BerryName);

        ///
        // for loops will print all berries and their URL
        System.out.println("for loops will print all berries and their URL");
        for (int i = 0; i < countResults; i++) {
            String Allresults = js.get("results[" + i + "].name").toString();
            System.out.println(js.get("results[" + i + "].url").toString());
            System.out.println(Allresults);

        }

        // get specific berri from payload
        for (int i = 0; i < countResults; i++) {
            String Allresults = js.get("results[" + i + "].name").toString();
            if (Allresults.equalsIgnoreCase("sitrus")){
                String specificBerri = js.get("results[" + i + "].url").toString();
                System.out.println(specificBerri);
            }
    }
}
}
