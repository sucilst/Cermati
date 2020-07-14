package Pages.Biller.PricingConfig;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class PricingConfigPage extends PageObject {
    @FindBy(id = "qe_biller")
    WebElement BILLER_MENU;

    @FindBy(id = "qe_price-mapping")
    WebElement PRICE_MAPPING;

    @FindBy(id = "qe_price-mapping-approval")
    WebElement PRICE_MAPPING_APPROVAL;

    @FindBy(className = "card")
    WebElement LIST_BILLER_PRICE;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div/div/div[1]/div/div/div[1]/div[1]/div[1]/div/div/input")
    WebElement FORM_BILLER;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div/div/div[1]/div/div/div[1]/div[1]/div[1]/div/ul/li[1]/a")
    WebElement INPUT_BILLER;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div/div/div[1]/div/div/div[1]/div[1]/div[2]/div/div/input")
    WebElement FORM_PRODUCT;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div/div/div[1]/div/div/div[1]/div[1]/div[2]/div/ul/li[1]/a")
    WebElement INPUT_PRODUCT;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div/div/div[1]/div/div/div[1]/div[1]/div[3]/div/div/input")
    WebElement FORM_PRICING_TYPE;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div/div/div[1]/div/div/div[1]/div[1]/div[3]/div/ul/li[1]/a")
    WebElement INPUT_PRICING_TYPE;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div/div/div[1]/div/div/div[1]/div[1]/div[4]/div/div/input")
    WebElement FORM_PPN;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div/div/div[1]/div/div/div[1]/div[1]/div[4]/div/ul/li[1]/a")
    WebElement INPUT_PPN;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div/div/div[1]/div/div/div[1]/div[3]/div/button[1]")
    WebElement SEARCH_BUTTON;

    @FindBy(xpath = "/html/body/div[2]/div/div[3]/button[1]")
    WebElement OK_BUTTON;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/main/div/div/div[1]/div/div/button")
    WebElement ADD_BUTTON;

    @FindBy(className = "modal-content")
    WebElement POP_UP;

    @FindBy(css = "div.mb-1:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    WebElement SELECT_BILLER;

    @FindBy(css = "div.mb-1:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    WebElement SELECT_PRODUCT;

    @FindBy(css = "div.mb-1:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(1)")
    WebElement SELECT_PRICETYPE;

    @FindBy(css = "div.mb-1:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > input:nth-child(2)")
    WebElement SELECT_PRICETYPE_EDIT;

    @FindBy(css = "#__BVID__308")
    WebElement BILLERPRODUCT_CODE;

    @FindBy(css = "#__BVID__283")
    WebElement COLLECTION_FEE;

    @FindBy(css = "#__BVID__309")
    WebElement BILLER_FEE;

    @FindBy(css = "div.custom-control:nth-child(1) > label:nth-child(2) > span:nth-child(1)")
    WebElement WITH_PPN;

    @FindBy(css = "div.custom-control:nth-child(2) > label:nth-child(2) > span:nth-child(1)")
    WebElement WITHOUT_PPN;

    @FindBy(css = "div.custom-control:nth-child(1) > label:nth-child(2) > span:nth-child(1)")
    WebElement WITH_PPN_EDIT;

    @FindBy(css = "div.custom-control:nth-child(2) > label:nth-child(2) > span:nth-child(1)")
    WebElement WITHOUT_PPN_EDIT;

    @FindBy(css = "#__BVID__297___BV_modal_footer_ > button:nth-child(1)")
    WebElement SAVE_BUTTON;

    @FindBy(xpath = "/html/body/div[2]/div")
    WebElement DUPLICATE_ENTRY;

    @FindBy(css = ".swal2-popup")
    WebElement PREV_REQ_IN_PROGRESS;

    @FindBy(css = "button.btn-sm:nth-child(1)")
    WebElement EDIT_BUTTON;

    @FindBy(css = "button.btn-sm:nth-child(2)")
    WebElement DEL_BUTTON;

    @FindBy(css = ".btn-danger")
    WebElement YES_DEL;

    @FindBy(css = "button.btn-primary:nth-child(1)")
    WebElement REVIEW;

    @FindBy(css = "button.btn:nth-child(2)")
    WebElement ACCEPT;

    @FindBy(css = ".btn-secondary")
    WebElement REJECT;

    public void clickBiller()  {
        BILLER_MENU.click();
    }

    public void click_PriceMapping() {
        PRICE_MAPPING.click();
    }

    public void seelist_of_biller_pricing() {
        LIST_BILLER_PRICE.isDisplayed();
    }

    public void userfilter(String filter, String val) {
        switch (filter) {
                case "biller":
                    FORM_BILLER.sendKeys(val);
                    INPUT_BILLER.click();
                    SEARCH_BUTTON.click();
                    break;

                case "product":
                    FORM_PRODUCT.sendKeys(val);
                    INPUT_PRODUCT.click();
                    SEARCH_BUTTON.click();
                    break;

                case "pricing_type":
                    FORM_PRICING_TYPE.sendKeys(val);
                    INPUT_PRICING_TYPE.click();
                    SEARCH_BUTTON.click();
                    break;

                case "include_ppn":
                    FORM_PPN.sendKeys(val);
                    INPUT_PPN.click();
                    SEARCH_BUTTON.click();
                    break;

                case "biller and product":
                    FORM_BILLER.sendKeys(val.substring(0,12));
                    INPUT_BILLER.click();
                    FORM_PRODUCT.sendKeys(val.substring(13));
                    INPUT_PRODUCT.click();
                    SEARCH_BUTTON.click();
                    break;

                default:
                    System.out.println("Username invalid");

        }
    }

    public void click_Add_Product() {
        ADD_BUTTON.click();
    }



    public void fill_a_pricing_config(String biller, String product, String biller_product_code,String pricing_type, String biller_fee, String collection_fee, String incl_ppn) {
        POP_UP.isDisplayed();
        SELECT_BILLER.click();
        SELECT_BILLER.sendKeys(biller);
        SELECT_BILLER.sendKeys(Keys.ENTER);

        SELECT_PRODUCT.sendKeys(product);
        SELECT_PRODUCT.sendKeys(Keys.ENTER);

        SELECT_PRICETYPE.click();
        SELECT_PRICETYPE.sendKeys(pricing_type);
        SELECT_PRICETYPE.sendKeys(Keys.ENTER);

        BILLERPRODUCT_CODE.click();
        BILLERPRODUCT_CODE.sendKeys(biller_product_code);

        BILLER_FEE.click();
        BILLER_FEE.sendKeys(biller_fee);
        if (incl_ppn.equals("true")) {
            WITH_PPN.click();
        } else {WITHOUT_PPN.click();}
    }

    public void click_save() {
        SAVE_BUTTON.click();
    }

    public void clik_Ok() {
        OK_BUTTON.click();
    }

    public void pricing_config_addition_is_failed() {
        DUPLICATE_ENTRY.isDisplayed();
    }

    public void pricing_config_deletion_is_failed() {
//        PREV_REQ_IN_PROGRESS.isDisplayed();
    }

    public void click_UPDATE() {
        EDIT_BUTTON.click();
    }

    public void edit_a_pricing_config(String whatEdit,String biller_product_code,String pricing_type, String biller_fee, String collection_fee, String incl_ppn) {
        switch (whatEdit) {
            case "biller_product_code":
                BILLERPRODUCT_CODE.click();
                BILLERPRODUCT_CODE.clear();
                BILLERPRODUCT_CODE.sendKeys(biller_product_code);
                break;

            case "pricing_type":
                SELECT_PRICETYPE_EDIT.click();
                SELECT_PRICETYPE_EDIT.sendKeys(pricing_type);
                SELECT_PRICETYPE_EDIT.sendKeys(Keys.ENTER);
                break;

            case "biller_fee":
                BILLER_FEE.click();
                BILLER_FEE.clear();
                BILLER_FEE.sendKeys(biller_fee);
                break;

            case "collection_fee":
                COLLECTION_FEE.click();
                COLLECTION_FEE.clear();
                COLLECTION_FEE.sendKeys(collection_fee);
                break;

            case "incl_ppn":
                if (incl_ppn.equals("true")) {
                    WITH_PPN_EDIT.click();
                } else {WITHOUT_PPN_EDIT.click();}
                break;

            case "all":
                BILLERPRODUCT_CODE.click();
                BILLERPRODUCT_CODE.clear();
                BILLERPRODUCT_CODE.sendKeys(biller_product_code);
                SELECT_PRICETYPE_EDIT.click();
                SELECT_PRICETYPE_EDIT.sendKeys(pricing_type);
                SELECT_PRICETYPE_EDIT.sendKeys(Keys.ENTER);
                BILLER_FEE.click();
                BILLER_FEE.clear();
                BILLER_FEE.sendKeys(biller_fee);
                if (incl_ppn.equals("true")) {
                    WITH_PPN_EDIT.click();
                } else {WITHOUT_PPN_EDIT.click();}
                break;

            default:
                System.out.println("Username invalid");

        }
    }

    public void delete_a_pricing_config() throws InterruptedException {
        DEL_BUTTON.click();
        Thread.sleep(3000);
        YES_DEL.click();
    }

    public void click_Price_Mapping_Approval() {
        PRICE_MAPPING_APPROVAL.click();
    }

    public void user_click_Review() {
        REVIEW.click();
    }

    public void user_do_the_change(String action) {
        if (action.equals("accept")) {
            ACCEPT.click();
        }
        else {
            REJECT.click();
        }
    }

    public void the_pricing_config_for_Dummy_Biller_Tri_Rp_successfully_added(String biller, String product, String finalState) {
        PRICE_MAPPING.click();
    }
}
