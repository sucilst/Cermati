package Test.PartnerPackage.Package;

import Steps.PartnerPackage.Package.PackageStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Package {

    @Steps
    PackageStep packageStep;

    @Given("on package tab on partner package sub menu")
    public void givenOnPackageTabOnPartnerPackageSubMenu()throws InterruptedException{
        Thread.sleep(3000);
        packageStep.OnPartnerPackageSubMenu();
        packageStep.OnPackageTab();
        Thread.sleep(5000);
    }

    @When("user search existing package, the packaged is ([^\"]*)")
    public void whenUserSearchExistingPackageThePackageIs(String param)throws InterruptedException{
        Thread.sleep(5000);
        packageStep.SearchExistingPackageThePackageIs(param);
    }

    @Then("user gets package based on search box that is ([^\"]*)")
    public void thenUserGetsPackageBasedOnSearch(String param)throws InterruptedException{
        Thread.sleep(4000);
        packageStep.GetsPackageBasedOnSearch(param);
    }

    @Given("on partner package sub menu")
    public void givenOnPartnerPackageSubMenu()throws InterruptedException{
        Thread.sleep(3000);
        packageStep.OnPartnerPackageSubMenu();
    }

    @When("user click package tab")
    public void whenUserClickPackageTab()throws InterruptedException{
        Thread.sleep(3000);
        packageStep.OnPackageTab();
    }

    @Then("user gets display of the search box")
    public void thenUserGetsDisplayOfTheSearchBox()throws InterruptedException{
        Thread.sleep(3000);
        packageStep.GetsDisplayOfTheSearchBox();
    }

    @When("user fill ([^\"]*) on search box")
    public void whenUserFillWordOnSearchBox(String word)throws InterruptedException{
        Thread.sleep(3000);
        packageStep.FillWordOnSearchBox(word);
    }

    @Then("user gets ([^\"]*) on the list")
    public void thenUserGetsWordOnTheList(String word)throws InterruptedException{
        Thread.sleep(3000);
        packageStep.GetsWordOnTheList(word);
    }
}