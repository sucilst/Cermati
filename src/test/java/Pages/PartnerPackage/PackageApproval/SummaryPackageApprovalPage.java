package Pages.PartnerPackage.PackageApproval;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SummaryPackageApprovalPage extends PageObject {
    @FindBy(css = "button.btn:nth-child(3)")
    WebElement BulkUpdatePackageButton;

//    @FindBy(css = "#csvBulkUpdatePackage__BV_file_outer_")
//    @FindBy(css = "#csvBulkUpdatePackage__BV_file_control_")
    @FindBy(xpath = "//*[@id=\"csvBulkUpdatePackage\"]")
    WebElement CSVfield;

    String path2 = "/Users/setiobudi/Documents/Work/kraken2-ui/src/test/resources/Files/AddBulkPackage2.csv";

    @FindBy(css = "#__BVID__293___BV_modal_footer_ > button:nth-child(1)")
    WebElement OK_CSV;

    public void click_Bulk_Update_Product_Package() {
        BulkUpdatePackageButton.click();
    }

    public void enter_the_CSV_file() {
        if (CSVfield.isDisplayed()) {
            CSVfield.sendKeys(path2);
        }
    }

    public void click_OK() {
        OK_CSV.click();
    }
}
