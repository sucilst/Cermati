package Pages.Transaction.PendingSummary;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class RC11Page extends PageObject {

    @FindBy(id = "rc-11___BV_tab_button__")
    WebElement RC11_TAB;

    @FindBy(id = "rd-11_today___BV_tab_button__")
    WebElement TODAY_TAB_ON_RC11;

    @FindBy(id = "rc-11_yesterday___BV_tab_button__")
    WebElement YESTERDAY_TAB_ON_RC11;

    @FindBy(id = "rc-11_moreyesterday___BV_tab_button__")
    WebElement OLDER_THAN_YESTERDAY_TAB_ON_RC11;

    @FindBy(xpath = "(//span[text()='Show detail'])[last()]")
    WebElement SHOW_DETAIL_BUTTON;

    public void ClickRC11Tab(){
        RC11_TAB.click();
    }

    public void RC11TabTodayAppears()throws InterruptedException{
        Assert.assertTrue(RC11_TAB.isDisplayed());
        Assert.assertEquals("RC 11",RC11_TAB.getText());
        Assert.assertTrue(TODAY_TAB_ON_RC11.isDisplayed());
        Assert.assertEquals("Today",TODAY_TAB_ON_RC11.getText());
        Thread.sleep(4000);
        Assert.assertTrue(SHOW_DETAIL_BUTTON.isDisplayed());
        Assert.assertEquals("Show detail",SHOW_DETAIL_BUTTON.getText());
    }

    public void ClickTabYesterdayOnRC11Tab(){
        YESTERDAY_TAB_ON_RC11.click();
    }

    public void RC11TabYesterdayAppears()throws InterruptedException{
        Assert.assertTrue(RC11_TAB.isDisplayed());
        Assert.assertEquals("RC 11",RC11_TAB.getText());
        Assert.assertTrue(YESTERDAY_TAB_ON_RC11.isDisplayed());
        Assert.assertEquals("Yesterday",YESTERDAY_TAB_ON_RC11.getText());
        Thread.sleep(4000);
        Assert.assertTrue(SHOW_DETAIL_BUTTON.isDisplayed());
        Assert.assertEquals("Show detail",SHOW_DETAIL_BUTTON.getText());
    }

    public void ClickTabOlderThanYesterdayOnRC11Tab(){
        OLDER_THAN_YESTERDAY_TAB_ON_RC11.click();
    }

    public void RC11TabOlderThanYesterdayAppears()throws InterruptedException{
        Assert.assertTrue(RC11_TAB.isDisplayed());
        Assert.assertEquals("RC 11",RC11_TAB.getText());
        Assert.assertTrue(OLDER_THAN_YESTERDAY_TAB_ON_RC11.isDisplayed());
        Assert.assertEquals("Older Than Yesterday",OLDER_THAN_YESTERDAY_TAB_ON_RC11.getText());
        Thread.sleep(4000);
        Assert.assertTrue(SHOW_DETAIL_BUTTON.isDisplayed());
        Assert.assertEquals("Show detail",SHOW_DETAIL_BUTTON.getText());
    }
}