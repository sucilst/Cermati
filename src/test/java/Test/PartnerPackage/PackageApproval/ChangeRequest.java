package Test.PartnerPackage.PackageApproval;

import Steps.PartnerPackage.PackageApproval.ChangeRequestStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ChangeRequest {
    @Steps
    ChangeRequestStep changeRequestStep;

    @Given("on package approval sub menu")
    public void givenOnPackageApprovalSubMenu()throws InterruptedException{
        Thread.sleep(3000);
        changeRequestStep.OnPackageApprovalSubMenu();
    }

    @When("user click review button")
    public void whenUserClickReviewButton()throws InterruptedException{
        Thread.sleep(4000);
        changeRequestStep.ClickReviewButton();
    }

    @Then("user get contents of status header are enabled or disabled")
    public void thenUserGetContentsOfStatusHeaderAreEnabledOrDisabled()throws InterruptedException{
        Thread.sleep(4000);
        changeRequestStep.GetContentsOfStatusHeaderAreEnabledOrDisabled();
    }

    @Then("user gets contents of validation header are valid or invalid")
    public void thenUserGetContentsOfValidationHeaderAreValidOrInvalid()throws InterruptedException{
        Thread.sleep(4000);
        changeRequestStep.GetContentsOfValidationHeaderAreValidOrInvalid();
    }
}
