Feature: TOP Biller Config
  As an user
  I want to config my TOP biller
  So that more easier to config TOP biller

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password
    When on TOP Config sub menu

  Scenario: display of TOP biller config
    When user click tab "TOP Biller Config"
    Then user get display of TOP Biller Config based on wireframe

  Scenario: display of "add TOP biller config"
    Given on tab TOP Biller Config
    When user click add TOP Biller Config Button
    Then user get biller dropdown and TOP biller text field

  Scenario: add TOP biller config
    Given on add TOP Biller Config Pop Up
    When user select biller test and fill TOP of this biller
    Then user get new TOP Biller Config on the top of the table list with biller test and his TOP Biller

  Scenario: display of "edit TOP biller config"
    Given on tab TOP Biller Config
    When user click edit button at the top of the list
    Then user get correct biller and TOP biller text field

  Scenario: edit TOP biller config
    Given on edit TOP Biller Config Pop Up
    When user change the TOP biller
    Then user get change on TOP this chosen biller