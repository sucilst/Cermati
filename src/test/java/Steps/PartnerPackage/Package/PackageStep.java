package Steps.PartnerPackage.Package;

import Pages.PartnerPackage.Package.PackagePage;
import net.thucydides.core.steps.ScenarioSteps;

public class PackageStep extends ScenarioSteps {
    PackagePage packagePage;

    public void OnPartnerPackageSubMenu(){
        packagePage.ClickPartnerPackageMenu();
    }
    public void OnPackageTab(){
        packagePage.ClickPackageTab();
    }

    public void SearchExistingPackageThePackageIs(String param){
        packagePage.SearchPackage(param);
    }

    public void GetsPackageBasedOnSearch(String param){
        packagePage.GetsPackageBasedOnSearch(param);
    }

    public void GetsDisplayOfTheSearchBox(){
        packagePage.GetsDisplayOfTheSearchBox();
    }

    public void FillWordOnSearchBox(String word){
        packagePage.FillWordOnSearchBox(word);
    }

    public void GetsWordOnTheList(String word){
        packagePage.GetsWordOnTheList(word);
    }
}