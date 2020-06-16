package Steps.Product.ProductApproval;

import Pages.Product.ProductApproval.HistoryProductApprovalPage;
import net.thucydides.core.steps.ScenarioSteps;

public class HistoryProductApprovalStep extends ScenarioSteps {
    HistoryProductApprovalPage historyProductApprovalPage;

    public void OnProductApprovalSubMenu()throws InterruptedException{
        historyProductApprovalPage.OnProductMenu();
        Thread.sleep(5000);
        historyProductApprovalPage.OnProductApprovalSubMenu();
    }

    public void ClickHistoryTab()throws InterruptedException{
        historyProductApprovalPage.OnHistoryTab();
    }

    public void GetsProductIDHeaderChangeToProductCode(){
        historyProductApprovalPage.GetsProductIDHeaderChangeToProductCode();
    }

    public void ClickDetailButton()throws InterruptedException{
        historyProductApprovalPage.ClickDetailButton();
    }

    public void GetsProductIDHeaderChangeToProductCodeOnChangeDetailPopUp(){
        historyProductApprovalPage.GetsProductIDHeaderChangeToProductCodeOnChangeDetailPopUp();
    }
}