package Pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.apache.regexp.RE;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageObject {
    @FindBy(id = "email")
    WebElement EMAIL_FIELD;

    @FindBy(id = "password")
    WebElement PASSWORD_FIELD;

    @FindBy(id = "confirm-password")
    WebElement CONFIRMPASSWORD_FIELD;

    @FindBy(id = "first-name")
    WebElement FIRSTNAME_FIELD;

    @FindBy(id = "last-name")
    WebElement LASTNAME_FIELD;

    @FindBy(id = "mobile-phone")
    WebElement MOBILEPHONE_FIELD;

    @FindBy(id = "residence-city")
    WebElement RESIDENCECITY_FIELD;

    @FindBy(xpath = "//*[@id=\"join-container\"]/div/div/div[2]/div/div[7]/div/div[2]/div/div")
    WebElement RESIDENCECITYCLICK_CHECKBOX;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/button[1]")
    WebElement DAFTARAKUN_BUTTON;

    @FindBy(id = "sidebar-open")
    WebElement DASHBOARD_PAGE;

    public void InputField(String email, String firtName, String lastName, String phoneNumber, String city){
        EMAIL_FIELD.sendKeys(email);
        PASSWORD_FIELD.sendKeys("suci1234");
        CONFIRMPASSWORD_FIELD.sendKeys("suci1234");
        FIRSTNAME_FIELD.sendKeys(firtName);
        LASTNAME_FIELD.sendKeys(lastName);
        MOBILEPHONE_FIELD.sendKeys(phoneNumber);
        RESIDENCECITY_FIELD.sendKeys(city);
        RESIDENCECITYCLICK_CHECKBOX.click();
    }

    public void clickDaftarAkun(){
        DAFTARAKUN_BUTTON.click();
    }

    public void validationPage(){
        try {
                Thread.sleep(10000);
            } catch (Exception e) {}
        DASHBOARD_PAGE.isDisplayed();
    }
}
