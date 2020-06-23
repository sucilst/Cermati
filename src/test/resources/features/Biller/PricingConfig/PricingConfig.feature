#@sequence
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
      |biller      |Smartfren         |
      |product     |Tri Rp 100.000    |
      |pricing_type|Price             |
      |include_ppn |With PPN          |

  @TestCaseKey=BPA-T1473
  Scenario Outline: Add pricing config and get list of it afterward
    Given user has logged in before deal with pricing config
    When user click Biller
    And user click Price Mapping
    And user click Add Product
    And user fill a pricing config with <biller>, <product>, <biller_product_code>, <pricing_type>, <biller_fee>, <collection_fee>, <incl_ppn>
    And user click save
    And clik Ok
    Then the pricing config for <biller>, <product> successfully added

    Examples:
      |biller       |product       |biller_product_code|pricing_type|biller_fee|collection_fee|incl_ppn|
      |Dummy Biller |Tri Rp 100    |A71                |Price       |1000      |2000          |false   |

  @TestCaseKey=BPA-T1474
  Scenario Outline: Add pricing config fail (Duplicate entry)
    Given user has logged in before deal with pricing config
    When user click Biller
    And user click Price Mapping
    And user click Add Product
    And user fill a pricing config with <biller>, <product>, <biller_product_code>, <pricing_type>, <biller_fee>, <collection_fee>, <incl_ppn>
    And user click save
    Then the pricing config addition is failed due to Duplicate entry

    Examples:
      |biller       |product       |biller_product_code|pricing_type|biller_fee|collection_fee|incl_ppn|
      |Dummy Biller |Tri Rp 100    |A71                |Price       |1000      |2000          |false   |

  @TestCaseKey=BPA-T1475
  Scenario Outline: Edit pricing config and get list of it afterward
    Given user has logged in before deal with pricing config
    When user click Biller
    And user click Price Mapping
    And user filter <filter_type> with value <val> of the pricing config
    And user edit a pricing config at <whatEdit> with <biller_product_code>, <pricing_type>, <biller_fee>, <collection_fee>, <incl_ppn>
    And user click save
    And clik Ok
    Then the pricing config for successfully edited

    Examples:
      |filter_type       |val                     |biller_product_code|pricing_type|biller_fee|collection_fee|incl_ppn|whatEdit           |
      |biller and product|Dummy Biller&Tri Rp 100 |A73                |Price       |1000      |2000          |false   |biller_product_code|
      |biller and product|Dummy Biller&Tri Rp 100 |A71                |Percentage  |1000      |2000          |false   |pricing_type       |
      |biller and product|Dummy Biller&Tri Rp 100 |A71                |Price       |1550      |2000          |false   |biller_fee         |
      |biller and product|Dummy Biller&Tri Rp 100 |A71                |Price       |1000      |2550          |false   |collection_fee     |
      |biller and product|Dummy Biller&Tri Rp 100 |A71                |Price       |1000      |2000          |true    |incl_ppn           |

  @TestCaseKey=BPA-T1477
  Scenario Outline: Delete pricing config and get list of it afterward
    Given user has logged in before deal with pricing config
    When user click Biller
    And user click Price Mapping
    And user filter <filter_type> with value <val> of the pricing config
    And user delete a pricing config
    And clik Ok
    Then the pricing config successfully deleted

    Examples:
      |filter_type       |val                    |
      |biller and product|Dummy Biller&Tri Rp 100|