Feature: Transaction Menu
  As an User
  I want To See List Of Transaction
  So that i can manage and see transaction

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T183
  Scenario: Sub menu on transaction menu
    Given on sentinel dashboard
    When user click "Transaction" Menu
    Then user gets "Pending Summary", "Bulk Update", "Quarantine" and "Reversal" Sub Menu