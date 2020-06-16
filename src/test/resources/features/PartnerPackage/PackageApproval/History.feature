Feature: History Package Approval
  As an user
  I want to check history of package approval
  So that i can check list history

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T137
  Scenario: Header Name of pop up after click 'Detail' is 'History Change Detail'
    Given user on tab history on package approval
    When user click "Detail" Button
    Then user gets header name of pop up is "History Change Detail"