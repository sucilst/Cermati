package Test.Biller.PricingConfig;

import Steps.Biller.PricingConfig.PricingConfigStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PricingConfig {
    @Steps
    PricingConfigStep pricingConfigStep;

    @Given("user has logged in before deal with pricing config")
    public void userhasloggedin() { }

    @When("user click Biller")
    public void user_click_Biller() throws InterruptedException {
        Thread.sleep(6000);
        pricingConfigStep.click_Biller();
    }

    @When("user click Price Mapping")
    public void user_click_Price_Mapping() throws InterruptedException {
        Thread.sleep(6000);
        pricingConfigStep.click_Price_Mapping();
    }

    @Then("user can see list of biller pricing")
    public void user_can_see_list_of_biller_pricing() throws InterruptedException{
        Thread.sleep(5000);
        pricingConfigStep.see_list_of_biller_pricing();
    }
}
