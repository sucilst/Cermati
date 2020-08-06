import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"html:target/cucumber","json:target/cucumber/report.json","pretty"},
        features = {
                "src/test/resources/features/PartnerPackage/PackageApproval/SummaryPackageApproval.feature"
        },
        tags = {"@TestCaseKey=BPA-mmm"}
)
public class CucumberTestSuite {}