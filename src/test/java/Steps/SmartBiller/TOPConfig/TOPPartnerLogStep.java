package Steps.SmartBiller.TOPConfig;

import Pages.SmartBiller.TOPConfig.TOPPartnerConfigPage;
import Pages.SmartBiller.TOPConfig.TOPPartnerLogPage;
import net.thucydides.core.steps.ScenarioSteps;

public class TOPPartnerLogStep extends ScenarioSteps {
    TOPPartnerLogPage topPartnerLogPage;
    TOPPartnerConfigPage topPartnerConfigPage;

    public void ClickCancelButton(){
        topPartnerLogPage.ClickCancelButton();
    }

    public void ClickTabTopPartnerLog(){
        topPartnerLogPage.ClickTabTopPartnerLog();
    }

    public void GetDisplayedInAccordanceWithPOsRequested(){
        topPartnerLogPage.GetDisplayedInAccordanceWithPOsRequested();
    }

    public void AlreadyEditTOPPartnerWithNumber(String number)throws InterruptedException{
        topPartnerLogPage.ChangeTOPPartner(number);
        topPartnerConfigPage.ClickOK();
        Thread.sleep(3000);
        topPartnerConfigPage.ClickOKOnSuccessPopUp();
    }

    public void SeeChangeOfThisPartnerIsAtTheTopOfTheList(String number){
        topPartnerLogPage.SeeChangeOfThisPartnerIsAtTheTopOfTheList(number);
    }

    public void SearchCorrectPartner(String partner){
        topPartnerLogPage.SearchCorrectPartner(partner);
        topPartnerLogPage.ClickSearchButton();
    }

    public void GetLogList(String partner){
        topPartnerLogPage.GetLogList(partner);
    }

    public void ClickPage2(){
        topPartnerLogPage.ClickPage2();
    }

    public void GetDefaultPageIsPage1AndGetCorrectPartnerOnTheList(String partner){
        topPartnerLogPage.GetDefaultPageIsPage1AndGetCorrectPartnerOnTheList(partner);
    }

    public void SearchIncorrectPartner(){
        topPartnerLogPage.SearchIncorrectPartner();
    }

    public void FillhePartnerFilterThenClickClearFilter(String partner){
        topPartnerLogPage.SearchCorrectPartner(partner);
        topPartnerLogPage.ClickClearFilterButton();
    }

    public void GetPartnerFilterEmpty(){
        topPartnerLogPage.GetPartnerFilterEmpty();
    }
}