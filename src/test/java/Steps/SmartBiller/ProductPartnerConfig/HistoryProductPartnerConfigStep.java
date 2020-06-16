package Steps.SmartBiller.ProductPartnerConfig;

import Pages.SmartBiller.ProductPartnerConfig.HistoryProductPartnerConfigPage;
import net.thucydides.core.steps.ScenarioSteps;

public class HistoryProductPartnerConfigStep extends ScenarioSteps {
    HistoryProductPartnerConfigPage historyProductPartnerConfigPage;

    public void OnHistoryTabOnProductPartnerConfigSubMenu()throws InterruptedException{
        Thread.sleep(6000);
        historyProductPartnerConfigPage.OnSmartBillerMenu();
        Thread.sleep(2000);
        historyProductPartnerConfigPage.OnProductPartnerConfigSubMenu();
        Thread.sleep(3000);
        historyProductPartnerConfigPage.OnHistoryTab();
    }

    public void FillTheSearchBoxWithCorrectProductIDAndClickNextPage(String product_id)throws InterruptedException{
        historyProductPartnerConfigPage.FillTheSearchBoxWithProductID(product_id);
        Thread.sleep(2000);
        historyProductPartnerConfigPage.ClickNextPage();
    }

    public void GetsNormalListWithMixProductID(String product_id){
        historyProductPartnerConfigPage.GetsNormalListWithMixProductID(product_id);
    }

    public void FillTheSearchBoxWithCorrectProductIDAndClickLastPage(String product_id)throws InterruptedException{
        historyProductPartnerConfigPage.FillTheSearchBoxWithProductID(product_id);
        Thread.sleep(2000);
        historyProductPartnerConfigPage.ClickLastPage();
    }

    public void FillTheSearchBoxWithCorrectProductIDAndClickPreviousPage(String product_id)throws InterruptedException{
        historyProductPartnerConfigPage.ClickNextPage();
        Thread.sleep(3000);
        historyProductPartnerConfigPage.FillTheSearchBoxWithProductID(product_id);
        Thread.sleep(2000);
        historyProductPartnerConfigPage.ClickPreviousPage();
    }

    public void FillTheSearchBoxWithCorrectProductIDAndClickFirstPage(String product_id)throws InterruptedException{
        historyProductPartnerConfigPage.ClickLastPage();
        Thread.sleep(3000);
        historyProductPartnerConfigPage.FillTheSearchBoxWithProductID(product_id);
        Thread.sleep(2000);
        historyProductPartnerConfigPage.ClickFirstPage();
    }

    public void FillPartnerIDOrPartnerNameSearchBox(String partner)throws InterruptedException{
        historyProductPartnerConfigPage.FillPartnerIDOrPartnerNameSearchBox(partner);
        Thread.sleep(2000);
        historyProductPartnerConfigPage.ClickSearchButton();
    }

    public void GetProductInAccordanceWithThePartnerIDOrPartnerNameSearchBox(String partner){
        historyProductPartnerConfigPage.GetProductInAccordanceWithThePartnerIDOrPartnerNameSearchBox(partner);
    }

    public void GetWarningMessageSorryNoMatchingOptions(){}

    public void FillTheSearchBoxWithCorrectProductIDAndPartnerIDOrPartnerName(String product_id, String partner)throws InterruptedException{
        Thread.sleep(3000);
        historyProductPartnerConfigPage.FillTheSearchBoxWithProductID(product_id);
        Thread.sleep(3000);
        historyProductPartnerConfigPage.FillPartnerIDOrPartnerNameSearchBox(partner);
        Thread.sleep(3000);
        historyProductPartnerConfigPage.ClickSearchButton();
    }

    public void GetProductInAccordanceWithTheProductIDAndPartnerIDOrPartnerNameSearchBox(String product_id,String partner)throws InterruptedException{
        Thread.sleep(3000);
        historyProductPartnerConfigPage.GetProductInAccordanceWithThePartnerIDOrPartnerNameSearchBox(partner);
        Thread.sleep(3000);
        historyProductPartnerConfigPage.GetProductInAccordanceWithTheProductID(product_id);
    }

    public void FillTheSearchBoxWithIncorrectProductIDAndCorrectPartnerIDOrPatnerName(String product_id, String partner)throws InterruptedException{
        Thread.sleep(3000);
        historyProductPartnerConfigPage.FillTheSearchBoxWithProductID(product_id);
        Thread.sleep(3000);
        historyProductPartnerConfigPage.FillPartnerIDOrPartnerNameSearchBox(partner);
        Thread.sleep(3000);
        historyProductPartnerConfigPage.ClickSearchButton();
    }

    public void DoesntGetAnyProductPartner(String product_id,String partner){
        historyProductPartnerConfigPage.DoesntGetAnyProductPartner(product_id,partner);
    }

    public void SeeTheIDOfParamUpdatedAt(){
        historyProductPartnerConfigPage.SeeTheIDOfParamUpdatedAt();
    }

    public void GetCorrectID(){
        historyProductPartnerConfigPage.GetCorrectID();
    }
}