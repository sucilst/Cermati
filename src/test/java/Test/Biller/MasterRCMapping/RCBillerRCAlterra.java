package Test.Biller.MasterRCMapping;

import Steps.Biller.MasterRCMapping.RCBillerRCAlterraStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RCBillerRCAlterra {
    @Steps
    RCBillerRCAlterraStep rcBillerRCAlterraStep;

    @Given("on Master RC Mapping sub menu; RC Biller - RC Alterra Tab")
    public void givenOnMasterRCMappingSubMenuRCBillerRCAlterraTab()throws InterruptedException{
        Thread.sleep(6000);
        rcBillerRCAlterraStep.OnMasterRCMappingSubMenuRCBillerRCAlterraTab();
    }

    @When("user click log button")
    public void whenUserClickLogButton(){
        rcBillerRCAlterraStep.ClickLogButton();
    }

    @Then("user get display must be the same as the Product Owner's request")
    public void thenUserGetDisplayMustBeTheSameAsTheProductOwnersRequested()throws InterruptedException{
        Thread.sleep(4000);
        rcBillerRCAlterraStep.GetDisplayMustBeTheSameAsTheProductOwnersRequested();
    }

    @Then("user get 5 last change rc mapping")
    public void thenUserGet5LastChangeRCMapping()throws InterruptedException{
        Thread.sleep(3000);
        rcBillerRCAlterraStep.Get5LastChangeRCMapping();
    }

    @Given("user already edit rc")
    public void givenUserAlreadyEditRC(){}

    @When("user approves the change on rc mapping approval menu; user click log button")
    public void whenUserApprovesTheChangeOnRCMappingApprovalMenuUserClickLogButton(){}

    @Then("user get detail of new change on first row")
    public void thenUserGetDetailOfNewChangeOnFirstRow(){}

    @Given("user already edit rc more than 5 times")
    public void givenUserAlreadyEditRCMoreThan5Times(){}

    @Then("user get 5 recent data changes")
    public void thenUserGet5RecentDataChanges(){}
}