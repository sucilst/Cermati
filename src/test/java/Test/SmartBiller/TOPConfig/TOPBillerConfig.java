package Test.SmartBiller.TOPConfig;

import Steps.SmartBiller.TOPConfig.TOPBillerConfigStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class TOPBillerConfig {
    @Steps
    TOPBillerConfigStep topBillerConfigStep;

    @When("user click tab \"TOP Biller Config\"")
    public void whenClickTabTopBillerConfig(){
        topBillerConfigStep.ClickTabTopBillerConfig();
    }

    @Then("user get display of TOP Biller Config based on wireframe")
    public void thenGetDisplayOfTopBillerConfigBasedOnWireframe()throws InterruptedException{
        Thread.sleep(4000);
        topBillerConfigStep.GetDisplayOfTopBillerConfigBasedOnWireframe();
    }

    @Given("on tab TOP Biller Config")
    public void givenOnTabTopBillerConfig()throws InterruptedException{
        topBillerConfigStep.OnTabTopBillerConfig();
    }

    @When("user click add TOP Biller Config Button")
    public void whenUserClickAddTopBillerConfigButton(){
        topBillerConfigStep.ClickAddTopBillerConfigButton();
    }

    @Then("user get biller dropdown and TOP biller text field")
    public void thenGetBillerDropdownAndTopBillerTextField()throws InterruptedException{
        Thread.sleep(3000);
        topBillerConfigStep.GetBillerDropdownAndTopBillerTextField();
    }

    @Given("on add TOP Biller Config Pop Up")
    public void givenOnAddTopBillerConfigPopUp()throws InterruptedException{
        topBillerConfigStep.OnAddTopBillerConfigPopUp();
    }

    @When("user select biller ([^\"]*) and fill TOP of this biller")
    public void whenSelectBillerTestAndFillTopOfThisBiller(String biller)throws InterruptedException{
        topBillerConfigStep.SelectBillerTestAndFillTopOfThisBiller(biller);
    }

    @Then("user get new TOP Biller Config on the top of the table list with biller ([^\"]*) and his TOP Biller")
    public void thenGetNewTopBillerConfig(String biller)throws InterruptedException{
        Thread.sleep(3000);
        topBillerConfigStep.GetNewTopBillerConfig(biller);
    }

    @When("user click edit button at the top of the list")
    public void whenUserClickEditButtonAtTheTopOfTheList(){
        topBillerConfigStep.ClickEditButtonAtTheTopOfTheList();
    }

    @Then("user get correct biller and TOP biller text field")
    public void thenGetCorrectBillerAndTopBillerTextField()throws InterruptedException{
        Thread.sleep(3000);
        topBillerConfigStep.GetCorrectBillerAndTopBillerTextField();
    }

    @Given("on edit TOP Biller Config Pop Up")
    public void givenOnEditTopBillerConfigPopUp()throws InterruptedException{
        topBillerConfigStep.OnEditTopBillerConfigPopUp();
    }

    @When("user change the TOP biller")
    public void whenChangeTheTopBiller()throws InterruptedException{
        topBillerConfigStep.ChangeTheTopBiller();
    }

    @Then("user get change on TOP this chosen biller")
    public void thenGetChangeOnTopThisChosenBiller()throws InterruptedException{
        Thread.sleep(3000);
        topBillerConfigStep.GetChangeOnTopThisChosenBiller();
    }
}