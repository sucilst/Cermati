package Test.PartnerPackage.PackageApproval;

import Steps.PartnerPackage.PackageApproval.SummaryPackageApprovalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SummaryPackageApproval {
    @Steps
    SummaryPackageApprovalStep summaryPackageApprovalStep;

    @When("user clicks Package Approval")
    public void user_click_Bulk_Update_Product_Package() throws InterruptedException {
        Thread.sleep(2000);
        summaryPackageApprovalStep.click_Bulk_Update_Product_Package();
    }

    @Then("user can see Change Request Summary section")
    public void click_OK() throws InterruptedException {
        Thread.sleep(5000);
        summaryPackageApprovalStep.click_OK();
    }
}
