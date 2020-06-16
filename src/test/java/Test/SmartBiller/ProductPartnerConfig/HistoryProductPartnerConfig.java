package Test.SmartBiller.ProductPartnerConfig;

import Steps.SmartBiller.ProductPartnerConfig.HistoryProductPartnerConfigStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HistoryProductPartnerConfig {

    @Steps
    HistoryProductPartnerConfigStep historyProductPartnerConfigStep;

    @Given("on History tab on product partner config sub menu")
    public void givenOnHistoryTabOnProductPartnerConfigSubMenu()throws InterruptedException{
        historyProductPartnerConfigStep.OnHistoryTabOnProductPartnerConfigSubMenu();
    }

    @When("user fill the search box with correct product id : ([^\"]*) and click next page")
    public void whenUserFillTheSearchBoxWithCorrectProductIDAndClickNextPage(String product_id)throws InterruptedException{
        historyProductPartnerConfigStep.FillTheSearchBoxWithCorrectProductIDAndClickNextPage(product_id);
    }

    @Then("user gets normal list with mix product id, not ([^\"]*)")
    public void thenUserGetsNormalListWithMixProductID(String product_id)throws InterruptedException{
        Thread.sleep(4000);
        historyProductPartnerConfigStep.GetsNormalListWithMixProductID(product_id);
    }

    @When("user fill the search box with correct product id : ([^\"]*) and click last page")
    public void whenUserFillTheSearchBoxWithCorrectProductIDAndClickLastPage(String product_id)throws InterruptedException{
        historyProductPartnerConfigStep.FillTheSearchBoxWithCorrectProductIDAndClickLastPage(product_id);
    }

    @When("user fill the search box with correct product id : ([^\"]*) and click previous page")
    public void whenUserFillTheSearchBoxWithCorrectProductIDAndClickPreviousPage(String product_id)throws InterruptedException{
        historyProductPartnerConfigStep.FillTheSearchBoxWithCorrectProductIDAndClickPreviousPage(product_id);
    }

    @When("user fill the search box with correct product id : ([^\"]*) and click first page")
    public void whenUserFillTheSearchBoxWithCorrectProductIDAndClickFirstPage(String product_id)throws InterruptedException{
        historyProductPartnerConfigStep.FillTheSearchBoxWithCorrectProductIDAndClickFirstPage(product_id);
    }

    @When("user fill the search box with correct partner id or partner name, that is ([^\"]*)")
    public void whenUserFillTheSearchBoxWithCorrectPartnerIDOrPartnerName(String partner)throws InterruptedException{
        historyProductPartnerConfigStep.FillPartnerIDOrPartnerNameSearchBox(partner);
    }

    @Then("user get product in accordance with the partner id/partner name : ([^\"]*)")
    public void thenUserGetProductInAccordanceWithThePartnerIDOrPartnerNameSearchBox(String partner)throws InterruptedException{
        Thread.sleep(4000);
        historyProductPartnerConfigStep.GetProductInAccordanceWithThePartnerIDOrPartnerNameSearchBox(partner);
    }

    @When("user fill the search box with incorrect partner id or partner name, that is ([^\"]*)")
    public void whenUserFillTheSearchBoxWithIncorrectPartnerIDOrPartnerName(String partner)throws InterruptedException{
        historyProductPartnerConfigStep.FillPartnerIDOrPartnerNameSearchBox(partner);
    }

    @Then("user get warning message \"sorry no matching options\"")
    public void thenUserGetWarningMessageSorryNoMatchingOptions(){
        historyProductPartnerConfigStep.GetWarningMessageSorryNoMatchingOptions();
    }

    @When("user fill the search box with correct product id : ([^\"]*) and partner id or partner name : ([^\"]*)")
    public void whenUserFillTheSearchBoxWithCorrectProductIDAndPartnerIDOrPartnerName(String product_id, String partner)throws InterruptedException{
        historyProductPartnerConfigStep.FillTheSearchBoxWithCorrectProductIDAndPartnerIDOrPartnerName(product_id,partner);
    }

    @Then("user get product in accordance with the product id : ([^\"]*) and partner id or partner name : ([^\"]*)")
    public void thenUserGetProductInAccordanceWithTheProductIDAndPartnerIDOrPartnerNameSearchBox(String product_id, String partner)throws InterruptedException{
        Thread.sleep(4000);
        historyProductPartnerConfigStep.GetProductInAccordanceWithTheProductIDAndPartnerIDOrPartnerNameSearchBox(product_id,partner);
    }

    @When("user fill the search box with incorrect product id : ([^\"]*) and correct partner id or partner name : ([^\"]*)")
    public void whenUserFillTheSearchBoxWithIncorrectProductIDAndCorrectPartnerIDOrPatnerName(String product_id,String partner)throws InterruptedException{
        historyProductPartnerConfigStep.FillTheSearchBoxWithIncorrectProductIDAndCorrectPartnerIDOrPatnerName(product_id,partner);
    }

    @Then("user does not get any product partner, not contains product id : ([^\"]*) and partner : ([^\"]*)")
    public void thenUserDoesntGetAnyProductPartner(String product_id, String partner)throws InterruptedException{
        Thread.sleep(3000);
        historyProductPartnerConfigStep.DoesntGetAnyProductPartner(product_id,partner);
    }

    @When("see the id of param \"Updated At\"")
    public void whenSeeTheIDOfParamUpdatedAt()throws InterruptedException{
        Thread.sleep(3000);
        historyProductPartnerConfigStep.SeeTheIDOfParamUpdatedAt();
    }

    @Then("get correct id")
    public void thenGetCorrectID(){
        historyProductPartnerConfigStep.GetCorrectID();
    }
}