Feature: TOP Partner Config
  As an user
  I want to config my TOP partner
  So that more easier to config TOP partner

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  Scenario: display of TOP partner config
    Given on TOP Config sub menu
    When user click tab "TOP Partner Config"
    Then user get display based on wireframe

  Scenario: display of "add TOP partner config"
    Given on tab TOP Partner Config
    When user click add TOP Partner Config Button
    Then user get partner dropdown and TOP partner text field

  Scenario: add TOP partner config
    Given on add TOP Partner Config Pop Up
    When user select partner jojonomic and fill TOP of this partner 100
    Then user get new TOP Partner Config on the top of the table list with partner jojonomic and his TOP Partner is 100

  Scenario: display of "edit TOP partner config"
    Given on tab TOP Partner Config
    When user click edit button on one of the row in the list
    Then user get correct partner and TOP partner text field

  Scenario: edit TOP partner config
    Given on edit TOP Partner Config Pop Up
    When user change the TOP partner
    Then user get change on TOP this chosen partner