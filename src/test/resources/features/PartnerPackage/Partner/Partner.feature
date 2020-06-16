Feature: Partner Tab
  As an User
  I want to see, edit and add partner
  So that i can do action above correctly

  Background: Login
    Given User open sentinel login page
    When User input febri as username and input password

  @TestCaseKey=BPAS-T146
  Scenario: Search partner using enter feature
    Given on partner package menu
    When user fill user in search box using enter feature
    Then user gets partner list contains user that are written in the search box

  @TestCaseKey=BPAS-T147
  Scenario: Search virtual account number using enter feature
    Given on partner package menu
    When user fill 1027 in search box using enter feature
    Then user gets partner list contains 1027 that are written in the search box