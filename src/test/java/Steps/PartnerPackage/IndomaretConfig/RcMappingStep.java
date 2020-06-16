package Steps.PartnerPackage.IndomaretConfig;

import Pages.PartnerPackage.IndomaretConfig.RcMappingPage;
import net.thucydides.core.steps.ScenarioSteps;

public class RcMappingStep extends ScenarioSteps {
   RcMappingPage RcMappingPage;

    public void menuPartnerPackage (){
        RcMappingPage.partnerMenu();
    }
    public void subMenuIndomaret (){
        RcMappingPage.submenuIndomaret();
    }
    public void buttonAdd (){
        RcMappingPage.buttonAddConfig();
    }
    public void fieldRcPartner (){
        RcMappingPage.inputPartner();
    }
    public void fieldIndomaret(){
        RcMappingPage.inputRcIndomaret();
    }
    public void saveConfig(){
        RcMappingPage.clickButtonSave();
    }
    public void popUp (){
        RcMappingPage.popUpSave();
    }
    public void popUpEror(){
        RcMappingPage.popUpEror();
    }

    public void remove(){RcMappingPage.removeButton();}
}
