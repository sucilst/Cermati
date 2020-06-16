package Test.PartnerPackage.Partner;

import Steps.PartnerPackage.Partner.PartnerStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Partner {

    @Steps
    PartnerStep partnerStep;

    @Given("on partner package menu")
    public void GivenOnPartnerPackageMenu()throws InterruptedException{
        Thread.sleep(3000);
        partnerStep.OnPartnerPackageMenu();
    }

    @When("user fill ([^\"]*) in search box using enter feature")
    public void whenUserFillWordInSearchBoxUsingEnterFeature(String word)throws InterruptedException{
        Thread.sleep(3000);
        partnerStep.FillWordInSearchBoxUsingEnterFeature(word);
    }

    @Then("user gets partner list contains ([^\"]*) that are written in the search box")
    public void thenUserGetsPartnerListContainsWordThatAreWrittenInTheSearchBox(String word)throws InterruptedException{
        Thread.sleep(4000);
        partnerStep.GetsPartnerListContainsWordThatAreWrittenInTheSearchBox(word);
    }
}
