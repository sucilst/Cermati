package Test.PartnerPackage.PackageApproval;

import Steps.PartnerPackage.PackageApproval.HistoryStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class History {
    @Steps
    HistoryStep historyStep;

    @Given("user on tab history on package approval")
    public void givenUserOnTabHistoryOnPackageApproval()throws InterruptedException{
        Thread.sleep(3000);
        historyStep.OnTabHistoryOnPackageApproval();
    }

    @When("user click \"Detail\" Button")
    public void whenUserClickDetailButton()throws InterruptedException{
        Thread.sleep(4000);
        historyStep.ClickDetailButton();
    }

    @Then("user gets header name of pop up is \"History Change Detail\"")
    public void thenUserGetsHeaderNameOfPopUpIsHistoryChangeDetail()throws InterruptedException{
        Thread.sleep(4000);
        historyStep.GetsHeaderNameOfPopUpIsHistoryChangeDetail();
    }
}
