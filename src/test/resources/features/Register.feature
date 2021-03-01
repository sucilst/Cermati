@UserRegister
@sequence

Feature: Register
  As a user
  I want to register
  So that I can get on the cermati web

  Scenario Outline: Register Success
    Given User open the register page
    When User input <Email>, password, confirmation password, <First Name>, <Last Name>, <Phone Number>, and <District/City>
    Then User has registered
    Examples:
    |Email              |First Name|Last Name|Phone Number|District/City|
    |sucilst23@gmail.com|Suci      |Lestari  |081280077024|KOTA MEDAN   |