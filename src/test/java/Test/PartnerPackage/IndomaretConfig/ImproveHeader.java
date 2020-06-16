package Test.PartnerPackage.IndomaretConfig;

import Steps.PartnerPackage.IndomaretConfig.ImproveHeaderStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ImproveHeader {
    @Steps
    ImproveHeaderStep ImproveHeaderStep;

    @Given("user in partner package page")
    public void userInPartnerPackagePage ()throws InterruptedException{
        Thread.sleep(6000);
    ImproveHeaderStep.menuPartnerPackage();
        Thread.sleep(6000);
    }

    @When("go to indomaret configuration page")
    public void goToIndomaretConfigPage (){
    ImproveHeaderStep.subMenuIndomaretConfiguration();
    }

    @When("click field RC Alterra")
    public void clickFieldRCAlterra()throws InterruptedException {
        ImproveHeaderStep.buttonAddRC();
        ImproveHeaderStep.fieldRcPartner();
        Thread.sleep(6000);
    }

    @Then("showing RC Alterra in header tabel")
    public void showingRcAlterraInHeaderTabel()throws InterruptedException{
    ImproveHeaderStep.headerRCAlterra();
        Thread.sleep(6000);
    }

    @Then("showing list RC Alterra")
    public void showingListRcAlterra(){
        ImproveHeaderStep.fieldRcPartner();

    }
}
