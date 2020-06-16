Feature: Category of Product Config
  As Ops
  I want to have feature single edit category product
  So that so when we find some mistake or wrong category mapping, improve ops efficiency to remapping category into the right one. rather than request manual to development team

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T308
  Scenario: without editing category
    Given on Edit a Category of Product Config pop up
    When user click ok button on this pop up
    Then user gets success edit pop up and the category column not changed

  @TestCaseKey=BPAS-T309
  Scenario: With edit category
    Given on Edit a Category of Product Config pop up
    When user choose another category and click ok
    Then user gets success edit pop up and the category column matches with the previously selected category

  @TestCaseKey=BPAS-T322
  Scenario: invalid value of category id
    Given on Edit a Category of Product Config pop up
    When user choose category with invalid value of category id and click ok button on this pop up
    Then user gets warning pop up with give information that category_id: invalid value