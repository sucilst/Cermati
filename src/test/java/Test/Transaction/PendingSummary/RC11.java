package Test.Transaction.PendingSummary;

import Steps.Transaction.PendingSummary.RC11Step;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RC11 {
    @Steps
    RC11Step rc11Step;

    @Given("on Pending Summary Page RC 11 Tab Today")
    public void givenOnPendingSummaryPageRC11TabToday()throws InterruptedException{
        rc11Step.OnPendingSummaryPageRC11TabToday();
    }

    @When("User click \"Show detail\" Button")
    public void whenUserClickShowDetailButton()throws InterruptedException{
        Thread.sleep(3000);
        rc11Step.ClickShowDetailButton();
    }

    @Then("User didnt get serial# column")
    public void thenUserDidntGetSerialColumn()throws InterruptedException{
        Thread.sleep(5000);
        rc11Step.DidntGetSerialColumn();
    }

    @Given("on Pending Summary Page RC 11 Tab Yesterday")
    public void givenOnPendingSummaryPageRC11TabYesterday()throws InterruptedException{
        rc11Step.OnPendingSummaryPageRC11TabYesterday();
    }

    @Given("on Pending Summary Page RC 11 Tab Older Than Yesterday")
    public void givenOnPendingSummaryPageRC11TabOlderThanYesterday()throws InterruptedException{
        rc11Step.OnPendingSummaryPageRC11TabOlderThanYesterday();
    }

    @Given("user already have transaction with rc 11 on 00.00 - 07.00")
    public void givenUserAlreadyHaveTrxWithRC11(){}

    @When("user click tab today on rc 11 tab")
    public void whenUserClickTabTodayOnRC11(){}

    @Then("user get list of this transaction")
    public void thenUserGetListOfThisTrx(){}
}
