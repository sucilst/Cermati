Feature: TOP Partner Log
  As Ops
  I want to have TOP config partner history
  So that ops able to trace changes on TOP config partner

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password
    When on edit TOP Partner Config Pop Up

  @TestCaseKey=BPAS-T495
  Scenario: display of TOP partner log
    Given already on TOP Config sub menu
    When user click tab "TOP Partner Log"
    Then user get display of tab "TOP Partner Log" in accordance with po's requested

  @TestCaseKey=BPAS-T496
  Scenario: edit TOP partner with positive numbers
    Given already edit TOP partner with positive numbers
    When user click tab "TOP Partner Log"
    Then user see change of this partner is positive numbers at the top of the list

  @TestCaseKey=BPAS-T497
  Scenario: edit TOP partner with negative numbers
    Given already edit TOP partner with negative numbers
    When user click tab "TOP Partner Log"
    Then user see change of this partner is negative numbers at the top of the list

  @TestCaseKey=BPAS-T498
  Scenario: search correct partner on page one
    Given On TOP Partner Log tab
    When user search correct partner, the partner is jojonomic
    Then user get log list of jojonomic

  @TestCaseKey=BPAS-T499
  Scenario: search correct partner on page that are not page one
    Given On page 2 of TOP Partner Log Tab
    When user search correct partner, the partner is jojonomic
    Then user get default page is page 1 and the partner that displayed on the list is jojonomic

  @TestCaseKey=BPAS-T500
  Scenario: search incorrect partner
    Given On TOP Partner Log tab
    When user search incorrect partner or random alphabet
    Then user get message "Sorry, no matching options."

  @TestCaseKey=BPAS-T501
  Scenario: check function of clear filter button
    Given On TOP Partner Log tab
    When user fill the partner filter with jojonomic; click clear filter
    Then user get the partner filter is empty