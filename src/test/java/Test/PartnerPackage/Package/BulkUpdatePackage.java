package Test.PartnerPackage.Package;

import Steps.PartnerPackage.Package.BulkUpdatePackageStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BulkUpdatePackage {
    @Steps
    BulkUpdatePackageStep bulkUpdatePackageStep;

    @Given("Already on Partner-Package page")
    public void userAlreadyLoggedInToSentinel() {
        bulkUpdatePackageStep.clickPartnerPackage();
    }

    @When("Click Package")
    public void clickPackage() {
        bulkUpdatePackageStep.clickPackage();
    }

    @When("Click Bulk Update Product-Package")
    public void clickBulkUpdateProductPackage() {
        bulkUpdatePackageStep.clickBulkUpdate();
    }

    @When("Choose file in CSV File Coloumn for ([^\"]*)")
    public void chooseFileInCSVFileColoumn(String action){
        bulkUpdatePackageStep.uploadFile(action);
    }

    @When("Click ([^\"]*) button")
    public void clickButton(String action) {
        bulkUpdatePackageStep.buttonAction(action);
    }

    @When("Clik ([^\"]*) button for permission")
    public void clickButtonPermission(String action) {
        bulkUpdatePackageStep.buttonPermission(action);
    }

    @Then("Package updated successfully")
    public void packageUpdatedSuccessfully() {
    }
}
