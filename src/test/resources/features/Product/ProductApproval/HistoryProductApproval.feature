Feature: History Product Approval
  As Ops
  I want to have rename header field from product id to product code
  So that header name correspondent with data provided below that header

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T303
  Scenario: header of product id change to product code
    Given on product approval sub menu
    When user click history tab
    Then user gets product id header change to product code

  @TestCaseKey=BPAS-T304
  Scenario: in change detail pop up, header of product id change to product code
    Given on history tab
    When user click detail button
    Then user gets product id header change to product code on change detail pop up