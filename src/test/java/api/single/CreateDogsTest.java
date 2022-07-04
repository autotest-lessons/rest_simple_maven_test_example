package api.single;

import api.JsonCreate;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateDogsTest extends JsonCreate {

    @Test
    public void createDogAndCheck(){
        Response resp =
                given()
                    .contentType(ContentType.JSON)
                    .accept(ContentType.JSON)
                    .body(createJsonUnderscore())
                .when()
                    .post("https://petstore.swagger.io/v2/pet")
                .then()
                    .assertThat().statusCode(200)
                    .extract().response();
    }


    @Test
    public void createDogAndGetTag(){
        long id = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(createJsonUnderscore())
                .when()
                .post("https://petstore.swagger.io/v2/pet")
                .path("id");
        System.out.println("\n"+id);
    }

}
