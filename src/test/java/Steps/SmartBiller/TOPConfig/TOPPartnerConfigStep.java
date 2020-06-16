package Steps.SmartBiller.TOPConfig;

import Pages.SmartBiller.TOPConfig.TOPPartnerConfigPage;
import net.thucydides.core.steps.ScenarioSteps;

public class TOPPartnerConfigStep extends ScenarioSteps {
    TOPPartnerConfigPage topPartnerConfigPage;

    public void OnTopConfigSubMenu()throws InterruptedException{
        topPartnerConfigPage.OnTopConfigSubMenu();
    }

    public void ClickTabTopPartnerConfig(){
        topPartnerConfigPage.ClickTabTopPartnerConfig();
    }

    public void GetDisplayBasedOnWireframe(){
        topPartnerConfigPage.GetDisplayBasedOnWireframe();
    }

    public void OnTabTopPartnerConfig()throws InterruptedException{
        topPartnerConfigPage.OnTopConfigSubMenu();
        topPartnerConfigPage.ClickTabTopPartnerConfig();
        topPartnerConfigPage.GetDisplayBasedOnWireframe();
    }

    public void ClickAddTopPartnerConfigPopUp(){
        topPartnerConfigPage.ClickAddTopPartnerConfigPopUp();
    }

    public void GetPartnerDropdownAndTopPartnerTextField(){
        topPartnerConfigPage.GetPartnerDropdownAndTopPartnerTextField();
    }

    public void OnAddTopPartnerConfigPopUp()throws InterruptedException{
        topPartnerConfigPage.OnTopConfigSubMenu();
        topPartnerConfigPage.ClickTabTopPartnerConfig();
        topPartnerConfigPage.GetDisplayBasedOnWireframe();
        topPartnerConfigPage.ClickAddTopPartnerConfigPopUp();
        topPartnerConfigPage.GetPartnerDropdownAndTopPartnerTextField();
    }

    public void SelectPartnerAndFillTopOfThisPartner(String partner, String TOP){
        topPartnerConfigPage.SelectPartner(partner);
        topPartnerConfigPage.FillTOPPartner(TOP);
        topPartnerConfigPage.ClickOK();
    }

    public void GetNewTopPartnerConfigOnTheTopOfTheTableList(String partner, String top){
        topPartnerConfigPage.GetNewTopPartnerConfigOnTheTopOfTheTableList(partner,top);
    }

    public void ClickEditButtonOnOneOfTheRowInTheList(){
        topPartnerConfigPage.ClickEditButtonOnOneOfTheRowInTheList();
    }

    public void GetCorrectPartnerAndTopPartnerTextField(){
        topPartnerConfigPage.GetCorrectPartnerAndTopPartnerTextField();
    }

    public void OnEditTopPartnerConfigPopUp()throws InterruptedException{
        topPartnerConfigPage.OnTopConfigSubMenu();
        topPartnerConfigPage.ClickTabTopPartnerConfig();
        topPartnerConfigPage.GetDisplayBasedOnWireframe();
        topPartnerConfigPage.ClickEditButtonOnOneOfTheRowInTheList();
        topPartnerConfigPage.GetCorrectPartnerAndTopPartnerTextField();
    }

    public void ChangeTheTopPartner()throws InterruptedException{
        topPartnerConfigPage.ChangeTOPPartner();
        topPartnerConfigPage.ClickOK();
        Thread.sleep(3000);
        topPartnerConfigPage.ClickOKOnSuccessPopUp();
    }

    public void GetChangeOnTopThisChosenPartner(){
        topPartnerConfigPage.GetChangeOnTopThisChosenPartner();
    }
}