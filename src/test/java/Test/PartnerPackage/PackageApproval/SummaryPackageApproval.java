package Test.PartnerPackage.PackageApproval;

import Steps.PartnerPackage.PackageApproval.SummaryPackageApprovalStep;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SummaryPackageApproval {
    @Steps
    SummaryPackageApprovalStep summaryPackageApprovalStep;

    @When("user click Bulk Update Product-Package")
    public void user_click_Bulk_Update_Product_Package() throws InterruptedException {
        Thread.sleep(2000);
        summaryPackageApprovalStep.click_Bulk_Update_Product_Package();
    }

    @When("user enter the CSV file")
    public void user_enter_the_CSV_file() throws InterruptedException {
        Thread.sleep(10000);
        summaryPackageApprovalStep.enter_the_CSV_file();
    }

    @When("click OK")
    public void click_OK() {
        summaryPackageApprovalStep.click_OK();
    }

    @Then("bulk change request are waiting for approval")
    public void bulk_change_request_are_waiting_for_approval() {

    }
}
