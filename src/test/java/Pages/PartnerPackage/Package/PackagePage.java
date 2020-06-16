package Pages.PartnerPackage.Package;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PackagePage extends PageObject {
    @FindBy(id = "qe_partner-package")
    WebElement PARTNER_PACKAGE_MENU;

    @FindBy(id = "qe_package___BV_tab_button__")
    WebElement PACKAGE_TAB;

    @FindBy(xpath = "//*[@id=\"qe_package_package-list\"]/div/input")
    WebElement SEARCH_PACKAGE_TO_EDIT;

    @FindBy(id = "qe_package_go_to_edit")
    WebElement GO_TO_EDIT_BUTTON;

    @FindBy(id = "label")
    WebElement LABEL_PACKAGE;

    @FindBy(xpath = "//input[@placeholder='By ID / Name']")
    WebElement SEARCH_BOX;

    @FindBy(xpath = "//button[text()='Clear']")
    WebElement CLEAR_BUTTON;

    @FindBy(xpath = "//table[starts-with(@id,'__BVID__')]")
    WebElement TABLE_PACKAGE;

    public void ClickPartnerPackageMenu(){
        PARTNER_PACKAGE_MENU.click();
    }

    public void ClickPackageTab(){
        PACKAGE_TAB.click();
    }

    public void SearchPackage(String param){
        SEARCH_PACKAGE_TO_EDIT.sendKeys(param, Keys.ENTER);
        GO_TO_EDIT_BUTTON.click();
    }

    public void GetsPackageBasedOnSearch(String param){
        Assert.assertEquals(param,LABEL_PACKAGE.getAttribute("value"));
    }

    public void GetsDisplayOfTheSearchBox(){
        Assert.assertTrue(CLEAR_BUTTON.isDisplayed());
        Assert.assertTrue(SEARCH_BOX.getAttribute("placeholder").equalsIgnoreCase("By ID / Name"));
    }

    public void FillWordOnSearchBox(String word){
        SEARCH_BOX.sendKeys(word);
    }

    public void GetsWordOnTheList(String word){
        Assert.assertTrue(TABLE_PACKAGE.getText().contains(word));
    }
}