package api.single;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetDogsTest {

    @Test
    public void getDogAndCheck() {
        Response resp = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when()
                    .get("https://petstore.swagger.io/v2/pet/9223372036854103598")
                .then()
                    .assertThat().statusCode(200)
                .and()
                    .body("status",equalTo("available"),
                            "tags.id",hasItems(0,1))
                .extract().response();
    }

    @Test
    public void getDogString() {
        String expensiveDog = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .get("https://petstore.swagger.io/v2/pet/9223372036854103598")
                .path("category.name");
        System.out.println("\n"+expensiveDog);
    }

    @Test
    public void getDogMap() {
        Map<String, ?> map = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .get("https://petstore.swagger.io/v2/pet/9223372036854103598")
                .path("tags.find{it.name='dogTagOne'}");
        System.out.println("\n"+map);
    }

}
