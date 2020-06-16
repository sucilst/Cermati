package Test.Transaction.Reversal;

import Steps.Transaction.Reversal.ReversalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Reversal {
    @Steps
    ReversalStep reversalStep;

    @Given("on Transaction Menu")
    public void givenOnTransactionMenu()throws InterruptedException{
        Thread.sleep(4000);
        reversalStep.OnTransactionMenu();
    }

    @When("user click \"Reversal\" Sub Menu")
    public void whenUserClickReversalSubMenu()throws InterruptedException{
        Thread.sleep(15000);
        reversalStep.ClickReversalSubMenu();
    }

    @Then("user gets header title is \"Reversal\"")
    public void thenUserGetsHeaderTitleIsReversal()throws InterruptedException{
        Thread.sleep(15000);
        reversalStep.GetsHeaderTitleIsReversal();
    }
}