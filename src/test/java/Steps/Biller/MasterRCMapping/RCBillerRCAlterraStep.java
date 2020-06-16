package Steps.Biller.MasterRCMapping;

import Pages.Biller.MasterRCMapping.RCBillerRCAlterraPage;
import net.thucydides.core.steps.ScenarioSteps;

public class RCBillerRCAlterraStep extends ScenarioSteps {
    RCBillerRCAlterraPage rcBillerRCAlterraPage;

    public void OnMasterRCMappingSubMenuRCBillerRCAlterraTab()throws InterruptedException{
        rcBillerRCAlterraPage.OnBillerMenu();
        Thread.sleep(4000);
        rcBillerRCAlterraPage.OnRCBillerRCAlterraTab();
    }

    public void ClickLogButton(){
        rcBillerRCAlterraPage.ClickLogButton();
    }

    public void GetDisplayMustBeTheSameAsTheProductOwnersRequested(){
        rcBillerRCAlterraPage.GetDisplayMustBeTheSameAsTheProductOwnersRequested();
    }

    public void Get5LastChangeRCMapping(){
        rcBillerRCAlterraPage.Get5LastChangeRCMapping();
    }
}