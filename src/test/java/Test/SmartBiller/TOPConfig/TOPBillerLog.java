package Test.SmartBiller.TOPConfig;

import Steps.SmartBiller.TOPConfig.TOPBillerLogStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TOPBillerLog {
    @Steps
    TOPBillerLogStep topBillerLogStep;

    @Given("Click Cancel Button")
    public void givenClickCancelButton(){
        topBillerLogStep.ClickCancelButton();
    }

    @When("user click tab \"TOP Biller Log\"")
    public void whenUserClickTabTopBillerLog(){
        topBillerLogStep.ClickTabTopBillerLog();
    }

    @Then("user get display of tab \"TOP Biller Log\" in accordance with po's requested")
    public void thenGetDisplayedInAccordanceWithPOsRequested()throws InterruptedException{
        Thread.sleep(4000);
        topBillerLogStep.GetDisplayedInAccordanceWithPOsRequested();
    }

    @Given("already edit TOP biller with ([^\"]*) numbers")
    public void givenAlreadyEditTOPBillerWithNumber(String number)throws InterruptedException{
        topBillerLogStep.AlreadyEditTOPBillerWithNumber(number);
    }

    @Then("user see change of this biller is ([^\"]*) numbers at the top of the list")
    public void thenUserSeeChangeOfThisBillerIsAtTheTopOfTheList(String number)throws InterruptedException{
        Thread.sleep(3000);
        topBillerLogStep.SeeChangeOfThisBillerIsAtTheTopOfTheList(number);
    }

    @Given("On TOP Biller Log tab")
    public void givenOnTopBillerLogTab()throws InterruptedException{
        topBillerLogStep.ClickCancelButton();
        topBillerLogStep.ClickTabTopBillerLog();
        Thread.sleep(4000);
        topBillerLogStep.GetDisplayedInAccordanceWithPOsRequested();
    }

    @When("user search correct biller, the biller is ([^\"]*)")
    public void whenSearchCorrectBiller(String biller){
        topBillerLogStep.SearchCorrectBiller(biller);
    }

    @Then("user get top biller log list of ([^\"]*)")
    public void thenGetTopBillerLogList(String biller)throws InterruptedException{
        Thread.sleep(3000);
        topBillerLogStep.GetLogList(biller);
    }

    @Given("On page 2 of TOP Biller Log Tab")
    public void givenOnPage2OfTopBillerLog()throws InterruptedException{
        topBillerLogStep.ClickCancelButton();
        topBillerLogStep.ClickTabTopBillerLog();
        Thread.sleep(4000);
        topBillerLogStep.GetDisplayedInAccordanceWithPOsRequested();
        topBillerLogStep.ClickPage2();
    }

    @Then("user get default page is page 1 and the biller that displayed on the list is ([^\"]*)")
    public void thenGetDefaultPageIsPage1AndGetCorrectBillerOnTheList(String biller)throws InterruptedException{
        Thread.sleep(3000);
        topBillerLogStep.GetDefaultPageIsPage1AndGetCorrectBillerOnTheList(biller);
    }

    @When("user search incorrect biller or random alphabet")
    public void whenSearchIncorrectBiller(){
        topBillerLogStep.SearchIncorrectBiller();
    }

    @Then("user get \"Sorry, no matching options.\" message")
    public void thenGetSorryNoMatchingOptionsMessage(){}

    @When("user fill the biller filter with ([^\"]*); click clear filter")
    public void whenFillheBillerFilterThenClickClearFilter(String biller){
        topBillerLogStep.FillheBillerFilterThenClickClearFilter(biller);
    }

    @Then("user get the biller filter is empty")
    public void thenGetBillerFilterEmpty(){
        topBillerLogStep.GetBillerFilterEmpty();
    }
}