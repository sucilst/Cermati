Feature: Reversal Sub Menu
  As an User
  I want To See List Of Reversal
  So that i can see history of reversal

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T184
  Scenario: Header Title On Reversal Page is Reversal
    Given on Transaction Menu
    When user click "Reversal" Sub Menu
    Then user gets header title is "Reversal"