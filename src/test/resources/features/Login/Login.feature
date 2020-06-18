@UserLogin

Feature: Login
  As a user
  I want to perform login on sentinel
  So that I can see my sentinel dashboard

  Scenario: Login Success (As Admin)
    Given User open sentinel login page
    When User input kraken as username and input password
    Then User can see sentinel dashboard

  Scenario: Login Failed (Wrong Username)
    Given User open sentinel login page
    When User input kraken12 as username and input password
    Then User can see login form