package Steps.SmartBiller.TOPConfig;

import Pages.SmartBiller.TOPConfig.TOPBillerConfigPage;
import Pages.SmartBiller.TOPConfig.TOPBillerLogPage;
import net.thucydides.core.steps.ScenarioSteps;

public class TOPBillerLogStep extends ScenarioSteps {
    TOPBillerLogPage topBillerLogPage;
    TOPBillerConfigPage topBillerConfigPage;

    public void ClickCancelButton(){
        topBillerLogPage.ClickCancelButton();
    }

    public void ClickTabTopBillerLog(){
        topBillerLogPage.ClickTabTopPartnerLog();
    }

    public void GetDisplayedInAccordanceWithPOsRequested(){
        topBillerLogPage.GetDisplayedInAccordanceWithPOsRequested();
    }

    public void AlreadyEditTOPBillerWithNumber(String number)throws InterruptedException{
        topBillerLogPage.ChangeTOPBiller(number);
        topBillerConfigPage.ClickOKButton();
        Thread.sleep(3000);
        topBillerConfigPage.ClickOKButtonOnSuccessPopUp();
    }

    public void SeeChangeOfThisBillerIsAtTheTopOfTheList(String number){
        topBillerLogPage.SeeChangeOfThisBillerIsAtTheTopOfTheList(number);
    }

    public void SearchCorrectBiller(String biller){
        topBillerLogPage.SearchCorrectBiller(biller);
        topBillerLogPage.ClickSearchButton();
    }

    public void GetLogList(String biller){
        topBillerLogPage.GetLogList(biller);
    }

    public void ClickPage2(){
        topBillerLogPage.ClickPage2();
    }

    public void GetDefaultPageIsPage1AndGetCorrectBillerOnTheList(String biller){
        topBillerLogPage.GetDefaultPageIsPage1AndGetCorrectBillerOnTheList(biller);
    }

    public void SearchIncorrectBiller(){
        topBillerLogPage.SearchIncorrectBiller();
    }

    public void FillheBillerFilterThenClickClearFilter(String biller){
        topBillerLogPage.SearchCorrectBiller(biller);
        topBillerLogPage.ClickClearFilterButton();
    }

    public void GetBillerFilterEmpty(){
        topBillerLogPage.GetBillerFilterEmpty();
    }
}