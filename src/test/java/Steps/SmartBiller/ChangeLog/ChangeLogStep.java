package Steps.SmartBiller.ChangeLog;

import Pages.SmartBiller.ChangeLog.ChangeLogPage;
import cucumber.api.java.en.Then;
import net.thucydides.core.steps.ScenarioSteps;

public class ChangeLogStep extends ScenarioSteps {
    ChangeLogPage changeLogPage;

    public void OnSmartBillerMenu()throws InterruptedException{
        changeLogPage.OnSmartBillerMenu();
    }

    public void OnChangeLogSubMenu(){
        changeLogPage.OnChangeLogSubMenu();
    }

    public void ClickAndChoosePartnerOnPartnerDropdown()throws InterruptedException{
        Thread.sleep(2000);
        changeLogPage.ClickAndChoosePartnerOnPartnerDropdown();
    }

    public void GetsProductIdAndProductNameList(){
        changeLogPage.GetsProductIdAndProductNameList();
    }

    public void SearchCorrectPartnerOnly()throws InterruptedException{
        Thread.sleep(2000);
        changeLogPage.ClickAndChoosePartnerOnPartnerDropdown();
        Thread.sleep(2000);
        changeLogPage.ClickSearchButton();
    }

    public void GetsPartnerBasedOnPartnerFilter(){
        changeLogPage.GetsPartnerBasedOnPartnerFilter();
    }

    public void WriteIncorrectPartnerName(){
        changeLogPage.WriteIncorrectPartnerName();
    }

    public void ChooseAndWriteCorrectProductIDAndProductName()throws InterruptedException{
        Thread.sleep(2000);
        changeLogPage.WriteCorrectProductID();
        Thread.sleep(2000);
        changeLogPage.ClickAndChoosePartnerOnPartnerDropdown();
        Thread.sleep(2000);
        changeLogPage.ClickSearchButton();
    }

    public void GetsAPartnersProductThatMatchesTheFilterWrittenAndSelected(){
        changeLogPage.GetsAPartnersProductThatMatchesTheFilterWrittenAndSelected();
    }

    public void WriteIncorrectProductIDAndChooseCorrectPartner()throws InterruptedException{
        Thread.sleep(2000);
        changeLogPage.WriteIncorrectProductID();
        Thread.sleep(2000);
        changeLogPage.ClickAndChoosePartnerOnPartnerDropdown();
        Thread.sleep(2000);
        changeLogPage.ClickSearchButton();
    }
}