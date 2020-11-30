package Pages.PartnerPackage.Package;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.*;

import java.io.File;

public class BulkUpdatePackagePage extends PageObject {
    @FindBy(id = "qe_partner-package")
    WebElement PARTNER_PACKAGE_MENU;

    @FindBy(id = "qe_package___BV_tab_button__")
    WebElement PACKAGE_TAB;

    @FindBy(className = "icon-plus")
    WebElement BULK_BUTTON;

    @FindBy(xpath = "//fieldset[contains(text(),'Start Date')]//input[@class='form-control']")
    WebElement START_DATE;

    @FindBy(xpath = "//input[@class='custom-file-input']")
    WebElement UPLOAD_FILE;

    @FindBy(xpath = "//button[text()='OK']")
    WebElement OK_BUTTON;

    @FindBy(xpath = "//button[text()='Cancel']")
    WebElement CANCEL_BUTTON;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[3]")
    WebElement TEXT_PERMISSION;

    @FindBy(xpath = "//button[text()='OK']")
    WebElement OK_BUTTON_PERMISSION;

    @FindBy(xpath = "//button[text()='OK']")
    WebElement CANCEL_BUTTON_PERMISSION;

    public void partnerPackagePage(){
        PARTNER_PACKAGE_MENU.click();
    }

    public void packagePage(){
        PACKAGE_TAB.click();
    }

    public void bulkPackage(){
        BULK_BUTTON.click();
    }

    public void uploadFile(String date, String path) {
        setSTART_DATE(date);
        setUPLOAD_FILE(path);
    }

    public void setSTART_DATE(String date){
        START_DATE.click();
        START_DATE.clear();
        START_DATE.sendKeys(date);
        START_DATE.sendKeys(Keys.ENTER);
    }

    public void setUPLOAD_FILE(String path){
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("document.querySelector(\"input[class*='custom-file-input']\").style.opacity='1'");
        File file = new File(path);
        UPLOAD_FILE.sendKeys(file.getAbsolutePath());
    }

    public void buttonClick(String action){
        switch(action){
            case "OK":
                OK_BUTTON.click();
                break;
            default:
                CANCEL_BUTTON.click();
        }
    }

    public void permission(String action){
        if ((TEXT_PERMISSION.getText().equals("Assert.assertEquals(\"Are you sure bulk update product-package this file?")&&action.equals("OK"))){
            OK_BUTTON_PERMISSION.click();
        } else if ((TEXT_PERMISSION.getText().equals("Assert.assertEquals(\"Are you sure bulk update product-package this file?")&&action.equals("Cancel"))){
            CANCEL_BUTTON_PERMISSION.click();
        } else {
            System.out.println("Text Tidak Muncul");
        }
    }
}
