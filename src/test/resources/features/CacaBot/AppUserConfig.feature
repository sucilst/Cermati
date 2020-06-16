Feature: App User Config Page
  As ops
  I want to config app user telegram for cacabot
  So that i can control and see the user that use cacabot

  Background: Login
    Given user open sentinel dev login page
    When user input febri as username and input password

  @TestCaseKey=BPAS-T515
  Scenario: display of app user config sub menu
    Given on cacabot menu
    When user click "app user config" sub menu
    Then user get display in accordance with wireframe

  @TestCaseKey=BPAS-T516
  Scenario: search correct user using username filter only
    Given on App User Config Sub Menu
    When user search correct user using username filter only, that is febriarikuswoyo
    Then user get correct user info: febriarikuswoyo on table

  @TestCaseKey=BPAS-T517
  Scenario: search correct user using role filter only
    Given on App User Config Sub Menu
    When user search correct user using role filter only, that is admin
    Then user get correct user info: admin on table

  @TestCaseKey=BPAS-T518
  Scenario: search correct user using all filter
    Given on App User Config Sub Menu
    When user search correct user using all filter
    Then user get correct user info on table

  @TestCaseKey=BPAS-T519
  Scenario: search incorrect or not found role filter
    Given on App User Config Sub Menu
    When user search correct user using role filter only, that is random
    Then user get "Sorry, no matching options." message on the dropdown list role filter

  @TestCaseKey=BPAS-T520
  Scenario: clear filter all filter
    Given on App User Config Sub Menu
    When user search using all filter; click clear filter button
    Then user get clean field of all this filter

  @TestCaseKey=BPAS-T524
  Scenario: add user with ops role
    Given on App User Config Sub Menu
    When user add new user with role ops
    Then new user with role ops appear on table

  @TestCaseKey=BPAS-T525
  Scenario: add user using same username with username that already exist on table
    Given on App User Config Sub Menu
    When user add new user using same username febriarikuswoyo
    Then user get warning pop up that febriarikuswoyo already exist

  @TestCaseKey=BPAS-T527
  Scenario: in add app user config, fill the dropdown with random alphabet
    Given on Add App User Config
    When user input random alphabet on role dropdown
    Then user get "Sorry, no matching options." on role dropdown list

  @TestCaseKey=BPAS-T528
  Scenario: in edit app user config, fill the dropdown with random alphabet
    Given on Edit App User Config
    When user input random alphabet on role dropdown
    Then user get "Sorry, no matching options." on role dropdown list

  @TestCaseKey=BPAS-T529
  Scenario: in add app user config, role type id dropdown appear only when partner role type has been selected
    Given on Add App User Config
    When user choose role type ops first then choose role type partner
    Then user see role type id dropdown appear

  @TestCaseKey=BPAS-T530
  Scenario: in edit app user config, role type id dropdown appear only when partner role type has been selected
    Given on Edit App User Config
    When user choose role type ops first then choose role type partner
    Then user see role type id dropdown appear

  @TestCaseKey=BPAS-T531
  Scenario: display of detail user pop up
    Given on App User Config Sub Menu
    When user click detail user button
    Then user get correct detail user pop up

  @TestCaseKey=BPAS-T532
  Scenario: display of edit app user config through detail pop up
    Given on Detail pop up
    When user click edit button on detail pop up
    Then user get correct edit app user config display

  @TestCaseKey=BPAS-T533
  Scenario: display of edit app user config
    Given on App User Config Sub Menu
    When user click edit user button
    Then user get correct edit app user config display

  @TestCaseKey=BPAS-T534
  Scenario: display of add app user config
    Given on App User Config Sub Menu
    When user click add user button
    Then user get correct add app user config display

  @TestCaseKey=BPAS-T535
  Scenario: edit user using same username with the other user on the list
    Given on Edit App User Config
    When user edit username using same username with the other user on the list febriarikuswoyo
    Then user get warning pop up that febriarikuswoyo already exist

  @TestCaseKey=BPAS-T536
  Scenario: display of delete pop up confirmation
    Given on App User Config Sub Menu
    When user click delete user button
    Then user get correct display of confirmation delete pop up

  @TestCaseKey=BPAS-T537
  Scenario: delete app user config
    Given on App User Config Sub Menu
    When user delete last user on the list
    Then user see this user that was deleted is gone