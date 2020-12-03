package Pages.Login;

import Utils.Helper;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageObject {
    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement USERNAME_FIELD;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement PASSWORD_FIELD;

    @FindBy(xpath = "//button[text()='Login']")
    WebElement LOGIN_BUTTON;

    @FindBy(xpath= "//a[text()='Sentinel']")
    WebElement APP_HEADER;

    @FindBy(xpath= "//h1[text()='Sentinel Login']")
    WebElement LOGIN_FORM;

    public void InputUsernameAndPassword(String username){
        USERNAME_FIELD.click();
        USERNAME_FIELD.sendKeys(username);
        PASSWORD_FIELD.sendKeys(Helper.UserLogin(username));
        LOGIN_BUTTON.click();
    }

    public void CanSeeSentinelDashboard() {
        Assert.assertTrue(APP_HEADER.isDisplayed());
    }

    public void CanSeeLoginForm() {
        Assert.assertTrue(LOGIN_FORM.isDisplayed());
    }
}