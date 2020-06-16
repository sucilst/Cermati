package Pages.PartnerPackage.Partner;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PartnerPage extends PageObject {
    @FindBy(id = "qe_partner-package")
    WebElement PARTNER_PACKAGE_MENU;

    @FindBy(id = "partner_package-partner___BV_tab_button__")
    WebElement PARTNER_TAB;

    @FindBy(id = "qe_package___BV_tab_button__")
    WebElement PACKAGE_TAB;

    @FindBy(id = "partner_package-archived_partner___BV_tab_button__")
    WebElement ARCHIVED_PARTNER_TAB;

    @FindBy(xpath = "//input[@placeholder='By Name / VA Number']")
    WebElement SEARCH_BOX;

    @FindBy(xpath = "//table[starts-with(@id,'__BVID__')]")
    WebElement TABLE_PARTNER;

    public void ClickPartnerPackageMenu(){
        PARTNER_PACKAGE_MENU.click();
        Assert.assertTrue(PARTNER_TAB.isDisplayed());
        Assert.assertTrue(PACKAGE_TAB.isDisplayed());
        Assert.assertTrue(ARCHIVED_PARTNER_TAB.isDisplayed());
    }

    public void FillWordInSearchBoxUsingEnterFeature(String word){
        SEARCH_BOX.sendKeys(word, Keys.ENTER);
    }

    public void GetsPartnerListContainsWordThatAreWrittenInTheSearchBox(String word){
        Assert.assertTrue(TABLE_PARTNER.getText().contains(word));
    }
}
