package Test.SmartBiller.TOPConfig;

import Steps.SmartBiller.TOPConfig.TOPPartnerLogStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TOPPartnerLog {
    @Steps
    TOPPartnerLogStep topPartnerLogStep;

    @Given("already on TOP Config sub menu")
    public void givenAlreadyOnTopConfigSubMenu(){
        topPartnerLogStep.ClickCancelButton();
    }

    @When("user click tab \"TOP Partner Log\"")
    public void whenUserClickTabTopPartnerLog(){
        topPartnerLogStep.ClickTabTopPartnerLog();
    }

    @Then("user get display of tab \"TOP Partner Log\" in accordance with po's requested")
    public void thenGetDisplayedInAccordanceWithPOsRequested()throws InterruptedException{
        Thread.sleep(4000);
        topPartnerLogStep.GetDisplayedInAccordanceWithPOsRequested();
    }

    @Given("already edit TOP partner with ([^\"]*) numbers")
    public void givenAlreadyEditTOPPartnerWithNumber(String number)throws InterruptedException{
        topPartnerLogStep.AlreadyEditTOPPartnerWithNumber(number);
    }

    @Then("user see change of this partner is ([^\"]*) numbers at the top of the list")
    public void thenUserSeeChangeOfThisPartnerIsAtTheTopOfTheList(String number)throws InterruptedException{
        Thread.sleep(3000);
        topPartnerLogStep.SeeChangeOfThisPartnerIsAtTheTopOfTheList(number);
    }

    @Given("On TOP Partner Log tab")
    public void givenOnTopPartnerLogTab()throws InterruptedException{
        topPartnerLogStep.ClickCancelButton();
        topPartnerLogStep.ClickTabTopPartnerLog();
        Thread.sleep(4000);
        topPartnerLogStep.GetDisplayedInAccordanceWithPOsRequested();
    }

    @When("user search correct partner, the partner is ([^\"]*)")
    public void whenSearchCorrectPartner(String partner){
        topPartnerLogStep.SearchCorrectPartner(partner);
    }

    @Then("user get log list of ([^\"]*)")
    public void thenGetLogList(String partner)throws InterruptedException{
        Thread.sleep(3000);
        topPartnerLogStep.GetLogList(partner);
    }

    @Given("On page 2 of TOP Partner Log Tab")
    public void givenOnPage2OfTopPartnerLog()throws InterruptedException{
        topPartnerLogStep.ClickCancelButton();
        topPartnerLogStep.ClickTabTopPartnerLog();
        Thread.sleep(4000);
        topPartnerLogStep.GetDisplayedInAccordanceWithPOsRequested();
        topPartnerLogStep.ClickPage2();
    }

    @Then("user get default page is page 1 and the partner that displayed on the list is ([^\"]*)")
    public void thenGetDefaultPageIsPage1AndGetCorrectPartnerOnTheList(String partner)throws InterruptedException{
        Thread.sleep(3000);
        topPartnerLogStep.GetDefaultPageIsPage1AndGetCorrectPartnerOnTheList(partner);
    }

    @When("user search incorrect partner or random alphabet")
    public void whenSearchIncorrectPartner(){
        topPartnerLogStep.SearchIncorrectPartner();
    }

    @Then("user get message \"Sorry, no matching options.\"")
    public void thenGetSorryNoMatchingOptions(){}

    @When("user fill the partner filter with ([^\"]*); click clear filter")
    public void whenFillhePartnerFilterThenClickClearFilter(String partner){
        topPartnerLogStep.FillhePartnerFilterThenClickClearFilter(partner);
    }

    @Then("user get the partner filter is empty")
    public void thenGetPartnerFilterEmpty(){
        topPartnerLogStep.GetPartnerFilterEmpty();
    }
}