package Test.SmartBiller.ChangeLog;

import Steps.SmartBiller.ChangeLog.ChangeLogStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ChangeLog {
    @Steps
    ChangeLogStep changeLogStep;

    @Given("on change log sub menu")
    public void givenOnChangeLogSubMenu()throws InterruptedException{
        Thread.sleep(6000);
        changeLogStep.OnSmartBillerMenu();
        Thread.sleep(6000);
        changeLogStep.OnChangeLogSubMenu();
    }

    @When("user click on partner dropdown")
    public void whenUserClickOnPartnerDropdown()throws InterruptedException{
        changeLogStep.ClickAndChoosePartnerOnPartnerDropdown();
    }

    @Then("user gets product id and product name list")
    public void thenUserGetsProductIdAndProductNameList()throws InterruptedException{
        Thread.sleep(5000);
        changeLogStep.GetsProductIdAndProductNameList();
    }

    @When("user search correct partner only")
    public void whenUserSearchCorrectPartnerOnly()throws InterruptedException{
        changeLogStep.SearchCorrectPartnerOnly();
    }

    @Then("user gets partner based on partner filter")
    public void thenUserGetsPartnerBasedOnPartnerFilter()throws InterruptedException{
        Thread.sleep(3000);
        changeLogStep.GetsPartnerBasedOnPartnerFilter();
    }

    @When("user write incorrect partner name")
    public void whenUserWriteIncorrectPartnerName()throws InterruptedException{
        Thread.sleep(2000);
        changeLogStep.WriteIncorrectPartnerName();
    }

    @Then("user gets \"sorry, no matching options\" on the dropdown list")
    public void thenGetsNoMatchingOptions(){}

    @When("user choose and write correct product id and product name")
    public void whenUserChooseAndWriteCorrectProductIDAndProductName()throws InterruptedException{
        changeLogStep.ChooseAndWriteCorrectProductIDAndProductName();
    }

    @Then("user gets a partner's product that matches the filter written and selected")
    public void thenUserGetsAPartnersProductThatMatchesTheFilterWrittenAndSelected()throws InterruptedException{
        Thread.sleep(4000);
        changeLogStep.GetsAPartnersProductThatMatchesTheFilterWrittenAndSelected();
    }

    @When("user write incorrect product id and choose correct partner")
    public void whenUserWriteIncorrectProductIDAndChooseCorrectPartner()throws InterruptedException{
        changeLogStep.WriteIncorrectProductIDAndChooseCorrectPartner();
    }

    @Then("user does not get any product in the table")
    public void thenUserDoesNotGetAnyProductInTheTable(){}
}