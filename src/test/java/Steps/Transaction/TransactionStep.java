package Steps.Transaction;

import Pages.Transaction.TransactionPage;
import net.thucydides.core.steps.ScenarioSteps;

public class TransactionStep extends ScenarioSteps {
    TransactionPage transactionPage;

    public void ClickTransactionMenu(){
        transactionPage.ClickTransactionMenu();
    }

    public void GetsCorrectSubMenu(){
        transactionPage.GetsCorrectSubMenu();
    }
}