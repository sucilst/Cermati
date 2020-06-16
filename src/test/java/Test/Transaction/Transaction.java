package Test.Transaction;

import Steps.Transaction.TransactionStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Transaction {
    @Steps
    TransactionStep transactionStep;

    @Given("on sentinel dashboard")
    public void givenOnSentinelDashboard(){}

    @When("user click \"Transaction\" Menu")
    public void whenUserClickTransactionMenu()throws InterruptedException{
        Thread.sleep(6000);
        transactionStep.ClickTransactionMenu();
    }

    @Then("user gets \"Pending Summary\", \"Bulk Update\", \"Quarantine\" and \"Reversal\" Sub Menu")
    public void thenUserGetsCorrectSubMenu()throws InterruptedException{
        Thread.sleep(15000);
        transactionStep.GetsCorrectSubMenu();
    }
}