Feature: TOP Biller Log
  As Ops
  I want to have TOP biller config history
  So that ops able to trace changes on TOP biller config

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password
    When on TOP Config sub menu
    When on edit TOP Biller Config Pop Up

  @TestCaseKey=BPAS-T502
  Scenario: display of TOP partner log
    Given Click Cancel Button
    When user click tab "TOP Biller Log"
    Then user get display of tab "TOP Biller Log" in accordance with po's requested

  @TestCaseKey=BPAS-T503
  Scenario: edit TOP biller with positive numbers
    Given already edit TOP biller with positive numbers
    When user click tab "TOP Biller Log"
    Then user see change of this biller is positive numbers at the top of the list

  @TestCaseKey=BPAS-T504
  Scenario: edit TOP biller with negative numbers
    Given already edit TOP biller with negative numbers
    When user click tab "TOP Biller Log"
    Then user see change of this biller is negative numbers at the top of the list

  @TestCaseKey=BPAS-T505
  Scenario: search correct biller on page one
    Given On TOP Biller Log tab
    When user search correct biller, the biller is test
    Then user get top biller log list of test

  @TestCaseKey=BPAS-T506
  Scenario: search correct biller on page that are not page one
    Given On page 2 of TOP Biller Log Tab
    When user search correct biller, the biller is test
    Then user get default page is page 1 and the biller that displayed on the list is test

  @TestCaseKey=BPAS-T507
  Scenario: search incorrect biller
    Given On TOP Biller Log tab
    When user search incorrect biller or random alphabet
    Then user get "Sorry, no matching options." message

  @TestCaseKey=BPAS-T508
  Scenario: check function of clear filter button
    Given On TOP Biller Log tab
    When user fill the biller filter with test; click clear filter
    Then user get the biller filter is empty