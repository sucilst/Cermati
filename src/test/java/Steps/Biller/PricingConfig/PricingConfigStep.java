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

    public void the_pricing_config_for_Dummy_Biller_Tri_Rp_successfully_added(String biller, String product, String finalState) {
        pricingConfigPage.the_pricing_config_for_Dummy_Biller_Tri_Rp_successfully_added(biller, product, finalState);
    }

    public void pricing_config_addition_is_failed() {
        pricingConfigPage.pricing_config_addition_is_failed();
    }

    public void pricing_config_deletion_is_failed() {
        pricingConfigPage.pricing_config_deletion_is_failed();
    }

    public void click_UPDATE() {
        pricingConfigPage.click_UPDATE();
    }

    public void edit_a_pricing_config(String whatEdit,String biller_product_code,String pricing_type, String biller_fee, String collection_fee, String incl_ppn) {
        pricingConfigPage.edit_a_pricing_config(whatEdit,biller_product_code,pricing_type,biller_fee,collection_fee,incl_ppn);
    }

    public void delete_a_pricing_config() throws InterruptedException {
        pricingConfigPage.delete_a_pricing_config();
    }

    public void click_Price_Mapping_Approval() {
        pricingConfigPage.click_Price_Mapping_Approval();
    }

    public void user_click_Review() {
        pricingConfigPage.user_click_Review();
    }

    public void user_do_the_change(String action) {
        pricingConfigPage.user_do_the_change(action);
    }
}
