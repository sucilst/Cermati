package Steps.SmartBiller.ProductBillerConfig;

import Pages.SmartBiller.ProductBillerConfig.HistoryProductBillerConfigPage;
import net.thucydides.core.steps.ScenarioSteps;

public class HistoryProductBillerConfigStep extends ScenarioSteps {
    HistoryProductBillerConfigPage historyProductBillerConfigPage;

    public void OnHistoryTabProductBillerConfigSubMenu()throws InterruptedException{
        Thread.sleep(6000);
        historyProductBillerConfigPage.OnSmartBillerMenu();
        Thread.sleep(2000);
        historyProductBillerConfigPage.OnProductBillerConfigSubMenu();
        Thread.sleep(3000);
        historyProductBillerConfigPage.OnHistoryTab();
    }

    public void FillTheSearchBoxWithBillerIDOrBillerName(String biller)throws InterruptedException{
        historyProductBillerConfigPage.FillTheSearchBoxWithBillerIDOrBillerName(biller);
        Thread.sleep(2000);
        historyProductBillerConfigPage.ClickSearchButton();
    }

    public void GetProductBillerInAccordanceWithTheSearchBox(String biller){
        historyProductBillerConfigPage.GetProductBillerInAccordanceWithTheSearchBox(biller);
    }

    public void FillTheSearchBoxWithProductIDAndBillerIDOrBillerName(String product_id, String biller)throws InterruptedException{
        historyProductBillerConfigPage.FillProductID(product_id);
        Thread.sleep(2000);
        historyProductBillerConfigPage.FillTheSearchBoxWithBillerIDOrBillerName(biller);
        Thread.sleep(2000);
        historyProductBillerConfigPage.ClickSearchButton();
    }

    public void GetProductBillerInAccordanceWithTheProductIDAndBillerName(String product_id, String biller){
        historyProductBillerConfigPage.GetProductBillerInAccordanceWithTheProductIDAndBillerName(product_id,biller);
    }

    public void DoesntGetAnyProductBiller(String product_id, String biller){
        historyProductBillerConfigPage.DoesntGetAnyProductBiller(product_id,biller);
    }
}