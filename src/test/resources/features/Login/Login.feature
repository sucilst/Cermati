Feature: Login
  As a user
  I want to perform login on sentinel
  So that I can see my sentinel dashboard

  Scenario: Login As febri (admin)
    Given User open sentinel login page
    When User input febri as username and input password
    Then User can see sentinel dashboard and logged in as febri