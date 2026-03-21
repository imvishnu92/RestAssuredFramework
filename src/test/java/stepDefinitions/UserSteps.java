package stepDefinitions;

import api.UserClient;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

public class UserSteps {
    Response response;
    @When("I fetch user with id {int}")
    public void getUser(int id){
    response = UserClient.getUser(id);
    }

    @Then("response status should be {int}")
    public void validateStatus(int status){
        Assert.assertEquals(response.getStatusCode(), status);
    }
}
