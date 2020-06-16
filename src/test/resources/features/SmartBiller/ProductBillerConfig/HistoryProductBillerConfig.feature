Feature: History Product Biller Config
  As Ops
  I want to see history of product biller config
  So that i can see history of that

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T352
  Scenario: search product biller by correct biller id or biller name
    Given on history tab product biller config sub menu
    When user fill the search box with correct biller id or biller name : mip
    Then user get product biller in accordance with the search box : MIP

  @TestCaseKey=BPAS-T353
  Scenario: search product biller by incorrect biller id or biller name
    Given on history tab product biller config sub menu
    When user fill the search box with incorrect biller id or biller name : abcdef
    Then user get warning message "Sorry, no matching options." on dropdown biller

  @TestCaseKey=BPAS-T354
  Scenario: search product biller by correct product id and biller id or biller name
    Given on history tab product biller config sub menu
    When user fill the search box with correct product id : 1 and biller id or biller name : mip
    Then user get product biller in accordance with the product id : 1 and biller name : MIP

  @TestCaseKey=BPAS-T355
  Scenario: search product biller by incorrect product id and correct biller id or biller name
    Given on history tab product biller config sub menu
    When user fill the search box with incorrect product id : 10000 and correct biller id or biller name : mip
    Then user does not get any product biller, not contains product id : 10000 and biller name : MIP