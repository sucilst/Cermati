package Steps.Transaction.PendingSummary;

import Pages.Transaction.PendingSummary.RC10Page;
import Pages.Transaction.TransactionPage;
import net.thucydides.core.steps.ScenarioSteps;

public class RC10Step extends ScenarioSteps {
    RC10Page rc10Page;
    TransactionPage transactionPage;

    public void OnPendingSummaryPageRC10TabToday()throws InterruptedException{
        Thread.sleep(6000);
        transactionPage.ClickTransactionMenu();
        Thread.sleep(15000);
        transactionPage.GetsCorrectSubMenu();
        rc10Page.ClickPendingSummarySubMenu();
        Thread.sleep(4000);
        rc10Page.RC10TabTodayAppears();
    }

    public void ClickShowDetailButton(){
        rc10Page.ClickShowDetailButton();
    }

    public void DidntGetSerialColumn(){
        rc10Page.DidntGetSerialColumn();
    }

    public void OnPendingSummaryPageRC10TabYesterday()throws InterruptedException{
        Thread.sleep(6000);
        transactionPage.ClickTransactionMenu();
        Thread.sleep(15000);
        transactionPage.GetsCorrectSubMenu();
        rc10Page.ClickPendingSummarySubMenu();
        Thread.sleep(4000);
        rc10Page.ClickTabYesterdayOnRC10Tab();
        Thread.sleep(3000);
        rc10Page.RC10TabYesterdayAppears();
    }

    public void OnPendingSummaryPageRC10TabOlderThanYesterday()throws InterruptedException{
        Thread.sleep(6000);
        transactionPage.ClickTransactionMenu();
        Thread.sleep(15000);
        transactionPage.GetsCorrectSubMenu();
        rc10Page.ClickPendingSummarySubMenu();
        Thread.sleep(4000);
        rc10Page.ClickTabOlderThanYesterdayOnRC10Tab();
        Thread.sleep(3000);
        rc10Page.RC10TabOlderThanYesterdayAppears();
    }
}