package Steps.PartnerPackage.IndomaretConfig;

import Pages.PartnerPackage.IndomaretConfig.ImproveHeaderPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ImproveHeaderStep extends ScenarioSteps {
    ImproveHeaderPage ImproveHeaderPage;

    public void menuPartnerPackage (){
        ImproveHeaderPage.partnerPackageMenu();
    }
    public void subMenuIndomaretConfiguration (){
        ImproveHeaderPage.submenuIndomaretConfig();
    }
    public void buttonAddRC (){
        ImproveHeaderPage.buttonAddConfig();
    }
    public void fieldRcPartner (){
        ImproveHeaderPage.inputRcAlterra();
    }
    public void headerRCAlterra (){
        ImproveHeaderPage.RcAlterraHeader();
    }

}
