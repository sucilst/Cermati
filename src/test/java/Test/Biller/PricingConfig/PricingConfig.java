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
    public void user_filter_biller_with_value_Indosat_Saldo_Mobo_of_the_pricing_config(String filter, String val) throws InterruptedException{
        Thread.sleep(6000);
        pricingConfigStep.user_filter(filter,val);
    }

    @Then("the pricing config shows the correct data based on filter ([^\"]*) with value ([^\"]*)")
    public void the_pricing_config_shows_the_correct_data_based_on_filter_biller_with_value_Indosat_Saldo_Mobo(String filter, String val) throws InterruptedException {
        Thread.sleep(8000);
    }

    @When("user click Add Product")
    public void user_click_Add_Product() throws InterruptedException{
        Thread.sleep(5000);
        pricingConfigStep.click_Add_Product();
    }

    @When("user fill a pricing config with ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*)")
    public void user_fill_a_pricing_config_with_Dummy_Biller_Tri_Rp_A_Price_false(String biller, String product, String biller_product_code,String pricing_type, String biller_fee, String collection_fee, String incl_ppn)
    throws InterruptedException {
        Thread.sleep(8000);
        pricingConfigStep.fill_a_pricing_config(biller,product,biller_product_code,pricing_type,biller_fee,collection_fee,incl_ppn);
    }

    @When("user click save")
    public void user_click_save() {
        pricingConfigStep.click_save();
    }

    @When("clik Ok")
    public void clik_Ok() throws InterruptedException{
        Thread.sleep(6000);
        pricingConfigStep.clik_Ok();
    }

    @Then("the pricing config for ([^\"]*), ([^\"]*) successfully added")
    public void the_pricing_config_for_Dummy_Biller_Tri_Rp_successfully_added(String biller, String product) {

    }

    @Then("the pricing config addition is failed due to Duplicate entry")
    public void the_pricing_config_addition_is_failed_due_to_Duplicate_entry() throws InterruptedException {
        Thread.sleep(4000);
        pricingConfigStep.pricing_config_addition_is_failed();
    }

    @When("user edit a pricing config at ([^\"]*) with ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*), ([^\"]*)")
    public void user_edit_a_pricing_config_with_A_price_false(String whatEdit,String biller_product_code,String pricing_type, String biller_fee, String collection_fee, String incl_ppn)
    throws InterruptedException{
        Thread.sleep(3000);
        pricingConfigStep.click_UPDATE();
        Thread.sleep(6000);
        pricingConfigStep.edit_a_pricing_config(whatEdit,biller_product_code,pricing_type,biller_fee,collection_fee,incl_ppn);
    }

    @Then("the pricing config for successfully edited")
    public void the_pricing_config_for_successfully_edited() {

    }

    @When("user delete a pricing config")
    public void user_delete_a_pricing_config() throws InterruptedException {
        Thread.sleep(4000);
        pricingConfigStep.delete_a_pricing_config();
    }

    @Then("the pricing config successfully deleted")
    public void the_pricing_config_successfully_deleted() {

    }
}
