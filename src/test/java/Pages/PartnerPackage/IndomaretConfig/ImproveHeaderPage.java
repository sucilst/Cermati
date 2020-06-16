package Pages.PartnerPackage.IndomaretConfig;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ImproveHeaderPage extends PageObject {
    @FindBy(id = "qe_partner-package")
    WebElement menuPartnerPackage;

    public void partnerPackageMenu() {
        Assert.assertTrue(menuPartnerPackage.isDisplayed());
        menuPartnerPackage.click();
    }

    @FindBy(id = "qe_indomaret-configuration")
    WebElement submenuIndomaretConfiguration;

    public void submenuIndomaretConfig() {
        Assert.assertTrue(submenuIndomaretConfiguration.isDisplayed());
        submenuIndomaretConfiguration.click();
    }

    @FindBy(id = "qe_indomaret-configuration_tabel_header_rc-partner")
    WebElement headerRCAlterra;

    public void RcAlterraHeader() {
        Assert.assertTrue(headerRCAlterra.isDisplayed());
        Assert.assertEquals("RC Alterra", headerRCAlterra.getText());
    }

    @FindBy(id = "qe_indomaret-configuration_button_response-code-config")
    WebElement buttonAddConfigRc;
    public void buttonAddConfig() {
        Assert.assertTrue(buttonAddConfigRc.isDisplayed());
        buttonAddConfigRc.click();

    }

    @FindBy(id = "qe_indomaret-configuration_list-partner-3")
    WebElement listRcAlterra;
    public void inputRcAlterra() {
        Assert.assertTrue(listRcAlterra.isDisplayed());
        listRcAlterra.click();
        Actions act = new Actions(getDriver());
        act.moveToElement(listRcAlterra).sendKeys("ALT23\n").perform();
    }
}

