Feature: RC 11 Tab
  As an User
  I want To see List Pending transaction with RC11
  So that I can see list all pending trx with RC11

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T190
  Scenario: On RC 11 Tab Today - Serial# column was gone
    Given on Pending Summary Page RC 11 Tab Today
    When User click "Show detail" Button
    Then User didnt get serial# column

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T191
  Scenario: On RC 11 Tab Yesterday - Serial# column was gone
    Given on Pending Summary Page RC 11 Tab Yesterday
    When User click "Show detail" Button
    Then User didnt get serial# column

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T192
  Scenario: On RC 11 Tab Older Than Yesterday - Serial# column was gone
    Given on Pending Summary Page RC 11 Tab Older Than Yesterday
    When User click "Show detail" Button
    Then User didnt get serial# column

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T403
  Scenario: have transactions with rc 11 at 00.00 - 07.00
    Given user already have transaction with rc 11 on 00.00 - 07.00
    When user click tab today on rc 11 tab
    Then user get list of this transaction