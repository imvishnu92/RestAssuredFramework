package utils;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class AuthManager {
    private static String token;

    public static String getToken() {
        if (token == null) {
            Response response = given()
                    .baseUri(ConfigManager.get("baseUrl"))
                    .header("x-api-key", ConfigManager.get("apiKey"))
                    .body("{\"email\":\""+ConfigManager.get("userName")+"\",\"password\":\""+ConfigManager.get("password")+"\"}")
                    .when()
                    .post("/login");
            token = response.jsonPath().getString("token");
        }
        return token;
    }
}
