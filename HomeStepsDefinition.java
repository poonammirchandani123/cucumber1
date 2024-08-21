package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeStepsDefinition {

    private String username;
    private String password;
    private boolean isLoggedIn;

    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        System.out.println("User is on the login page");
    }

    @When("the user enters valid credentials")
    public void userEntersValidCredentials() {
        username = "validUser";
        password = "validPass";
        isLoggedIn = authenticate(username, password);
    }

    @When("the user enters invalid credentials")
    public void userEntersInvalidCredentials() {
        username = "invalidUser";
        password = "invalidPass";
        isLoggedIn = authenticate(username, password);
    }

    @Then("the user should be redirected to the homepage")
    public void userIsRedirectedToHomepage() {
        Assert.assertTrue("User should be logged in", isLoggedIn);
        System.out.println("User is redirected to the homepage");
    }

    @Then("an error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        Assert.assertFalse("User should not be logged in", isLoggedIn);
        System.out.println("Error message is displayed");
    }

    // Mock authentication method
    private boolean authenticate(String username, String password) {
        return "validUser".equals(username) && "validPass".equals(password);
    }
}
