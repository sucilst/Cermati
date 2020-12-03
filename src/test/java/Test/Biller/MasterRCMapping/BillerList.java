package Test.Biller.MasterRCMapping;

import Steps.Biller.MasterRCMapping.BillerListStep;
import Steps.PartnerPackage.Package.BulkUpdatePackageStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class BillerList {
    @Steps
    BillerListStep billerListStep;

    @Given("Already on Biller List page")
    public void userAlreadyLoggedInToSentinel() {
        billerListStep.clickBiller();
    }

    @When("Write biller name, biller label, and biller description for ([^\"]*)")
    public void clickAddBiller(String action) {
        billerListStep.fieldForm(action);
    }

    @Then("data ([^\"]*) added successfully")
    public void checkData(String action) {
        billerListStep.checkData(action);
    }
}
