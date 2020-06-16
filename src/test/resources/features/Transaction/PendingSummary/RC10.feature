Feature: RC 10 Tab
  As an User
  I want To see List Pending transaction with RC10
  So that I can see list all pending trx with RC10

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T187
  Scenario: On RC 10 Tab Today - Serial# column was gone
    Given on Pending Summary Page RC 10 Tab Today
    When user click "Show detail" Button
    Then user didnt get serial# column

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T188
  Scenario: On RC 10 Tab Yesterday - Serial# column was gone
    Given on Pending Summary Page RC 10 Tab Yesterday
    When user click "Show detail" Button
    Then user didnt get serial# column

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T189
  Scenario: On RC 10 Tab Older Than Yesterday - Serial# column was gone
    Given on Pending Summary Page RC 10 Tab Older Than Yesterday
    When user click "Show detail" Button
    Then user didnt get serial# column

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T402
  Scenario: have transactions with rc 10 at 00.00 - 07.00
    Given user already have transaction with rc 10 on 00.00 - 07.00
    When user click tab today on rc 10 tab
    Then user get list of that transaction