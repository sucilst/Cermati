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

    @When("user filter ([^\"]*) with value ([^\"]*) of the pricing config")
    public void user_filter_biller_with_value_Indosat_Saldo_Mobo_of_the_pricing_config(String filter, String val) {

    }

    @Then("the pricing config shows the correct data based on filter ([^\"]*) with value ([^\"]*)")
    public void the_pricing_config_shows_the_correct_data_based_on_filter_biller_with_value_Indosat_Saldo_Mobo(String filter, String val) {

    }
}
