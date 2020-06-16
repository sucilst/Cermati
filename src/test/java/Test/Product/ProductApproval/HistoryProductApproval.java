package Test.Product.ProductApproval;

import Steps.Product.ProductApproval.HistoryProductApprovalStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class HistoryProductApproval {

    @Steps
    HistoryProductApprovalStep historyProductApprovalStep;

    @Given("on product approval sub menu")
    public void givenOnProductApprovalSubMenu()throws InterruptedException{
        Thread.sleep(4000);
        historyProductApprovalStep.OnProductApprovalSubMenu();
    }

    @When("user click history tab")
    public void whenUserClickHistoryTab()throws InterruptedException{
        Thread.sleep(3000);
        historyProductApprovalStep.ClickHistoryTab();
    }

    @Then("user gets product id header change to product code")
    public void thenUserGetsProductIDHeaderChangeToProductCode()throws InterruptedException{
        Thread.sleep(4000);
        historyProductApprovalStep.GetsProductIDHeaderChangeToProductCode();
    }

    @Given("on history tab")
    public void givenOnHistoryTab()throws InterruptedException{
        Thread.sleep(3000);
        historyProductApprovalStep.OnProductApprovalSubMenu();
        Thread.sleep(3000);
        historyProductApprovalStep.ClickHistoryTab();
    }

    @When("user click detail button")
    public void whenUserClickDetailButton()throws InterruptedException{
        Thread.sleep(3000);
        historyProductApprovalStep.ClickDetailButton();
    }

    @Then("user gets product id header change to product code on change detail pop up")
    public void thenUserGetsProductIDHeaderChangeToProductCodeOnChangeDetailPopUp()throws InterruptedException{
        Thread.sleep(4000);
        historyProductApprovalStep.GetsProductIDHeaderChangeToProductCodeOnChangeDetailPopUp();
    }
}