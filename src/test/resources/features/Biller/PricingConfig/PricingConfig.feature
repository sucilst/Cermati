@sequence
@PricingConfig
Feature: Pricing Config

  Narrative:
  As an Ops
  I want to deal with pricing config on kraken
  So that it can ease stakeholders to determine pricing

  Background: Login
    Given User open sentinel login page
    When User input kraken as username and input password

  @TestCaseKey=BPA-T1472
  Scenario: Get list biller pricing success
    Given user has logged in before deal with pricing config
    When user click Biller
    And user click Price Mapping
    Then user can see list of biller pricing

  @TestCaseKey=BPA-T1476
  Scenario Outline: Filter pricing config
    Given user has logged in before deal with pricing config
    When user click Biller
    And user click Price Mapping
    When user filter <filter_type> with value <val> of the pricing config
    Then the pricing config shows the correct data based on filter <filter_type> with value <val>

    Examples:
      |filter_type |val               |
      |biller      |Indosat Saldo Mobo|
#      |product     |Tri Rp 100.000    |
#      |pricing_type|Price             |
#      |include_ppn |With PPN          |