Feature: RC Biller - RC Alterra
  As a user
  I want to create filter last editing RC and show detail of last editing today, yesterday, and  three days ago
  So that  i know the last editing from user

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T400
  Scenario: display of log pop up must be the same as the Product Owner's request
    Given on Master RC Mapping sub menu; RC Biller - RC Alterra Tab
    When user click log button
    Then user get display must be the same as the Product Owner's request

  @TestCaseKey=BPAS-T401
  Scenario: the number of logs displayed is the last 5 changes in rc mapping
    Given on Master RC Mapping sub menu; RC Biller - RC Alterra Tab
    When user click log button
    Then user get 5 last change rc mapping

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T406
  Scenario: Edit RC, ensure the data you just edited is in the first row
    Given user already edit rc
    When user approves the change on rc mapping approval menu; user click log button
    Then user get detail of new change on first row

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T407
  Scenario: Edit the rest code more than 5 times, make sure the data in the log is the last 5 recent changes
    Given user already edit rc more than 5 times
    When user approves the change on rc mapping approval menu; user click log button
    Then user get 5 recent data changes