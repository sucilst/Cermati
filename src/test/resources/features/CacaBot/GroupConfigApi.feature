Feature: Group Config API
  As ops
  I want to config group telegram
  So that i can config the group of tele

  Background: Login
    Given user open sentinel dev login page
    When user input febri as username and input password

  @TestCaseKey=BPAS-T539
  Scenario: display of group config api sub menu
    Given on CacaBot Menu
    When user click "Group Config API" sub menu
    Then user get display of "Group Config API" in accordance with wireframe

  @TestCaseKey=BPAS-T540
  Scenario: search correct group using name filter only
    Given on Group Config API Sub Menu
    When user search correct group using name filter, the text is UI
    Then user get correct group info that UI on table

  @TestCaseKey=BPAS-T541
  Scenario: search correct group using role filter only
    Given on Group Config API Sub Menu
    When user search correct group using role filter, the text is ops
    Then user get correct group info that ops on table

  @TestCaseKey=BPAS-T542
  Scenario: search correct group using status filter only
    Given on Group Config API Sub Menu
    When user search correct group using status filter, the text is active
    Then user get correct group info that active on table

  @TestCaseKey=BPAS-T543
  Scenario: search correct group using all filter
    Given on Group Config API Sub Menu
    When user search correct group using all filter
    Then user get correct group info on table

  @TestCaseKey=BPAS-T544
  Scenario: search incorrect or not found role filter
    Given on Group Config API Sub Menu
    When user search incorrect role filter
    Then user get "Sorry, no matching options." message on the dropdown list this filter

  @TestCaseKey=BPAS-T545
  Scenario: check function of clear filter
    Given on Group Config API Sub Menu
    When user search group using all filter; click clear filter button
    Then user get clean field of all filter

  @TestCaseKey=BPAS-T546
  Scenario: display of role detail pop up
    Given on Group Config API Sub Menu
    When user click role detail button
    Then user get correct role detail pop up

  @TestCaseKey=BPAS-T547
  Scenario: display of group detail pop up
    Given on Group Config API Sub Menu
    When user click group detail button
    Then user get correct group detail pop up

  @TestCaseKey=BPAS-T548
  Scenario: display of edit group config api pop up
    Given on Group Config API Sub Menu
    When user click edit button
    Then user get correct edit group config api pop up

  @TestCaseKey=BPAS-T549
  Scenario: role id dropdown appear only when partner role has been selected
    Given on Edit Group Config API
    When user choose role ops first then choose role partner
    Then user see role id dropdown appear

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T550
  Scenario: edit role, role id or status for group config api
    Given on Edit Group Config API
    When user edit group change role id or status or role id and status
    Then user get success edit group

  @TestCaseKey=BPAS-T551
  Scenario: display of delete pop up confirmation of group config api
    Given on Group Config API Sub Menu
    When user click delete button on group config api sub menu
    Then user get correct display of confirmation pop up of group config api sub menu

  @manual
  @manual-result:passed
  @TestCaseKey=BPAS-T552
  Scenario: delete group telegram
    Given on Group Config API Sub Menu
    When user delete group on the list
    Then user see this group that was deleted is gone from the list