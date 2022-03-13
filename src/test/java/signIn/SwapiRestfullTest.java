package signIn;

import io.restassured.RestAssured;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class SwapiRestfullTest {

    @Test
    public void swapiRestfullVerificationBody(){
        RestAssured.
                when().get("https://swapi.dev/api/starships/9/").
                then().assertThat().statusCode(200).
                and().body("name", equalTo("Death Star"));
    }
}
