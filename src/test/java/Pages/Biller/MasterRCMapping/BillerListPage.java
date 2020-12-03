package Pages.Biller.MasterRCMapping;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class BillerListPage extends PageObject {
    Random rand = new Random();
    int n = rand.nextInt(9999999) + 1;
    String label = "sucil"+n;
    String name = "suci"+n;
    String labelText;
    String nameText;

    @FindBy(id = "qe_biller")
    WebElement BILLER_MENU;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/button[1]")
    WebElement ADD_BUTTON;

    @FindBy(id = "__BVID__233")
    WebElement LABEL_FORM;

    @FindBy(id = "__BVID__234")
    WebElement NAME_FORM;

    @FindBy(id = "__BVID__235")
    WebElement DESC_FORM;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/main[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/footer[1]/button[1]")
    WebElement ADD_FORM;

    @FindBy(id = "__BVID__242")
    WebElement LABEL_CONFIRM_FORM;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement SAVE_BUTTON;

    @FindBy(xpath = " //button[contains(text(),'Ok')]")
    WebElement OKE_BUTTON;

    @FindBy(xpath = "//span[contains(text(),'»')]")
    WebElement LAST_PAGE_DATA;

    @FindBy(linkText = "Update Biller")
    WebElement UPDATE_NAME_BUTTON;

    @FindBy(xpath = "//*[@id=\"__BVID__244___BV_modal_body_\"]/button")
    WebElement UPDATE_BUTTON;

    @FindBy(id = "__BVID__247")
    WebElement UPDATE_NAME_FIELD;

    @FindBy(id = "__BVID__248")
    WebElement UPDATE_DESC_FIELD;

    @FindBy(xpath = "//button[contains(text(),'Ok')]")
    WebElement OK_BUTTON;

    @FindBy(id = "swal2-content")
    WebElement ERROR_MESSAGE;

    @FindBy(xpath = "//button[contains(text(),'close')]")
    WebElement CLOSE_BUTTON;

    @FindBy(xpath = "//*[@id=\"__BVID__244___BV_modal_body_\"]/div/div")
    WebElement ERROR_MESSAGE_DESC;

    public WebElement getDataTable(int index){
        WebElement mytable = getDriver().findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/table[1]"));
        List <WebElement> rows_table = mytable.findElements(By.tagName("tr"));
        List <WebElement> Columns_row = rows_table.get(rows_table.size()-1).findElements(By.tagName("td"));
        return Columns_row.get(index);
    }

    public void billerPage(){
        BILLER_MENU.click();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
    }

    public void addBillerForm(String labels, String names){
        ADD_BUTTON.click();
        LABEL_FORM.sendKeys(labels);
        NAME_FORM.sendKeys(names);
        DESC_FORM.sendKeys("apapun");
        ADD_FORM.click();
        LABEL_CONFIRM_FORM.sendKeys(labels);
        SAVE_BUTTON.click();
    }

    public void updateName(String names){
        LAST_PAGE_DATA.click();
        getDataTable(4).findElements(By.tagName("button")).get(0).click();
        labelText = getDataTable(1).getText();
        UPDATE_NAME_BUTTON.click();
        UPDATE_NAME_FIELD.clear();
        UPDATE_NAME_FIELD.sendKeys(names);
        UPDATE_BUTTON.click();
        OK_BUTTON.click();
    }

    public void updateDesc(String descs){
        LAST_PAGE_DATA.click();
        getDataTable(4).findElements(By.tagName("button")).get(0).click();
        labelText = getDataTable(1).getText();
        UPDATE_NAME_BUTTON.click();
        UPDATE_DESC_FIELD.clear();
        UPDATE_DESC_FIELD.sendKeys(descs);
        UPDATE_BUTTON.click();
    }

    public void dataForm(String action){
        switch(action){
            case "success":
                addBillerForm(label,name);
                OKE_BUTTON.click();
                break;
            case "failed":
                addBillerForm("sucil4824510",name);
                break;
            case "empty name":
                addBillerForm(label,"");
                OKE_BUTTON.click();
                break;
            case "update name success":
                updateName("ayokayok");
                break;
            case "update empty name success":
                updateName("");
                break;
            case "update desc success":
                updateDesc("kenapakenapa");
                OK_BUTTON.click();
                break;
            case "update empty desc success":
                updateDesc("");
                break;
        }
    }

    public void checkData(String action){
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        switch (action){
            case "was":
                LAST_PAGE_DATA.click();
                Assert.assertEquals(label,getDataTable(1).getText());
                Assert.assertEquals(name,getDataTable(2).getText());
                break;
            case "was empty name":
                LAST_PAGE_DATA.click();
                Assert.assertEquals(label,getDataTable(1).getText());
                Assert.assertEquals("",getDataTable(2).getText());
                break;
            case "name change was":
                Assert.assertEquals(labelText,getDataTable(1).getText());
                Assert.assertEquals("ayokayok",getDataTable(2).getText());
                break;
            case "empty name change was":
                Assert.assertEquals(labelText,getDataTable(1).getText());
                Assert.assertEquals("",getDataTable(2).getText());
                break;
            case "desc change was":
                Assert.assertEquals(labelText,getDataTable(1).getText());
                Assert.assertEquals("kenapakenapa",getDataTable(3).getText());
                break;
            case "empty desc change was":
//                StringBuilder sb = new StringBuilder(ERROR_MESSAGE_DESC.getText());
//                sb.deleteCharAt(0);
//                System.out.println(sb.toString());
//                Assert.assertEquals("Please complete biller description",sb.toString());
                break;
            case "was not":
                Assert.assertEquals("Biller label already used",ERROR_MESSAGE.getText());
                CLOSE_BUTTON.click();
                break;
        }
        }


}
