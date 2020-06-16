package Test.SmartBiller.ProductBillerConfig;

import Steps.SmartBiller.ProductBillerConfig.ProductBillerStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ProductBiller {
    @Steps
    ProductBillerStep productBillerStep;

    @Given("on Product Biller Config Menu")
    public void givenOnProductBillerConfigMenu()throws InterruptedException{
        productBillerStep.OnProductBillerConfigMenu();
    }

    @When("user click \"Product Biller\" tab")
    public void whenClickProductBillerTab(){
        productBillerStep.ClickProductBillerTab();
    }

    @Then("user get display in accordance with po's requested")
    public void thenGetDisplayInAccordanceWithPOsRequested()throws InterruptedException{
        Thread.sleep(4000);
        productBillerStep.GetDisplayInAccordanceWithPOsRequested();
    }

    @Given("on Product Biller Tab")
    public void givenOnProductBillerTab()throws InterruptedException{
        productBillerStep.OnProductBillerConfigMenu();
        Thread.sleep(4000);
        productBillerStep.GetDisplayInAccordanceWithPOsRequested();
    }

    @When("user search product biller by ([^\"]*) category")
    public void whenSearchCorrectProductBillerByCategory(String category){
        productBillerStep.SearchCorrectProductBillerByCategory(category);
    }

    @Then("user get correct product biller based on search filter or contains this ([^\"]*)")
    public void thenGetCorrectProductBillerBasedOnSearchFilter(String text)throws InterruptedException{
        Thread.sleep(3000);
        productBillerStep.GetCorrectProductBillerBasedOnSearchFilter(text);
    }

    @Then("user get message \"Sorry, no matching options.\" on category filter")
    public void thenGetMessageNoMatchingOptions(){}

    @When("user search correct product biller by ([^\"]*) category and ([^\"]*) filter, that is ([^\"]*)")
    public void whenSearchProductBillerByCategoryAndOtherFilter(String category, String other_filter, String text){
        productBillerStep.SearchProductBillerByOtherFilter(other_filter,text);
        productBillerStep.SearchCorrectProductBillerByCategory(category);
    }
}