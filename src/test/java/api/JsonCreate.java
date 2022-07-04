package api;

import com.github.underscore.U;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonCreate {

    protected String createJsonUnderscore() {
        U.Builder jsonPet = U.objectBuilder()
                .add("id", 0)
                .add("category", U.objectBuilder()
                        .add("id",0)
                        .add("name","LittleDog")
                )
                .add("name","FirstDog")
                .add("photoUrls",U.arrayBuilder()
                        .add("http://MyDoggyOne.com")
                )
                .add("tags", U.arrayBuilder()
                        .add(U.objectBuilder()
                                .add("id",0)
                                .add("name","dogTagOne")
                        )
                )
                .add("status","available");

        //System.out.println(jsonPet.toJson());

        return jsonPet.toJson();
    }

    protected String createJsonObject() {
        JSONObject json = new JSONObject();

        json.put("id", 777894);

        JSONObject itemCategory = new JSONObject();
        itemCategory.put("id", 0);
        itemCategory.put("name", "LittleDog");
        json.put("category", itemCategory);

        json.put("name", "doggie");

        JSONArray arrayPhotoUrls = new JSONArray();
        arrayPhotoUrls.put("http://MyDoggyOne.com");
        json.put("photoUrls", arrayPhotoUrls);

        JSONArray arrayTags = new JSONArray();
        JSONObject itemTags = new JSONObject();
        itemTags.put("id", 0);
        itemTags.put("name", "dogTagOne");
        arrayTags.put(itemTags);
        json.put("tags", arrayTags);

        json.put("status", "available");

        //System.out.println("\n"+json.toString());

        return json.toString();
    }

    private String createJsonText() {
        String jsonString = "{\"id\":0,\"category\":{\"id\":0,\"name\":\"string\"},\"name\":\"doggie\",\"photoUrls\":[\"string\"],\"tags\":[{\"id\":0,\"name\":\"string\"}],\"status\":\"available\"}";
        JSONParser jsonParser = new JSONParser();
        org.json.simple.JSONObject json = null;
        try {
            json = (org.json.simple.JSONObject) jsonParser.parse(jsonString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //System.out.println("\n"+json.toString());

        return json.toString();
    }

}
