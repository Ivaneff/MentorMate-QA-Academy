package restAssuredHomework;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.annotations.*;
import restAssuredDemo.LoginDto;

import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

public class LoggingAuthenticationTests {
    @BeforeTest
    public void setup() {
        baseURI = "http://training.skillo-bg.com:3100";
    }

    @Test
    public void loginTest() {

        LoginDto loginDto = new LoginDto();
        loginDto.setUsernameOrEmail("Ivo1");
        loginDto.setPassword("ivoivo1");

        Response response = given().
                log().all().
                header("Content-Type", "application/json").
                body(loginDto).
                when().
                post("/users/login").
                then().
                log().all().
                extract().response();

        int statusCode = response.statusCode();
        assertEquals(statusCode, HttpStatus.SC_CREATED);

    }
}
