Feature: login sentinel dev for cacabot menu
  As User
  I want to see cacabot menu
  So that i can see cacabot menu

  Scenario: Login sentinel dev As febri (admin)
    Given user open sentinel dev login page
    When user input febri as username and input password
    Then user can see sentinel dev dashboard and logged in as febri