package Test.SmartBiller.TOPConfig;

import Steps.SmartBiller.TOPConfig.TOPPartnerConfigStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TOPPartnerConfig {
    @Steps
    TOPPartnerConfigStep topPartnerConfigStep;

    @Given("on TOP Config sub menu")
    public void givenOnTopConfigSubMenu()throws InterruptedException{
        Thread.sleep(6000);
        topPartnerConfigStep.OnTopConfigSubMenu();
    }

    @When("user click tab \"TOP Partner Config\"")
    public void whenUserClickTabTopPartnerConfig(){
        topPartnerConfigStep.ClickTabTopPartnerConfig();
    }

    @Then("user get display based on wireframe")
    public void thenUserGetDisplayBasedOnWireframe()throws InterruptedException{
        Thread.sleep(4000);
        topPartnerConfigStep.GetDisplayBasedOnWireframe();
    }

    @Given("on tab TOP Partner Config")
    public void givenOnTabTopPartnerConfig()throws InterruptedException{
        Thread.sleep(6000);
        topPartnerConfigStep.OnTabTopPartnerConfig();
    }

    @When("user click add TOP Partner Config Button")
    public void whenUserClickAddTopPartnerConfigButton(){
        topPartnerConfigStep.ClickAddTopPartnerConfigPopUp();
    }

    @Then("user get partner dropdown and TOP partner text field")
    public void thenUserGetPartnerDropdownAndTopPartnerTextField()throws InterruptedException{
        Thread.sleep(4000);
        topPartnerConfigStep.GetPartnerDropdownAndTopPartnerTextField();
    }

    @Given("on add TOP Partner Config Pop Up")
    public void givenOnAddTopPartnerConfigPopUp()throws InterruptedException{
        Thread.sleep(6000);
        topPartnerConfigStep.OnAddTopPartnerConfigPopUp();
    }

    @When("user select partner ([^\"]*) and fill TOP of this partner ([^\"]*)")
    public void whenUserSelectPartnerAndFillTopOfThisPartner(String partner, String TOP){
        topPartnerConfigStep.SelectPartnerAndFillTopOfThisPartner(partner,TOP);
    }

    @Then("user get new TOP Partner Config on the top of the table list with partner ([^\"]*) and his TOP Partner is ([^\"]*)")
    public void thenUserGetNewTopPartnerConfigOnTheTopOfTheTableList(String partner, String top)throws InterruptedException{
        Thread.sleep(4000);
        topPartnerConfigStep.GetNewTopPartnerConfigOnTheTopOfTheTableList(partner,top);
    }

    @When("user click edit button on one of the row in the list")
    public void whenUserClickEditButtonOnOneOfTheRowInTheList()throws InterruptedException{
        Thread.sleep(3000);
        topPartnerConfigStep.ClickEditButtonOnOneOfTheRowInTheList();
    }

    @Then("user get correct partner and TOP partner text field")
    public void thenUserGetCorrectPartnerAndTopPartnerTextField()throws InterruptedException{
        Thread.sleep(3000);
        topPartnerConfigStep.GetCorrectPartnerAndTopPartnerTextField();
    }

    @Given("on edit TOP Partner Config Pop Up")
    public void givenOnEditTopPartnerConfigPopUp()throws InterruptedException{
        Thread.sleep(6000);
        topPartnerConfigStep.OnEditTopPartnerConfigPopUp();
    }

    @When("user change the TOP partner")
    public void whenUserChangeTheTopPartner()throws InterruptedException{
        topPartnerConfigStep.ChangeTheTopPartner();
    }

    @Then("user get change on TOP this chosen partner")
    public void thenUserGetChangeOnTopThisChosenPartner(){
        topPartnerConfigStep.GetChangeOnTopThisChosenPartner();
    }
}