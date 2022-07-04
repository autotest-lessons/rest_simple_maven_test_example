package api.expends;

import com.github.underscore.Json;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

import static io.restassured.RestAssured.given;


public class CreateGetExpendTest extends BaseExpendTest {

    @Test
    public void createDog() {
        String jsonString = "{\"id\":0,\"category\":{\"id\":0,\"name\":\"string\"},\"name\":\"doggie\",\"photoUrls\":[\"string\"],\"tags\":[{\"id\":0,\"name\":\"string\"}],\"status\":\"available\"}";
        Response resp = given()
                .body(jsonString)
                .post();
        System.out.println("\n"+resp.asString());
    }

    @Test
    public void getDog() {
        Response resp = given()
                .get("/9223372036854101497");
        System.out.println("\n"+resp.asString());
    }

}
