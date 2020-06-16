package Steps.Transaction.PendingSummary;

import Pages.Transaction.PendingSummary.RC10Page;
import Pages.Transaction.PendingSummary.RC11Page;
import Pages.Transaction.TransactionPage;
import net.thucydides.core.steps.ScenarioSteps;

public class RC11Step extends ScenarioSteps {
    RC10Page rc10Page;
    TransactionPage transactionPage;
    RC11Page rc11Page;

    public void OnPendingSummaryPageRC11TabToday()throws InterruptedException{
        Thread.sleep(6000);
        transactionPage.ClickTransactionMenu();
        Thread.sleep(15000);
        transactionPage.GetsCorrectSubMenu();
        rc10Page.ClickPendingSummarySubMenu();
        Thread.sleep(4000);
        rc11Page.ClickRC11Tab();
        Thread.sleep(4000);
        rc11Page.RC11TabTodayAppears();
    }

    public void ClickShowDetailButton(){
        rc10Page.ClickShowDetailButton();
    }

    public void DidntGetSerialColumn(){
        rc10Page.DidntGetSerialColumn();
    }

    public void OnPendingSummaryPageRC11TabYesterday()throws InterruptedException{
        Thread.sleep(6000);
        transactionPage.ClickTransactionMenu();
        Thread.sleep(15000);
        transactionPage.GetsCorrectSubMenu();
        rc10Page.ClickPendingSummarySubMenu();
        Thread.sleep(4000);
        rc11Page.ClickRC11Tab();
        Thread.sleep(4000);
        rc11Page.ClickTabYesterdayOnRC11Tab();
        Thread.sleep(3000);
        rc11Page.RC11TabYesterdayAppears();
    }

    public void OnPendingSummaryPageRC11TabOlderThanYesterday()throws InterruptedException{
        Thread.sleep(6000);
        transactionPage.ClickTransactionMenu();
        Thread.sleep(15000);
        transactionPage.GetsCorrectSubMenu();
        rc10Page.ClickPendingSummarySubMenu();
        Thread.sleep(4000);
        rc11Page.ClickRC11Tab();
        Thread.sleep(4000);
        rc11Page.ClickTabOlderThanYesterdayOnRC11Tab();
        Thread.sleep(3000);
        rc11Page.RC11TabOlderThanYesterdayAppears();
    }
}