Feature: Change Log
  As Ops
  I want to have filter partner on change log
  So that Ops easier to track which biller used on specific partner product, and all score inside it.

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T296
  Scenario: The appearance of the partner filter is a dropdown whose contents are product ID and product name
    Given on change log sub menu
    When user click on partner dropdown
    Then user gets product id and product name list

  @TestCaseKey=BPAS-T297
  Scenario: search by correct partner only
    Given on change log sub menu
    When user search correct partner only
    Then user gets partner based on partner filter

  @TestCaseKey=BPAS-T298
  Scenario: search random partner (incorrect or not found partner)
    Given on change log sub menu
    When user write incorrect partner name
    Then user gets "sorry, no matching options" on the dropdown list

  @TestCaseKey=BPAS-T299
  Scenario: search using correct product id and partner filter
    Given on change log sub menu
    When user choose and write correct product id and product name
    Then user gets a partner's product that matches the filter written and selected

  @TestCaseKey=BPAS-T300
  Scenario: search by incorrect product id and correct partner
    Given on change log sub menu
    When user write incorrect product id and choose correct partner
    Then user does not get any product in the table