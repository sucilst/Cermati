package Steps.PartnerPackage.Partner;

import Pages.PartnerPackage.Partner.PartnerPage;
import net.thucydides.core.steps.ScenarioSteps;

public class PartnerStep extends ScenarioSteps {
    PartnerPage partnerPage;

    public void OnPartnerPackageMenu(){
        partnerPage.ClickPartnerPackageMenu();
    }

    public void FillWordInSearchBoxUsingEnterFeature(String word){
        partnerPage.FillWordInSearchBoxUsingEnterFeature(word);
    }

    public void GetsPartnerListContainsWordThatAreWrittenInTheSearchBox(String word){
        partnerPage.GetsPartnerListContainsWordThatAreWrittenInTheSearchBox(word);
    }
}
