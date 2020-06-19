package Steps.Biller.PricingConfig;

import Pages.Biller.PricingConfig.PricingConfigPage;
import net.thucydides.core.steps.ScenarioSteps;

public class PricingConfigStep extends ScenarioSteps {
    PricingConfigPage pricingConfigPage;

    public void click_Biller()  {
        pricingConfigPage.clickBiller();
    }

    public void click_Price_Mapping() {
        pricingConfigPage.click_PriceMapping();
    }

    public void see_list_of_biller_pricing() {
        pricingConfigPage.seelist_of_biller_pricing();
    }

    public void user_filter(String filter, String val) {
        pricingConfigPage.userfilter(filter,val);
    }

    public void click_Add_Product() {
        pricingConfigPage.click_Add_Product();
    }

    public void fill_a_pricing_config(String biller, String product, String biller_product_code,String pricing_type, String biller_fee, String collection_fee, String incl_ppn) {
        pricingConfigPage.fill_a_pricing_config(biller,product,biller_product_code,pricing_type,biller_fee,collection_fee,incl_ppn);
    }

    public void click_save() {
        pricingConfigPage.click_save();
    }

    public void clik_Ok() {
        pricingConfigPage.clik_Ok();
    }

    public void pricing_config_addition_is_failed() {
        pricingConfigPage.pricing_config_addition_is_failed();
    }
}
