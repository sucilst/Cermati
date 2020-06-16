package Steps.Transaction.Reversal;

import Pages.Transaction.Reversal.ReversalPage;
import Pages.Transaction.TransactionPage;
import net.thucydides.core.steps.ScenarioSteps;

public class ReversalStep extends ScenarioSteps {
    TransactionPage transactionPage;
    ReversalPage reversalPage;

    public void OnTransactionMenu()throws InterruptedException{
        transactionPage.ClickTransactionMenu();
        Thread.sleep(15000);
        transactionPage.GetsCorrectSubMenu();
    }

    public void ClickReversalSubMenu(){
        reversalPage.ClickReversalSubMenu();
    }

    public void GetsHeaderTitleIsReversal(){
        reversalPage.GetsHeaderTitleIsReversal();
    }
}