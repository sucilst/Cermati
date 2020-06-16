Feature: Product Biller Tab
  As Ops
  I want to see product biller config
  So that i can see that to do daily monitoring task

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T509
  Scenario: display of Product Biller Tab
    Given on Product Biller Config Menu
    When user click "Product Biller" tab
    Then user get display in accordance with po's requested

  @TestCaseKey=BPAS-T510
  Scenario: search product biller by category filter only
    Given on Product Biller Tab
    When user search product biller by Pulsa direct category
    Then user get correct product biller based on search filter or contains this Pulsa direct

  @TestCaseKey=BPAS-T511
  Scenario: search incorrect category
    Given on Product Biller Tab
    When user search product biller by random category
    Then user get message "Sorry, no matching options." on category filter

  @TestCaseKey=BPAS-T512
  Scenario Outline: search product biller by category and other filter
    Given on Product Biller Tab
    When user search correct product biller by pulsa direct category and <other> filter, that is <text>
    Then user get correct product biller based on search filter or contains this <text>

    Examples:
      |other|text|
      |biller|dummy_mobile|
      |product_id|5|
      |product_name|tri|
      |status      |manual open|