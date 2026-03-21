package api;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import utils.AuthManager;
import utils.RequestSpecBuilderUtil;

import static io.restassured.RestAssured.*;

public class UserClient {
    public static Response getUser(int id){
    return given()
            .spec(RequestSpecBuilderUtil.getRequestSpec())
            .header("Authorization", "Bearer " + AuthManager.getToken())
            .when()
            .get("/users/"+id);
    }
}
