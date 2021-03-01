package Steps;

import Pages.RegisterPage;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterStep extends ScenarioSteps{
    RegisterPage registerPage;

    public void UserOpenRegisterPage(){
        registerPage.open();
    }

    public void UserInputField(String email, String firtName, String lastName, String phoneNumber, String city){
        registerPage.InputField(email, firtName, lastName, phoneNumber, city);
    }

    public void clickButtonDaftar(){
        registerPage.clickDaftarAkun();
    }

    public void dashboardPage(){
        registerPage.validationPage();
    }
}
