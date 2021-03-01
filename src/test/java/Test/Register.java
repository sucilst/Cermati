package Test;

import Steps.RegisterStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Register {
    @Steps
    RegisterStep registerStep;

    @Given("User open the register page")
    public void givenUserOpenSentinelLoginPage() {
        registerStep.UserOpenRegisterPage();
    }

    @When("User input ([^\"]*), password, confirmation password, ([^\"]*), ([^\"]*), ([^\"]*), and ([^\"]*)")
    public void whenInputEmail(String email, String firtName, String lastName, String phoneNumber, String city) {
        registerStep.UserInputField(email, firtName, lastName, phoneNumber, city);
        registerStep.clickButtonDaftar();
    }

    @Then("User has registered")
    public void thenUserCanSeeLoginForm() throws InterruptedException{
        registerStep.dashboardPage();
    }

}
