package Test.Login;

import Steps.Login.CacaBotLoginStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CacaBotLogin {
    @Steps
    CacaBotLoginStep cacaBotLoginStep;

    @Given("user open sentinel dev login page")
    public void givenUserOpenSentinelDevLoginPage() {
        cacaBotLoginStep.OpenSentinelDevLoginPage();
    }

    @When("user input ([^\"]*) as username and input password")
    public void whenUserInputUsernameAndPassword(String username) {
        cacaBotLoginStep.InputUsernameAndPassword(username);
    }

    @Then("user can see sentinel dev dashboard and logged in as ([^\"]*)")
    public void thenUserCanSeeSentinelDevDashboardAndLoggedInAs(String username) throws InterruptedException{
        cacaBotLoginStep.CanSeeSentinelDevDashboardAndLoggedInAs(username);
    }
}