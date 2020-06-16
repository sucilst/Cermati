package Steps.PartnerPackage.PackageApproval;

import Pages.PartnerPackage.PackageApproval.HistoryPage;
import net.thucydides.core.steps.ScenarioSteps;

public class HistoryStep extends ScenarioSteps {

    HistoryPage historyPage;

    public void OnTabHistoryOnPackageApproval()throws InterruptedException{
        historyPage.clickPartnerPackageMenu();
        Thread.sleep(3000);
        historyPage.clickPackageApprovalSubMenu();
        Thread.sleep(3000);
        historyPage.clickHistoryTab();
    }

    public void ClickDetailButton(){
        historyPage.ClickDetailButton();
    }

    public void GetsHeaderNameOfPopUpIsHistoryChangeDetail(){
        historyPage.GetsHeaderNameOfPopUpIsHistoryChangeDetail();
    }
}
