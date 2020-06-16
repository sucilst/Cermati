Feature: History Product Partner Config
  As Ops
  I want to see history of product partner config
  So that i can see history of that

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T310
  Scenario: go to next page after fill the search box without enter or click search button
    Given on History tab on product partner config sub menu
    When user fill the search box with correct product id : 10 and click next page
    Then user gets normal list with mix product id, not 10

  @TestCaseKey=BPAS-T311
  Scenario: go to last page after fill the search box without enter or click search button
    Given on History tab on product partner config sub menu
    When user fill the search box with correct product id : 10 and click last page
    Then user gets normal list with mix product id, not 10

  @TestCaseKey=BPAS-T312
  Scenario: (initial state is not on page 1) go to previous page after fill the search box without enter or click search button
    Given on History tab on product partner config sub menu
    When user fill the search box with correct product id : 10 and click previous page
    Then user gets normal list with mix product id, not 10

  @TestCaseKey=BPAS-T313
  Scenario: (initial state is not on page 1) go to first page after fill the search box without enter or click search button
    Given on History tab on product partner config sub menu
    When user fill the search box with correct product id : 10 and click first page
    Then user gets normal list with mix product id, not 10

  @TestCaseKey=BPAS-T348
  Scenario: search product by correct partner id/partner name
    Given on History tab on product partner config sub menu
    When user fill the search box with correct partner id or partner name, that is tester
    Then user get product in accordance with the partner id/partner name : tester

  @TestCaseKey=BPAS-T349
  Scenario: search product by incorrect partner id or partner name
    Given on History tab on product partner config sub menu
    When user fill the search box with incorrect partner id or partner name, that is abcde
    Then user get warning message "sorry no matching options"

  @TestCaseKey=BPAS-T350
  Scenario: search product by correct product id and partner id/partner name
    Given on History tab on product partner config sub menu
    When user fill the search box with correct product id : 10 and partner id or partner name : tester
    Then user get product in accordance with the product id : 10 and partner id or partner name : tester

  @TestCaseKey=BPAS-T351
  Scenario: search product by incorrect product id and correct partner id or partner name
    Given on History tab on product partner config sub menu
    When user fill the search box with incorrect product id : 100000 and correct partner id or partner name : tester
    Then user does not get any product partner, not contains product id : 100000 and partner : tester

  @TestCaseKey=BPAS-T494
  Scenario: updated time and date on param "Updated At"
    Given on History tab on product partner config sub menu
    When see the id of param "Updated At"
    Then get correct id