import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"html:target/cucumber","json:target/cucumber/report.json","pretty"},
        features = {
                "src/test/resources/features/Biller/PricingConfig/PricingConfig.feature"
        },
//        tags = {"@TestCaseKey=BPA-T1477,@TestCaseKey=BPA-T1473x,@TestCaseKey=BPA-T147x"}
        tags = {"@TestCaseKey=BPA-T147y"}
)
public class CucumberTestSuite {}