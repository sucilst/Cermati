package Pages.Transaction.PendingSummary;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class RC10Page extends PageObject {
    @FindBy(id = "qe_pending-summary")
    WebElement PENDING_SUMMARY_SUB_MENU;

    @FindBy(id = "rc-10___BV_tab_button__")
    WebElement RC10_TAB;

    @FindBy(id = "rd-10_today___BV_tab_button__")
    WebElement TODAY_TAB_ON_RC10;

    @FindBy(xpath = "(//span[text()='Show detail'])[last()]")
    WebElement SHOW_DETAIL_BUTTON;

    @FindBy(xpath = "//div[@class='container-table']")
    WebElement DETAILS_TABLE;

    @FindBy(id = "rc-10_yesterday___BV_tab_button__")
    WebElement YESTERDAY_TAB_ON_RC10;

    @FindBy(id = "rc-10_moreyesterday___BV_tab_button__")
    WebElement OLDER_THAN_YESTERDAY_TAB;

    public void ClickPendingSummarySubMenu(){
        PENDING_SUMMARY_SUB_MENU.click();
    }

    public void RC10TabTodayAppears()throws InterruptedException{
        Assert.assertTrue(RC10_TAB.isDisplayed());
        Assert.assertEquals("RC 10",RC10_TAB.getText());
        Assert.assertTrue(TODAY_TAB_ON_RC10.isDisplayed());
        Assert.assertEquals("Today",TODAY_TAB_ON_RC10.getText());
        Thread.sleep(4000);
        Assert.assertTrue(SHOW_DETAIL_BUTTON.isDisplayed());
        Assert.assertEquals("Show detail",SHOW_DETAIL_BUTTON.getText());
    }

    public void ClickShowDetailButton(){
        SHOW_DETAIL_BUTTON.click();
    }

    public void DidntGetSerialColumn(){
        Assert.assertEquals(false,DETAILS_TABLE.getText().contains("Serial#"));
    }

    public void ClickTabYesterdayOnRC10Tab(){
        YESTERDAY_TAB_ON_RC10.click();
    }

    public void RC10TabYesterdayAppears()throws InterruptedException{
        Assert.assertTrue(RC10_TAB.isDisplayed());
        Assert.assertEquals("RC 10",RC10_TAB.getText());
        Assert.assertTrue(YESTERDAY_TAB_ON_RC10.isDisplayed());
        Assert.assertEquals("Yesterday",YESTERDAY_TAB_ON_RC10.getText());
        Thread.sleep(4000);
        Assert.assertTrue(SHOW_DETAIL_BUTTON.isDisplayed());
        Assert.assertEquals("Show detail",SHOW_DETAIL_BUTTON.getText());
    }

    public void ClickTabOlderThanYesterdayOnRC10Tab(){
        OLDER_THAN_YESTERDAY_TAB.click();
    }

    public void RC10TabOlderThanYesterdayAppears()throws InterruptedException{
        Assert.assertTrue(RC10_TAB.isDisplayed());
        Assert.assertEquals("RC 10",RC10_TAB.getText());
        Assert.assertTrue(OLDER_THAN_YESTERDAY_TAB.isDisplayed());
        Assert.assertEquals("Older Than Yesterday",OLDER_THAN_YESTERDAY_TAB.getText());
        Thread.sleep(4000);
        Assert.assertTrue(SHOW_DETAIL_BUTTON.isDisplayed());
        Assert.assertEquals("Show detail",SHOW_DETAIL_BUTTON.getText());
    }
}