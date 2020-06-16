package Test.Transaction.PendingSummary;

import Steps.Transaction.PendingSummary.RC10Step;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RC10 {
    @Steps
    RC10Step rc10Step;

    @Given("on Pending Summary Page RC 10 Tab Today")
    public void givenOnPendingSummaryPageRC10TabToday()throws InterruptedException{
        rc10Step.OnPendingSummaryPageRC10TabToday();
    }

    @When("user click \"Show detail\" Button")
    public void whenUserClickShowDetailButton()throws InterruptedException{
        Thread.sleep(3000);
        rc10Step.ClickShowDetailButton();
    }

    @Then("user didnt get serial# column")
    public void thenUserDidntGetSerialColumn()throws InterruptedException{
        Thread.sleep(5000);
        rc10Step.DidntGetSerialColumn();
    }

    @Given("on Pending Summary Page RC 10 Tab Yesterday")
    public void givenOnPendingSummaryPageRC10TabYesterday()throws InterruptedException{
        rc10Step.OnPendingSummaryPageRC10TabYesterday();
    }

    @Given("on Pending Summary Page RC 10 Tab Older Than Yesterday")
    public void givenOnPendingSummaryPageRC10TabOlderThanYesterday()throws InterruptedException{
        rc10Step.OnPendingSummaryPageRC10TabOlderThanYesterday();
    }

    @Given("user already have transaction with rc 10 on 00.00 - 07.00")
    public void givenUserAlreadyHaveTrxWithRC10(){}

    @When("user click tab today on rc 10 tab")
    public void whenUserClickTabTodayOnRC10(){}

    @Then("user get list of that transaction")
    public void thenUserGetListOfThatTrx(){}
}