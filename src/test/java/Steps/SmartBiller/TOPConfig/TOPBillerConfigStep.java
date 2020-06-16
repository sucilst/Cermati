package Steps.SmartBiller.TOPConfig;

import Pages.SmartBiller.TOPConfig.TOPBillerConfigPage;
import net.thucydides.core.steps.ScenarioSteps;

public class TOPBillerConfigStep extends ScenarioSteps {
    TOPBillerConfigPage topBillerConfigPage;

    public void ClickTabTopBillerConfig(){
        topBillerConfigPage.ClickTabTopBillerConfig();
    }

    public void GetDisplayOfTopBillerConfigBasedOnWireframe(){
        topBillerConfigPage.GetDisplayOfTopBillerConfigBasedOnWireframe();
    }

    public void OnTabTopBillerConfig()throws InterruptedException{
        topBillerConfigPage.ClickTabTopBillerConfig();
        Thread.sleep(3000);
        topBillerConfigPage.GetDisplayOfTopBillerConfigBasedOnWireframe();
    }

    public void ClickAddTopBillerConfigButton(){
        topBillerConfigPage.ClickAddTopBillerConfigButton();
    }

    public void GetBillerDropdownAndTopBillerTextField(){
        topBillerConfigPage.GetBillerDropdownAndTopBillerTextField();
    }

    public void OnAddTopBillerConfigPopUp()throws InterruptedException{
        topBillerConfigPage.ClickTabTopBillerConfig();
        Thread.sleep(3000);
        topBillerConfigPage.GetDisplayOfTopBillerConfigBasedOnWireframe();
        topBillerConfigPage.ClickAddTopBillerConfigButton();
        Thread.sleep(3000);
        topBillerConfigPage.GetBillerDropdownAndTopBillerTextField();
    }

    public void SelectBillerTestAndFillTopOfThisBiller(String biller)throws InterruptedException{
        topBillerConfigPage.SelectBiller(biller);
        topBillerConfigPage.FillTOPBiller();
        topBillerConfigPage.ClickOKButton();
        Thread.sleep(3000);
        topBillerConfigPage.ClickOKButtonOnSuccessPopUp();
    }

    public void GetNewTopBillerConfig(String biller){
        topBillerConfigPage.GetNewTopBillerConfig(biller);
    }

    public void ClickEditButtonAtTheTopOfTheList(){
        topBillerConfigPage.ClickEditButtonAtTheTopOfTheList();
    }

    public void GetCorrectBillerAndTopBillerTextField(){
        topBillerConfigPage.GetCorrectBillerAndTopBillerTextField();
    }

    public void OnEditTopBillerConfigPopUp()throws InterruptedException{
        topBillerConfigPage.ClickTabTopBillerConfig();
        Thread.sleep(3000);
        topBillerConfigPage.GetDisplayOfTopBillerConfigBasedOnWireframe();
        topBillerConfigPage.ClickEditButtonAtTheTopOfTheList();
        Thread.sleep(3000);
        topBillerConfigPage.GetCorrectBillerAndTopBillerTextField();
    }

    public void ChangeTheTopBiller()throws InterruptedException{
        topBillerConfigPage.FillTOPBiller();
        topBillerConfigPage.ClickOKButton();
        Thread.sleep(3000);
        topBillerConfigPage.ClickOKButtonOnSuccessPopUp();
    }

    public void GetChangeOnTopThisChosenBiller(){
        topBillerConfigPage.GetChangeOnTopThisChosenBiller();
    }
}