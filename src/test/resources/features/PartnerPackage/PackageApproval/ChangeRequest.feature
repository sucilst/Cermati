Feature: Change Request
  As an user
  I want to see list of request package approval
  So that i can accept or reject request

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T135
  Scenario: contents of status header are enabled or disabled
    Given on package approval sub menu
    When user click review button
    Then user get contents of status header are enabled or disabled

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T136
  Scenario: Contents of validation header are valid or invalid
    Given on package approval sub menu
    When user click review button
    Then user gets contents of validation header are valid or invalid