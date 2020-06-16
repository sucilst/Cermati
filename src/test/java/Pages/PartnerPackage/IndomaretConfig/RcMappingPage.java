package Pages.PartnerPackage.IndomaretConfig;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RcMappingPage extends PageObject{
    @FindBy(id = "qe_partner-package")
    WebElement menuPartner;
    public void partnerMenu (){
        Assert.assertTrue(menuPartner.isDisplayed());
        menuPartner.click();
    }

    @FindBy (id = "qe_indomaret-configuration")
    WebElement submenuIndomaretConfig;
    public void submenuIndomaret(){
        Assert.assertTrue(submenuIndomaretConfig.isDisplayed());
        submenuIndomaretConfig.click();
    }

    @FindBy (id = "qe_indomaret-configuration_button_response-code-config")
    WebElement buttonAdd;
    public void buttonAddConfig (){
        element(buttonAdd).waitUntilClickable();
        Actions act =  new Actions(getDriver());
        act.moveToElement(buttonAdd).click().perform();

    }

    @FindBy (xpath = "//div[contains(@class,'dropdown-toggle')]")
    List<WebElementFacade> listPartner;
    public void inputPartner () {
        listPartner.forEach((partner)->{
            Assert.assertTrue(partner.isDisplayed());
        });
        listPartner.get(listPartner.size()-1).click();
        Actions act =  new Actions(getDriver());
        act.moveToElement(listPartner.get(listPartner.size()-1)).sendKeys("0\n").perform();
    }

    @FindBy (xpath = "//input[contains(@class,'custom-height-input')]")
    List<WebElementFacade> rcIndomaret;
    public void inputRcIndomaret () {
        rcIndomaret.forEach((rcindomaret)->{
            Assert.assertTrue(rcindomaret.isDisplayed());
        });
        rcIndomaret.get(rcIndomaret.size()-1).sendKeys("123");
    }

    @FindBy (id = "qe_indomaret-configuration_button_save")
    WebElement buttonSave;
    public void clickButtonSave (){
        Assert.assertTrue(buttonSave.isDisplayed());
        buttonSave.click();
    }

    @FindBy (id = "swal2-content")
    WebElement popUp;
    public void popUpSave (){
        Assert.assertTrue(popUp.isDisplayed());
        Assert.assertEquals("Success Save Indomaret Configuration",popUp.getText());

    }
    @FindBy (id = "swal2-content")
    WebElement popUpEror;
    public void popUpEror () {
        Assert.assertTrue(popUpEror.isDisplayed());
        Assert.assertEquals("Please Fill All Form", popUp.getText());
    }

    @FindBy (id = "qe_indomaret-configuration_button_remove-1")
    WebElement buttonRemove;
    public void removeButton(){
        Assert.assertTrue(buttonRemove.isDisplayed());
        buttonRemove.click();
    }
}
