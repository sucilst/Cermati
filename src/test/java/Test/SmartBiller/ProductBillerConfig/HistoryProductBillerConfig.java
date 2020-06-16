package Test.SmartBiller.ProductBillerConfig;

import Steps.SmartBiller.ProductBillerConfig.HistoryProductBillerConfigStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HistoryProductBillerConfig {
    @Steps
    HistoryProductBillerConfigStep historyProductBillerConfigStep;

    @Given("on history tab product biller config sub menu")
    public void givenOnHistoryTabProductBillerConfigSubMenu()throws InterruptedException{
        historyProductBillerConfigStep.OnHistoryTabProductBillerConfigSubMenu();
    }

    @When("user fill the search box with correct biller id or biller name : ([^\"]*)")
    public void whenUserFillTheSearchBoxWithCorrectBillerIDOrBillerName(String biller)throws InterruptedException{
        Thread.sleep(2000);
        historyProductBillerConfigStep.FillTheSearchBoxWithBillerIDOrBillerName(biller);
    }

    @Then("user get product biller in accordance with the search box : ([^\"]*)")
    public void thenUserGetProductBillerInAccordanceWithTheSearchBox(String biller)throws InterruptedException{
        Thread.sleep(4000);
        historyProductBillerConfigStep.GetProductBillerInAccordanceWithTheSearchBox(biller);
    }

    @When("user fill the search box with incorrect biller id or biller name : ([^\"]*)")
    public void whenUserFillTheSearchBoxWithIncorrectBillerIDOrBillerName(String biller)throws InterruptedException{
        Thread.sleep(2000);
        historyProductBillerConfigStep.FillTheSearchBoxWithBillerIDOrBillerName(biller);
    }

    @Then("user get warning message \"Sorry, no matching options.\" on dropdown biller")
    public void thenUserGetWarningMessageSorryNoMatchingOptions(){}

    @When("user fill the search box with correct product id : ([^\"]*) and biller id or biller name : ([^\"]*)")
    public void whenUserFillTheSearchBoxWithCorrectProductIDAndBillerIDOrBillerName(String product_id, String biller)throws InterruptedException{
        Thread.sleep(2000);
        historyProductBillerConfigStep.FillTheSearchBoxWithProductIDAndBillerIDOrBillerName(product_id,biller);
    }

    @Then("user get product biller in accordance with the product id : ([^\"]*) and biller name : ([^\"]*)")
    public void thenUserGetProductBillerInAccordanceWithTheProductIDAndBillerName(String product_id, String biller)throws InterruptedException{
        Thread.sleep(4000);
        historyProductBillerConfigStep.GetProductBillerInAccordanceWithTheProductIDAndBillerName(product_id,biller);
    }

    @When("user fill the search box with incorrect product id : ([^\"]*) and correct biller id or biller name : ([^\"]*)")
    public void whenUserFillTheSearchBoxWithIncorrectProductIDAndCorrectBillerIDOrBillerName(String product_id, String biller)throws InterruptedException{
        Thread.sleep(2000);
        historyProductBillerConfigStep.FillTheSearchBoxWithProductIDAndBillerIDOrBillerName(product_id,biller);
    }

    @Then("user does not get any product biller, not contains product id : ([^\"]*) and biller name : ([^\"]*)")
    public void thenUserDoesntGetAnyProductBiller(String product_id, String biller)throws InterruptedException{
        Thread.sleep(3000);
        historyProductBillerConfigStep.DoesntGetAnyProductBiller(product_id,biller);
    }
}