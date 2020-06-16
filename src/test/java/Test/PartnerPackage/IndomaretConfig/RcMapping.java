package Test.PartnerPackage.IndomaretConfig;

import Steps.PartnerPackage.IndomaretConfig.RcMappingStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RcMapping {
    @Steps

    RcMappingStep RcMappingStep;

    @Given("user in indomaret configuration page")
    public void userInIndomaretConfigurationPage()throws InterruptedException{
        RcMappingStep.menuPartnerPackage();
        RcMappingStep.subMenuIndomaret();
        Thread.sleep(6000);
    }
    @When("Add Response Code Mapping")
    public void addResponseCodeMapping (){
        RcMappingStep.buttonAdd();
    }
    @When("fill all mandatory field")
    public void fillAllMandatoryField (){
        RcMappingStep.fieldRcPartner();
        RcMappingStep.fieldIndomaret();
    }
    @When("save added rc mapping")
    public void saveAddedRcMapping (){
        RcMappingStep.saveConfig();
    }
    @Then("showing pop up Success Save Indomaret Configuration")
    public void showingPopUpSuccesSaveIndomaretConfiguration(){
        RcMappingStep.popUp();

    }

    @Then("showing pop up Please Fill All Form")
    public void showingPopUpPleaseFillAllForm(){
        RcMappingStep.popUpEror();

    }

    @When("Remove Response Code Mapping")
    public void removeResponseCodeMapping(){
        RcMappingStep.remove();

    }

    @When("save removed rc mapping")
    public void saveRemovedRcMapping () {
        RcMappingStep.saveConfig();
    }

}