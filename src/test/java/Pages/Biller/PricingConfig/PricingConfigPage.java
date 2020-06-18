package Pages.Biller.PricingConfig;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;

public class PricingConfigPage extends PageObject {
    @FindBy(id = "qe_biller")
    WebElement BILLER_MENU;

    @FindBy(id = "qe_price-mapping")
    WebElement PRICE_MAPPING;

    @FindBy(className = "card")
    WebElement LIST_BILLER_PRICE;

    public void clickBiller()  {
        BILLER_MENU.click();
    }

    public void click_PriceMapping() {
        PRICE_MAPPING.click();
    }

    public void seelist_of_biller_pricing() {
        LIST_BILLER_PRICE.isDisplayed();
    }
}
