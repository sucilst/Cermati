package Test.Login;

import Steps.Login.LoginStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Login {
    @Steps
    LoginStep loginStep;
    @Given("User open sentinel login page")
    public void givenUserOpenSentinelLoginPage() {
        loginStep.UserOpenSentinelLoginPage();
    }

    @When("User input ([^\"]*) as username and input password")
    public void whenInputUsernameAndPassword(String username) {
        loginStep.InputUsernameAndPassword(username);
    }

    @Then("User can see sentinel dashboard and logged in as ([^\"]*)")
    public void thenUserCanSeeSentinelDashboardAndLoggedInAs(String username) throws InterruptedException{
        loginStep.CanSeeSentinelDashboardAndLoggedInAs(username);
    }
}
